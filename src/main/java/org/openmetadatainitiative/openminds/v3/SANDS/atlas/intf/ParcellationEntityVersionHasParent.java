package org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ParcellationEntityVersionHasParent extends Entity {
   Reference<? extends ParcellationEntityVersionHasParent> getReference();

   class Deserializer extends ByTypeDeserializer<ParcellationEntityVersionHasParent> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntity.class, org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntityVersion.class);
        }
    }
}