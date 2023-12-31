package org.openmetadatainitiative.openminds.latest.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ProtocolExecutionInput extends Entity {
   Reference<? extends ProtocolExecutionInput> getReference();

   class Deserializer extends ByTypeDeserializer<ProtocolExecutionInput> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.data.FileBundle.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectGroupState.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollectionState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleState.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlasVersion.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpaceVersion.class);
        }
    }
    
}