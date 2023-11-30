package org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface BrainAtlasVersionFullDocumentation extends Entity {
   Reference<? extends BrainAtlasVersionFullDocumentation> getReference();

   class Deserializer extends ByTypeDeserializer<BrainAtlasVersionFullDocumentation> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.WebResource.class);
        }
    }
    
}