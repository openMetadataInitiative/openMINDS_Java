package org.openmetadatainitiative.openminds.v3.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface CustomPropertySetRelevantFor extends Entity {
   Reference<? extends CustomPropertySetRelevantFor> getReference();

   class Deserializer extends ByTypeDeserializer<CustomPropertySetRelevantFor> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.AnalysisTechnique.class, org.openmetadatainitiative.openminds.v3.controlledTerms.StimulationApproach.class, org.openmetadatainitiative.openminds.v3.controlledTerms.StimulationTechnique.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Technique.class);
        }
    }
    
}