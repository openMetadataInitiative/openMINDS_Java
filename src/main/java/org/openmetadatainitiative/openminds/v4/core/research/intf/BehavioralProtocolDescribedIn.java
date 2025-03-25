package org.openmetadatainitiative.openminds.v4.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface BehavioralProtocolDescribedIn extends Entity {
   Reference<? extends BehavioralProtocolDescribedIn> getReference();

   class Deserializer extends ByTypeDeserializer<BehavioralProtocolDescribedIn> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.v4.core.data.File.class, org.openmetadatainitiative.openminds.v4.core.miscellaneous.WebResource.class);
        }
    }
    
}