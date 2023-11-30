package org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface SlicingDeviceDigitalIdentifier extends Entity {
   Reference<? extends SlicingDeviceDigitalIdentifier> getReference();

   class Deserializer extends ByTypeDeserializer<SlicingDeviceDigitalIdentifier> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.RRID.class);
        }
    }
    
}