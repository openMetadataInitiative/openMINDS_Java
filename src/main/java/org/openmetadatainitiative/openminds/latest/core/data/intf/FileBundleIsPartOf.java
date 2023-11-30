package org.openmetadatainitiative.openminds.latest.core.data.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface FileBundleIsPartOf extends Entity {
   Reference<? extends FileBundleIsPartOf> getReference();

   class Deserializer extends ByTypeDeserializer<FileBundleIsPartOf> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.data.FileBundle.class, org.openmetadatainitiative.openminds.latest.core.data.FileRepository.class);
        }
    }
    
}