package org.openmetadatainitiative.openminds.v4.stimulation.stimulus.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface EphysStimulusGeneratedBy extends Entity {
   Reference<? extends EphysStimulusGeneratedBy> getReference();

   class Deserializer extends ByTypeDeserializer<EphysStimulusGeneratedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.ephys.device.ElectrodeArrayUsage.class, org.openmetadatainitiative.openminds.v4.ephys.device.ElectrodeUsage.class, org.openmetadatainitiative.openminds.v4.ephys.device.PipetteUsage.class, org.openmetadatainitiative.openminds.v4.specimenPrep.device.SlicingDeviceUsage.class);
        }
    }
    
}