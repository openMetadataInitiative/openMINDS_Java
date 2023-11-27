package org.openmetadatainitiative.openminds.v3.SANDS.nonatlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.CustomAnnotation;
import org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnatomicalEntityRelatedUBERONTerm;
import org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnatomicalEntityRelationAssessment;


import static org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.CustomAnatomicalEntity.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomAnatomicalEntity extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageAnatomicalLocationOfArray, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageAnatomicalLocationOfElectrodes, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeUsageAnatomicalLocation, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteUsageAnatomicalLocation, org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.QualitativeRelationAssessmentInRelationTo, org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.AnatomicalTargetPositionAnatomicalTarget, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionStudyTarget, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleAnatomicalLocation, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionAnatomicalLocation, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelStudyTarget, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionStudyTarget, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationStudyTarget, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityStudyTarget{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/CustomAnatomicalEntity";

    @JsonIgnore
    public Reference<CustomAnatomicalEntity> getReference() {
        return doGetReference();
    }

    public static Reference<CustomAnatomicalEntity> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private CustomAnatomicalEntity(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CustomAnatomicalEntity>{
        
        public Builder hasAnnotation(List<CustomAnnotation> hasAnnotation) { CustomAnatomicalEntity.this.hasAnnotation = hasAnnotation; return this; }
        
        public Builder name(String name) { CustomAnatomicalEntity.this.name = name; return this; }
        
        public Builder relatedUBERONTerm(Reference<? extends CustomAnatomicalEntityRelatedUBERONTerm> relatedUBERONTerm) { CustomAnatomicalEntity.this.relatedUBERONTerm = relatedUBERONTerm; return this; }
        
        public Builder relationAssessment(List<? extends CustomAnatomicalEntityRelationAssessment> relationAssessment) { CustomAnatomicalEntity.this.relationAssessment = relationAssessment; return this; }
        

        public CustomAnatomicalEntity build(OpenMINDSContext context) {
            if (CustomAnatomicalEntity.this.id == null) {
                CustomAnatomicalEntity.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            CustomAnatomicalEntity.this.atType = SEMANTIC_NAME;
            return CustomAnatomicalEntity.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasAnnotation")
    private List<CustomAnnotation> hasAnnotation;
    
    public List<CustomAnnotation> getHasAnnotation() {
       return this.hasAnnotation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedUBERONTerm")
    private Reference<? extends CustomAnatomicalEntityRelatedUBERONTerm> relatedUBERONTerm;
    
    public Reference<? extends CustomAnatomicalEntityRelatedUBERONTerm> getRelatedUBERONTerm() {
       return this.relatedUBERONTerm;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relationAssessment")
    private List<? extends CustomAnatomicalEntityRelationAssessment> relationAssessment;
    
    public List<? extends CustomAnatomicalEntityRelationAssessment> getRelationAssessment() {
       return this.relationAssessment;
    }

 
    public static CustomAnatomicalEntity.Builder create(LocalId localId){
        return new CustomAnatomicalEntity(localId).new Builder();
    }

    public CustomAnatomicalEntity.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CustomAnatomicalEntity.class).new Builder();
    }
}