package org.openmetadatainitiative.openminds.latest.core.data.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface FileBundleGroupedBy extends Entity {
   Reference<? extends FileBundleGroupedBy> getReference();

   class Deserializer extends ByTypeDeserializer<FileBundleGroupedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.computation.LocalFile.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnalysisTechnique.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AuditoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalOrder.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalSex.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BreedingType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CellCultureType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Disease.class, org.openmetadatainitiative.openminds.latest.controlledTerms.DiseaseModel.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ElectricalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GeneticStrainType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GustatoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Handedness.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MRIPulseSequence.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MRIWeighting.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OlfactoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OpticalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OrganismSubstance.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OrganismSystem.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Species.class, org.openmetadatainitiative.openminds.latest.controlledTerms.StimulationApproach.class, org.openmetadatainitiative.openminds.latest.controlledTerms.StimulationTechnique.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SubcellularEntity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TactileStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Technique.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TermSuggestion.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TissueSampleType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.UBERONParcellation.class, org.openmetadatainitiative.openminds.latest.controlledTerms.VisualStimulusType.class, org.openmetadatainitiative.openminds.latest.core.research.BehavioralProtocol.class, org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.data.FileBundle.class, org.openmetadatainitiative.openminds.latest.core.research.Subject.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectGroup.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectGroupState.class, org.openmetadatainitiative.openminds.latest.core.research.SubjectState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSample.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollection.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollectionState.class, org.openmetadatainitiative.openminds.latest.core.research.TissueSampleState.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpace.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpaceVersion.class, org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.CustomAnatomicalEntity.class, org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.CustomCoordinateSpace.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntity.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntityVersion.class);
        }
    }
    
}