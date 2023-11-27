package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.data.ContentType;


import static org.openmetadatainitiative.openminds.v3.core.data.ContentTypePattern.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentTypePattern extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ContentTypePattern";

    @JsonIgnore
    public Reference<ContentTypePattern> getReference() {
        return doGetReference();
    }

    public static Reference<ContentTypePattern> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ContentTypePattern(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ContentTypePattern>{
        
        public Builder contentType(Reference<ContentType> contentType) { ContentTypePattern.this.contentType = contentType; return this; }
        
        public Builder lookupLabel(String lookupLabel) { ContentTypePattern.this.lookupLabel = lookupLabel; return this; }
        
        public Builder regex(String regex) { ContentTypePattern.this.regex = regex; return this; }
        

        public ContentTypePattern build(OpenMINDSContext context) {
            if (ContentTypePattern.this.id == null) {
                ContentTypePattern.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            ContentTypePattern.this.atType = SEMANTIC_NAME;
            return ContentTypePattern.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contentType")
    private Reference<ContentType> contentType;
    
    public Reference<ContentType> getContentType() {
       return this.contentType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/regex")
    private String regex;
    
    public String getRegex() {
       return this.regex;
    }

 
    public static ContentTypePattern.Builder create(LocalId localId){
        return new ContentTypePattern(localId).new Builder();
    }

    public ContentTypePattern.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ContentTypePattern.class).new Builder();
    }
}