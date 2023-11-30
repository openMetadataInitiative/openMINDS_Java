package org.openmetadatainitiative.openminds.latest.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface SoftwareVersionDigitalIdentifier extends Entity {
   Reference<? extends SoftwareVersionDigitalIdentifier> getReference();

   class Deserializer extends ByTypeDeserializer<SoftwareVersionDigitalIdentifier> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.SWHID.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.RRID.class);
        }
    }
    
}