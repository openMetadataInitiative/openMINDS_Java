package org.openmetadatainitiative.openminds.latest.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.computation.LaunchConfiguration;
import org.openmetadatainitiative.openminds.latest.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationEnvironment;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationInput;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationOutput;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationPerformedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationResourceUsage;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationStartedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationStudyTarget;
import org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationWasInformedBy;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.latest.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.latest.computation.Visualization.SEMANTIC_NAME;
/**
 * Structured information about a process of visualizing a computational model, a computational process, or a dataset.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Visualization extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationWasInformedBy{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/Visualization";

    @JsonIgnore
    public Reference<Visualization> getReference() {
        return doGetReference();
    }

    public static Reference<Visualization> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Visualization() {
        this(null);
    }

    private Visualization(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Visualization>{
        public Builder customPropertySet(List<Function<CustomPropertySet.EmbeddedBuilder, CustomPropertySet>> customPropertySet) { Visualization.this.customPropertySet = customPropertySet.stream().map(b -> b.apply(CustomPropertySet.createEmbedded())).toList(); return this; }
        public Builder description(String description) { Visualization.this.description = description; return this; }
        public Builder endTime(String endTime) { Visualization.this.endTime = endTime; return this; }
        public Builder environment(Reference<? extends VisualizationEnvironment> environment) { Visualization.this.environment = environment; return this; }
        public Builder input(List<Reference<? extends VisualizationInput>> input) { Visualization.this.input = input; return this; }
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { Visualization.this.launchConfiguration = launchConfiguration; return this; }
        public Builder lookupLabel(String lookupLabel) { Visualization.this.lookupLabel = lookupLabel; return this; }
        public Builder output(List<Reference<? extends VisualizationOutput>> output) { Visualization.this.output = output; return this; }
        public Builder performedBy(List<Reference<? extends VisualizationPerformedBy>> performedBy) { Visualization.this.performedBy = performedBy; return this; }
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { Visualization.this.recipe = recipe; return this; }
        public Builder resourceUsage(List<Function<VisualizationResourceUsage.EmbeddedBuilder, VisualizationResourceUsage>> resourceUsage) { Visualization.this.resourceUsage = resourceUsage.stream().map(b -> b.apply(VisualizationResourceUsage.createEmbedded())).toList(); return this; }
        public Builder startTime(String startTime) { Visualization.this.startTime = startTime; return this; }
        public Builder startedBy(Reference<? extends VisualizationStartedBy> startedBy) { Visualization.this.startedBy = startedBy; return this; }
        public Builder status(Reference<ActionStatusType> status) { Visualization.this.status = status; return this; }
        public Builder studyTarget(List<Reference<? extends VisualizationStudyTarget>> studyTarget) { Visualization.this.studyTarget = studyTarget; return this; }
        public Builder tag(List<String> tag) { Visualization.this.tag = tag; return this; }
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { Visualization.this.technique = technique; return this; }
        public Builder wasInformedBy(Reference<? extends VisualizationWasInformedBy> wasInformedBy) { Visualization.this.wasInformedBy = wasInformedBy; return this; }
        

        public Visualization build(OpenMINDSContext context) {
            Visualization.super.build(context);
            return Visualization.this;
        }
    }

    public static Visualization.Builder create(LocalId localId){
        return new Visualization(localId).new Builder();
    }

    public Visualization.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Visualization.class).new Builder();
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
    private Reference<? extends VisualizationEnvironment> environment;
    
    public Reference<? extends VisualizationEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends VisualizationInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends VisualizationInput>> getInput() {
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
    private List<Reference<? extends VisualizationOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends VisualizationOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends VisualizationPerformedBy>> performedBy;
    
    public List<Reference<? extends VisualizationPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends VisualizationResourceUsage> resourceUsage;
    
    public List<? extends VisualizationResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends VisualizationStartedBy> startedBy;
    
    public Reference<? extends VisualizationStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends VisualizationStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends VisualizationStudyTarget>> getStudyTarget() {
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
    private Reference<? extends VisualizationWasInformedBy> wasInformedBy;
    
    public Reference<? extends VisualizationWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 

}