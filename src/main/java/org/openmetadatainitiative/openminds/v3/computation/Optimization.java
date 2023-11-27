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
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationEnvironment;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationInput;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationOutput;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationPerformedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationResourceUsage;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationStartedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationStudyTarget;
import org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationWasInformedBy;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.v3.computation.Optimization.SEMANTIC_NAME;
/**
 * Structured information about a process of optimizing a model or a piece of code.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Optimization extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationWasInformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/Optimization";

    @JsonIgnore
    public Reference<Optimization> getReference() {
        return doGetReference();
    }

    public static Reference<Optimization> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private Optimization(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Optimization>{
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { Optimization.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { Optimization.this.description = description; return this; }
        
        public Builder endTime(String endTime) { Optimization.this.endTime = endTime; return this; }
        
        public Builder environment(Reference<? extends OptimizationEnvironment> environment) { Optimization.this.environment = environment; return this; }
        
        public Builder input(List<Reference<? extends OptimizationInput>> input) { Optimization.this.input = input; return this; }
        
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { Optimization.this.launchConfiguration = launchConfiguration; return this; }
        
        public Builder lookupLabel(String lookupLabel) { Optimization.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends OptimizationOutput>> output) { Optimization.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends OptimizationPerformedBy>> performedBy) { Optimization.this.performedBy = performedBy; return this; }
        
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { Optimization.this.recipe = recipe; return this; }
        
        public Builder resourceUsage(List<? extends OptimizationResourceUsage> resourceUsage) { Optimization.this.resourceUsage = resourceUsage; return this; }
        
        public Builder startTime(String startTime) { Optimization.this.startTime = startTime; return this; }
        
        public Builder startedBy(Reference<? extends OptimizationStartedBy> startedBy) { Optimization.this.startedBy = startedBy; return this; }
        
        public Builder status(Reference<ActionStatusType> status) { Optimization.this.status = status; return this; }
        
        public Builder studyTarget(List<Reference<? extends OptimizationStudyTarget>> studyTarget) { Optimization.this.studyTarget = studyTarget; return this; }
        
        public Builder tag(List<String> tag) { Optimization.this.tag = tag; return this; }
        
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { Optimization.this.technique = technique; return this; }
        
        public Builder wasInformedBy(Reference<? extends OptimizationWasInformedBy> wasInformedBy) { Optimization.this.wasInformedBy = wasInformedBy; return this; }
        

        public Optimization build(OpenMINDSContext context) {
            if (Optimization.this.id == null) {
                Optimization.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            Optimization.this.type = SEMANTIC_NAME;
            return Optimization.this;
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
    private Reference<? extends OptimizationEnvironment> environment;
    
    public Reference<? extends OptimizationEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends OptimizationInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends OptimizationInput>> getInput() {
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
    private List<Reference<? extends OptimizationOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends OptimizationOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends OptimizationPerformedBy>> performedBy;
    
    public List<Reference<? extends OptimizationPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends OptimizationResourceUsage> resourceUsage;
    
    public List<? extends OptimizationResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends OptimizationStartedBy> startedBy;
    
    public Reference<? extends OptimizationStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends OptimizationStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends OptimizationStudyTarget>> getStudyTarget() {
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
    private Reference<? extends OptimizationWasInformedBy> wasInformedBy;
    
    public Reference<? extends OptimizationWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 
    public static Optimization.Builder create(LocalId localId){
        return new Optimization(localId).new Builder();
    }

    public Optimization.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Optimization.class).new Builder();
    }
}