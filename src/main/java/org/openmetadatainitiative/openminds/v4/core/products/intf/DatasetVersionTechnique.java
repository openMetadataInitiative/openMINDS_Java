package org.openmetadatainitiative.openminds.v4.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface DatasetVersionTechnique extends Entity {
   Reference<? extends DatasetVersionTechnique> getReference();

   class Deserializer extends ByTypeDeserializer<DatasetVersionTechnique> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.controlledTerms.AnalysisTechnique.class, org.openmetadatainitiative.openminds.v4.controlledTerms.MRIPulseSequence.class, org.openmetadatainitiative.openminds.v4.controlledTerms.MRIWeighting.class, org.openmetadatainitiative.openminds.v4.controlledTerms.StimulationApproach.class, org.openmetadatainitiative.openminds.v4.controlledTerms.StimulationTechnique.class, org.openmetadatainitiative.openminds.v4.controlledTerms.Technique.class);
        }
    }
    
}