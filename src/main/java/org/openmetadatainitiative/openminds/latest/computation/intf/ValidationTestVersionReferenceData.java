package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ValidationTestVersionReferenceData extends Entity {
   Reference<? extends ValidationTestVersionReferenceData> getReference();

   class Deserializer extends ByTypeDeserializer<ValidationTestVersionReferenceData> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.data.FileBundle.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.WebResource.class);
        }
    }
    
}