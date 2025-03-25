package org.openmetadatainitiative.openminds.v4.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ElectrodeArrayDigitalIdentifier extends Entity {
   Reference<? extends ElectrodeArrayDigitalIdentifier> getReference();

   class Deserializer extends ByTypeDeserializer<ElectrodeArrayDigitalIdentifier> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.RRID.class);
        }
    }
    
}