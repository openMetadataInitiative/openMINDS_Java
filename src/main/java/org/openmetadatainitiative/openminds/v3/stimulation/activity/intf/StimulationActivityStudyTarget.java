package org.openmetadatainitiative.openminds.v3.stimulation.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface StimulationActivityStudyTarget extends Entity {
   Reference<? extends StimulationActivityStudyTarget> getReference();

   class Deserializer extends ByTypeDeserializer<StimulationActivityStudyTarget> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.AuditoryStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalOrder.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalSex.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BreedingType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CellCultureType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Disease.class, org.openmetadatainitiative.openminds.v3.controlledTerms.DiseaseModel.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ElectricalStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.GeneticStrainType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.GustatoryStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Handedness.class, org.openmetadatainitiative.openminds.v3.controlledTerms.MolecularEntity.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OlfactoryStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OpticalStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OrganismSubstance.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OrganismSystem.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Species.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SubcellularEntity.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TactileStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TermSuggestion.class, org.openmetadatainitiative.openminds.v3.controlledTerms.UBERONParcellation.class, org.openmetadatainitiative.openminds.v3.controlledTerms.VisualStimulusType.class, org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.CustomAnatomicalEntity.class, org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntity.class, org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntityVersion.class);
        }
    }
    
}