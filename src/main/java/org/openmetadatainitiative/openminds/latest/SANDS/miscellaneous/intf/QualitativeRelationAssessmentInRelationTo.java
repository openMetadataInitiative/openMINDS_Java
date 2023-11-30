package org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface QualitativeRelationAssessmentInRelationTo extends Entity {
   Reference<? extends QualitativeRelationAssessmentInRelationTo> getReference();

   class Deserializer extends ByTypeDeserializer<QualitativeRelationAssessmentInRelationTo> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.CustomAnatomicalEntity.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntity.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntityVersion.class);
        }
    }
    
}