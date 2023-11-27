package org.openmetadatainitiative.openminds.v3.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.computation.LaunchConfiguration;
import org.openmetadatainitiative.openminds.v3.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationEnvironment;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationInput;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationOutput;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationPerformedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationResourceUsage;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationStartedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationStudyTarget;
import org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationWasInformedBy;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.v3.computation.GenericComputation.SEMANTIC_NAME;
/**
 * Structured information about a computation whose type is unknown or unspecified.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericComputation extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationWasInformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/GenericComputation";

    @JsonIgnore
    public Reference<GenericComputation> getReference() {
        return doGetReference();
    }

    public static Reference<GenericComputation> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private GenericComputation(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<GenericComputation>{
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { GenericComputation.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { GenericComputation.this.description = description; return this; }
        
        public Builder endTime(String endTime) { GenericComputation.this.endTime = endTime; return this; }
        
        public Builder environment(Reference<? extends GenericComputationEnvironment> environment) { GenericComputation.this.environment = environment; return this; }
        
        public Builder input(List<Reference<? extends GenericComputationInput>> input) { GenericComputation.this.input = input; return this; }
        
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { GenericComputation.this.launchConfiguration = launchConfiguration; return this; }
        
        public Builder lookupLabel(String lookupLabel) { GenericComputation.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends GenericComputationOutput>> output) { GenericComputation.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends GenericComputationPerformedBy>> performedBy) { GenericComputation.this.performedBy = performedBy; return this; }
        
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { GenericComputation.this.recipe = recipe; return this; }
        
        public Builder resourceUsage(List<? extends GenericComputationResourceUsage> resourceUsage) { GenericComputation.this.resourceUsage = resourceUsage; return this; }
        
        public Builder startTime(String startTime) { GenericComputation.this.startTime = startTime; return this; }
        
        public Builder startedBy(Reference<? extends GenericComputationStartedBy> startedBy) { GenericComputation.this.startedBy = startedBy; return this; }
        
        public Builder status(Reference<ActionStatusType> status) { GenericComputation.this.status = status; return this; }
        
        public Builder studyTarget(List<Reference<? extends GenericComputationStudyTarget>> studyTarget) { GenericComputation.this.studyTarget = studyTarget; return this; }
        
        public Builder tag(List<String> tag) { GenericComputation.this.tag = tag; return this; }
        
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { GenericComputation.this.technique = technique; return this; }
        
        public Builder wasInformedBy(Reference<? extends GenericComputationWasInformedBy> wasInformedBy) { GenericComputation.this.wasInformedBy = wasInformedBy; return this; }
        

        public GenericComputation build(OpenMINDSContext context) {
            if (GenericComputation.this.id == null) {
                GenericComputation.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            GenericComputation.this.atType = SEMANTIC_NAME;
            return GenericComputation.this;
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
    private Reference<? extends GenericComputationEnvironment> environment;
    
    public Reference<? extends GenericComputationEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends GenericComputationInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends GenericComputationInput>> getInput() {
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
    private List<Reference<? extends GenericComputationOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends GenericComputationOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends GenericComputationPerformedBy>> performedBy;
    
    public List<Reference<? extends GenericComputationPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends GenericComputationResourceUsage> resourceUsage;
    
    public List<? extends GenericComputationResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends GenericComputationStartedBy> startedBy;
    
    public Reference<? extends GenericComputationStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends GenericComputationStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends GenericComputationStudyTarget>> getStudyTarget() {
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
    private Reference<? extends GenericComputationWasInformedBy> wasInformedBy;
    
    public Reference<? extends GenericComputationWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 
    public static GenericComputation.Builder create(LocalId localId){
        return new GenericComputation(localId).new Builder();
    }

    public GenericComputation.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, GenericComputation.class).new Builder();
    }
}