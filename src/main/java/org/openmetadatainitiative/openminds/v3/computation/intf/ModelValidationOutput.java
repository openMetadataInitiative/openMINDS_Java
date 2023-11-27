package org.openmetadatainitiative.openminds.v3.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ModelValidationOutput extends Entity {
   Reference<? extends ModelValidationOutput> getReference();

   class Deserializer extends ByTypeDeserializer<ModelValidationOutput> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.computation.LocalFile.class, org.openmetadatainitiative.openminds.v3.core.data.File.class, org.openmetadatainitiative.openminds.v3.core.data.FileBundle.class);
        }
    }
}