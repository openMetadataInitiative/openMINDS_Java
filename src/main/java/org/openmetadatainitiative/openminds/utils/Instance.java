package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Instance implements Entity{

    @JsonProperty("@id")
    protected InstanceId id;

    @JsonProperty("@type")
    @JsonDeserialize(using = TypeDeserializer.class)
    protected String type;

    @JsonIgnore
    private final LocalId localId;

    public Instance(LocalId localId) {
        this.localId = localId;
    }

    @JsonIgnore
    public LocalId getLocalId() {
        return localId;
    }

    public InstanceId getId(){
        return id;
    }
    protected  <T extends Instance> Reference<T> doGetReference(){
        return new Reference<>(getId());
    }

    class TypeDeserializer extends JsonDeserializer<String> {

        @Override
        public String deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
            JsonNode node = jsonParser.readValueAsTree();
            if(node.isArray()){
                JsonNode firstType = null;
                for (JsonNode type : node) {
                    if(firstType == null){
                        firstType = type;
                    }
                    if(type.isTextual()){
                        final String value = type.asText();
                        if(value.startsWith("https://openminds.ebrains.eu/")){
                            return value;
                        }
                    }
                }
                return firstType != null && firstType.isTextual() ? firstType.asText() : null;
            } else if (node.isTextual()) {
                return node.asText();
            }
            return null;
        }

    }

}
