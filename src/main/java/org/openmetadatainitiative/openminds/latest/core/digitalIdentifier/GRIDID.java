package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.GRIDID.SEMANTIC_NAME;
/**
 * A GRID (Global Research Identifier Database) identifier.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GRIDID extends Instance implements org.openmetadatainitiative.openminds.latest.core.actors.intf.OrganizationDigitalIdentifier{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/GRIDID";

    @JsonIgnore
    public Reference<GRIDID> getReference() {
        return doGetReference();
    }

    public static Reference<GRIDID> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private GRIDID(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<GRIDID>{
        
        public Builder identifier(String identifier) { GRIDID.this.identifier = identifier; return this; }
        

        public GRIDID build(OpenMINDSContext context) {
            if (GRIDID.this.id == null) {
                GRIDID.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            GRIDID.this.atType = SEMANTIC_NAME;
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