package org.openmetadatainitiative.openminds.v3.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.SWHID.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SWHID extends Instance implements org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionDigitalIdentifier{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/SWHID";

    @JsonIgnore
    public Reference<SWHID> getReference() {
        return doGetReference();
    }

    public static Reference<SWHID> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private SWHID(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SWHID>{
        
        public Builder identifier(String identifier) { SWHID.this.identifier = identifier; return this; }
        

        public SWHID build(OpenMINDSContext context) {
            if (SWHID.this.id == null) {
                SWHID.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            SWHID.this.type = SEMANTIC_NAME;
            return SWHID.this;
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

 
    public static SWHID.Builder create(LocalId localId){
        return new SWHID(localId).new Builder();
    }

    public SWHID.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SWHID.class).new Builder();
    }
}