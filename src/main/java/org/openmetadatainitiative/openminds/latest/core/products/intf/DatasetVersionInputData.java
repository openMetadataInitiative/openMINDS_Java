package org.openmetadatainitiative.openminds.latest.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface DatasetVersionInputData extends Entity {
   Reference<? extends DatasetVersionInputData> getReference();

   class Deserializer extends ByTypeDeserializer<DatasetVersionInputData> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.data.FileBundle.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.WebResource.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlas.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlasVersion.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpace.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpaceVersion.class);
        }
    }
}