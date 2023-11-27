package org.openmetadatainitiative.openminds.latest.ephys.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface RecordingActivityInput extends Entity {
   Reference<? extends RecordingActivityInput> getReference();

   class Deserializer extends ByTypeDeserializer<RecordingActivityInput> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.research.SubjectGroupState.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollectionState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleState.class);
        }
    }
}