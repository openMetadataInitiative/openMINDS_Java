package org.openmetadatainitiative.openminds.v4.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface PipetteUsageUsedSpecimen extends Entity {
   Reference<? extends PipetteUsageUsedSpecimen> getReference();

   class Deserializer extends ByTypeDeserializer<PipetteUsageUsedSpecimen> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.research.SubjectState.class, org.openmetadatainitiative.openminds.v4.core.research.TissueSampleState.class);
        }
    }
    
}