package org.openmetadatainitiative.openminds.latest.ephys.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface CellPatchingDevice extends Entity {
   Reference<? extends CellPatchingDevice> getReference();

   class Deserializer extends ByTypeDeserializer<CellPatchingDevice> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.ephys.device.ElectrodeArrayUsage.class, org.openmetadatainitiative.openminds.latest.ephys.device.ElectrodeUsage.class, org.openmetadatainitiative.openminds.latest.ephys.device.PipetteUsage.class, org.openmetadatainitiative.openminds.latest.specimenPrep.device.SlicingDeviceUsage.class);
        }
    }
    
}