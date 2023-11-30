package org.openmetadatainitiative.openminds.latest.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface SoftwareVersionFullDocumentation extends Entity {
   Reference<? extends SoftwareVersionFullDocumentation> getReference();

   class Deserializer extends ByTypeDeserializer<SoftwareVersionFullDocumentation> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.WebResource.class);
        }
    }
    
}