package org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface TissueCulturePreparationInput extends Entity {
   Reference<? extends TissueCulturePreparationInput> getReference();

   class Deserializer extends ByTypeDeserializer<TissueCulturePreparationInput> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.research.TissueSampleState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollectionState.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectGroupState.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectState.class);
        }
    }
}