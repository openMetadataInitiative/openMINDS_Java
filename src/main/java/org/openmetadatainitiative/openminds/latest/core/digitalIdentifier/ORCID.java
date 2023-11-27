package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ORCID.*;
/**
 * A persistent identifier for a researcher provided by Open Researcher and Contributor ID, Inc.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ORCID extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ORCID";

    @JsonIgnore
    public Reference<ORCID> getReference() {
        return doGetReference();
    }

    public static Reference<ORCID> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ORCID(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ORCID>{
        
        public Builder identifier(String identifier) { ORCID.this.identifier = identifier; return this; }
        

        public ORCID build() {
            if (ORCID.this.id == null) {
                ORCID.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ORCID.this.types == null || ORCID.this.types.isEmpty() || !ORCID.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ORCID.this.types;
                ORCID.this.types = new ArrayList<>();
                ORCID.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ORCID.this.types.addAll(oldValues);
                }
            }
            return ORCID.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

 
    public static ORCID.Builder create(LocalId localId){
        return new ORCID(localId).new Builder();
    }

    public ORCID.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ORCID.class).new Builder();
    }
}