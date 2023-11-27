package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public abstract class ByTypeDeserializer<T extends Entity> extends JsonDeserializer<T> {

    private final Class<? extends T>[] subTypes;

    public ByTypeDeserializer(Class<? extends T>... subTypes) {
        this.subTypes = subTypes;
    }

    private T map(JsonNode root, ObjectMapper mapper, Iterable<JsonNode> nodes) throws JsonProcessingException {
        for (JsonNode type : nodes) {
            if (type != null) {
                final String typeString = type.asText();
                if (typeString != null) {
                    final Optional<Class<? extends T>> first = Arrays.stream(this.subTypes).filter(t -> {
                        final InstanceType annotation = t.getAnnotation(InstanceType.class);
                        if(annotation == null || annotation.value() == null){
                            throw new RuntimeException("Type {} was mapped as a subtype but doesn't provide the @InstanceType annotation!");
                        }
                        return typeString.equals(annotation.value());
                }).findFirst();
                    if (first.isPresent()) {
                        return mapper.treeToValue(root, first.get());
                    }
                }
            }
        }
        return null;
    }

    @Override
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
        final JsonNode root = mapper.readTree(jsonParser);
        final JsonNode typeNode = root.get("@type");
        if( typeNode.isTextual()){
            return map(root, mapper, Collections.singleton(typeNode));
        }
        if (typeNode.isArray()) {
            return map(root, mapper, typeNode);
        }
        return null;
    }
}