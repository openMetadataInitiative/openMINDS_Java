package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonSerialize(using = InstanceId.Serializer.class)
@JsonDeserialize(using = InstanceId.Deserializer.class)
public record InstanceId(String instanceId) {

    public static InstanceId withPrefix(String id, String prefix){
        return id!=null ? prefix != null ? new InstanceId(prefix+id) : new InstanceId(id) : null;

    }

    static class Serializer extends JsonSerializer<InstanceId> {
        @Override
        public void serialize(InstanceId instanceId, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (instanceId.instanceId != null) {
                jsonGenerator.writeString(instanceId.instanceId);
            } else {
                jsonGenerator.writeNull();
            }

        }
    }

    static class Deserializer extends JsonDeserializer<InstanceId> {
        @Override
        public InstanceId deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
            final String value = jsonParser.getText();
            if (value != null) {
                return new InstanceId(value);
            }
            return null;
        }
    }

}
