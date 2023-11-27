package org.openmetadatainitiative.openminds.v3.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.GRIDID.SEMANTIC_NAME;
/**
 * A GRID (Global Research Identifier Database) identifier.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GRIDID extends Instance implements org.openmetadatainitiative.openminds.v3.core.actors.intf.OrganizationDigitalIdentifier{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/GRIDID";

    @JsonIgnore
    public Reference<GRIDID> getReference() {
        return doGetReference();
    }

    public static Reference<GRIDID> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private GRIDID(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<GRIDID>{
        
        public Builder identifier(String identifier) { GRIDID.this.identifier = identifier; return this; }
        

        public GRIDID build() {
            if (GRIDID.this.id == null) {
                GRIDID.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(GRIDID.this.types == null || GRIDID.this.types.isEmpty() || !GRIDID.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = GRIDID.this.types;
                GRIDID.this.types = new ArrayList<>();
                GRIDID.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    GRIDID.this.types.addAll(oldValues);
                }
            }
            return GRIDID.this;
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

 
    public static GRIDID.Builder create(LocalId localId){
        return new GRIDID(localId).new Builder();
    }

    public GRIDID.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, GRIDID.class).new Builder();
    }
}