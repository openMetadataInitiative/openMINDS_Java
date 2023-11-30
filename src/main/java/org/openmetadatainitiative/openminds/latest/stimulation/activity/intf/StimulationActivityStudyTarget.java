package org.openmetadatainitiative.openminds.latest.stimulation.activity.intf;

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
            super(org.openmetadatainitiative.openminds.latest.controlledTerms.AuditoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalOrder.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalSex.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BreedingType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CellCultureType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Disease.class, org.openmetadatainitiative.openminds.latest.controlledTerms.DiseaseModel.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ElectricalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GeneticStrainType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GustatoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Handedness.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OlfactoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OpticalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OrganismSubstance.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OrganismSystem.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Species.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SubcellularEntity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TactileStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TermSuggestion.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TissueSampleType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.UBERONParcellation.class, org.openmetadatainitiative.openminds.latest.controlledTerms.VisualStimulusType.class, org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.CustomAnatomicalEntity.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntity.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntityVersion.class);
        }
    }
    
}