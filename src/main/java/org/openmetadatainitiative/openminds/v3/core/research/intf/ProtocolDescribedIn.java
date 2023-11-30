package org.openmetadatainitiative.openminds.v3.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ProtocolDescribedIn extends Entity {
   Reference<? extends ProtocolDescribedIn> getReference();

   class Deserializer extends ByTypeDeserializer<ProtocolDescribedIn> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.v3.core.data.File.class, org.openmetadatainitiative.openminds.v3.core.miscellaneous.WebResource.class);
        }
    }
    
}