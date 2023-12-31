package org.openmetadatainitiative.openminds.v3.core.data.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface MeasurementMeasuredWith extends Entity {
   Reference<? extends MeasurementMeasuredWith> getReference();

   class Deserializer extends ByTypeDeserializer<MeasurementMeasuredWith> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.ephys.device.ElectrodeArrayUsage.class, org.openmetadatainitiative.openminds.v3.ephys.device.ElectrodeUsage.class, org.openmetadatainitiative.openminds.v3.ephys.device.PipetteUsage.class, org.openmetadatainitiative.openminds.v3.specimenPrep.device.SlicingDeviceUsage.class);
        }
    }
    
}