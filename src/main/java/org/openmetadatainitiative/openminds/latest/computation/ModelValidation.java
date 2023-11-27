package org.openmetadatainitiative.openminds.latest.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.computation.LaunchConfiguration;
import org.openmetadatainitiative.openminds.latest.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationEnvironment;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationInput;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationOutput;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationPerformedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationResourceUsage;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationStartedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationStudyTarget;
import org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationWasInformedBy;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.latest.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.latest.computation.ModelValidation.SEMANTIC_NAME;
/**
 * Structured information about a process of validating a computational model.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelValidation extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationWasInformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/ModelValidation";

    @JsonIgnore
    public Reference<ModelValidation> getReference() {
        return doGetReference();
    }

    public static Reference<ModelValidation> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ModelValidation(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ModelValidation>{
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { ModelValidation.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { ModelValidation.this.description = description; return this; }
        
        public Builder endTime(String endTime) { ModelValidation.this.endTime = endTime; return this; }
        
        public Builder environment(Reference<? extends ModelValidationEnvironment> environment) { ModelValidation.this.environment = environment; return this; }
        
        public Builder input(List<Reference<? extends ModelValidationInput>> input) { ModelValidation.this.input = input; return this; }
        
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { ModelValidation.this.launchConfiguration = launchConfiguration; return this; }
        
        public Builder lookupLabel(String lookupLabel) { ModelValidation.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends ModelValidationOutput>> output) { ModelValidation.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends ModelValidationPerformedBy>> performedBy) { ModelValidation.this.performedBy = performedBy; return this; }
        
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { ModelValidation.this.recipe = recipe; return this; }
        
        public Builder resourceUsage(List<? extends ModelValidationResourceUsage> resourceUsage) { ModelValidation.this.resourceUsage = resourceUsage; return this; }
        
        public Builder score(Object score) { ModelValidation.this.score = score; return this; }
        
        public Builder startTime(String startTime) { ModelValidation.this.startTime = startTime; return this; }
        
        public Builder startedBy(Reference<? extends ModelValidationStartedBy> startedBy) { ModelValidation.this.startedBy = startedBy; return this; }
        
        public Builder status(Reference<ActionStatusType> status) { ModelValidation.this.status = status; return this; }
        
        public Builder studyTarget(List<Reference<? extends ModelValidationStudyTarget>> studyTarget) { ModelValidation.this.studyTarget = studyTarget; return this; }
        
        public Builder tag(List<String> tag) { ModelValidation.this.tag = tag; return this; }
        
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { ModelValidation.this.technique = technique; return this; }
        
        public Builder wasInformedBy(Reference<? extends ModelValidationWasInformedBy> wasInformedBy) { ModelValidation.this.wasInformedBy = wasInformedBy; return this; }
        

        public ModelValidation build() {
            if (ModelValidation.this.id == null) {
                ModelValidation.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ModelValidation.this.types == null || ModelValidation.this.types.isEmpty() || !ModelValidation.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ModelValidation.this.types;
                ModelValidation.this.types = new ArrayList<>();
                ModelValidation.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ModelValidation.this.types.addAll(oldValues);
                }
            }
            return ModelValidation.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/customPropertySet")
    private List<CustomPropertySet> customPropertySet;
    
    public List<CustomPropertySet> getCustomPropertySet() {
       return this.customPropertySet;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/endTime")
    private String endTime;
    
    public String getEndTime() {
       return this.endTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/environment")
    private Reference<? extends ModelValidationEnvironment> environment;
    
    public Reference<? extends ModelValidationEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends ModelValidationInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends ModelValidationInput>> getInput() {
       return this.input;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/launchConfiguration")
    private Reference<LaunchConfiguration> launchConfiguration;
    
    public Reference<LaunchConfiguration> getLaunchConfiguration() {
       return this.launchConfiguration;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/output")
    private List<Reference<? extends ModelValidationOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends ModelValidationOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends ModelValidationPerformedBy>> performedBy;
    
    public List<Reference<? extends ModelValidationPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends ModelValidationResourceUsage> resourceUsage;
    
    public List<? extends ModelValidationResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/score")
    private Object score;
    
    public Object getScore() {
       return this.score;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends ModelValidationStartedBy> startedBy;
    
    public Reference<? extends ModelValidationStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends ModelValidationStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends ModelValidationStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/tag")
    private List<String> tag;
    
    public List<String> getTag() {
       return this.tag;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/technique")
    private List<Reference<AnalysisTechnique>> technique;
    
    /**
    * Method of accomplishing a desired aim.
    */
    public List<Reference<AnalysisTechnique>> getTechnique() {
       return this.technique;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/wasInformedBy")
    private Reference<? extends ModelValidationWasInformedBy> wasInformedBy;
    
    public Reference<? extends ModelValidationWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 
    public static ModelValidation.Builder create(LocalId localId){
        return new ModelValidation(localId).new Builder();
    }

    public ModelValidation.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ModelValidation.class).new Builder();
    }
}