package org.openmetadatainitiative.openminds.v4.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface SetupHasPart extends Entity {
   Reference<? extends SetupHasPart> getReference();

   class Deserializer extends ByTypeDeserializer<SetupHasPart> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.products.Setup.class, org.openmetadatainitiative.openminds.v4.core.products.SoftwareVersion.class, org.openmetadatainitiative.openminds.v4.ephys.device.Electrode.class, org.openmetadatainitiative.openminds.v4.ephys.device.ElectrodeArray.class, org.openmetadatainitiative.openminds.v4.ephys.device.Pipette.class, org.openmetadatainitiative.openminds.v4.specimenPrep.device.SlicingDevice.class);
        }
    }
    
}