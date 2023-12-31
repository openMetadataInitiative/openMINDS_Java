package org.openmetadatainitiative.openminds.latest.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface BehavioralProtocolStimulation extends Entity {
   Reference<? extends BehavioralProtocolStimulation> getReference();

   class Deserializer extends ByTypeDeserializer<BehavioralProtocolStimulation> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.controlledTerms.StimulationApproach.class, org.openmetadatainitiative.openminds.latest.controlledTerms.StimulationTechnique.class);
        }
    }
    
}