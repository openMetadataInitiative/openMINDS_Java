package org.openmetadatainitiative.openminds.v3.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface PipetteUsageLabelingCompound extends Entity {
   Reference<? extends PipetteUsageLabelingCompound> getReference();

   class Deserializer extends ByTypeDeserializer<PipetteUsageLabelingCompound> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.chemicals.ChemicalMixture.class, org.openmetadatainitiative.openminds.v3.chemicals.ChemicalSubstance.class, org.openmetadatainitiative.openminds.v3.controlledTerms.MolecularEntity.class);
        }
    }
    
}