package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonSerialize(using = LocalId.Serializer.class)
@JsonDeserialize(using = LocalId.Deserializer.class)
public record LocalId(String id) {

    static class Serializer extends JsonSerializer<LocalId> {
        @Override
        public void serialize(LocalId localId, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (localId.id != null) {
                jsonGenerator.writeString("_:"+localId.id);
            } else {
                jsonGenerator.writeNull();
            }

        }
    }

    static class Deserializer extends JsonDeserializer<LocalId> {
        @Override
        public LocalId deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            final String value = jsonParser.getText();
            if (value != null && value.startsWith("_:")) {
                return new LocalId(value.substring(2));
            }
            return null;
        }
    }
}
