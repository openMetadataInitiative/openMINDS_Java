package org.openmetadatainitiative.openminds.v3.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.RRID.SEMANTIC_NAME;
/**
 * A persistent identifier for a research resource provided by the Resource Identification Initiative.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RRID extends Instance implements org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeDigitalIdentifier, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayDigitalIdentifier, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.actors.intf.OrganizationDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceDigitalIdentifier{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/RRID";

    @JsonIgnore
    public Reference<RRID> getReference() {
        return doGetReference();
    }

    public static Reference<RRID> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private RRID(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<RRID>{
        
        public Builder identifier(String identifier) { RRID.this.identifier = identifier; return this; }
        

        public RRID build(OpenMINDSContext context) {
            if (RRID.this.id == null) {
                RRID.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            RRID.this.type = SEMANTIC_NAME;
            return RRID.this;
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

 
    public static RRID.Builder create(LocalId localId){
        return new RRID(localId).new Builder();
    }

    public RRID.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, RRID.class).new Builder();
    }
}