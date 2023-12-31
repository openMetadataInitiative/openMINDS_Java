package org.openmetadatainitiative.openminds.v3.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface TissueSampleCollectionOrigin extends Entity {
   Reference<? extends TissueSampleCollectionOrigin> getReference();

   class Deserializer extends ByTypeDeserializer<TissueSampleCollectionOrigin> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OrganismSubstance.class);
        }
    }
    
}