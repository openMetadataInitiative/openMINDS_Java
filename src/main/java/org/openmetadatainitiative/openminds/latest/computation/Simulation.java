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
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationEnvironment;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationInput;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationOutput;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationPerformedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationResourceUsage;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationStartedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationStudyTarget;
import org.openmetadatainitiative.openminds.latest.computation.intf.SimulationWasInformedBy;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.latest.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.latest.computation.Simulation.SEMANTIC_NAME;
/**
 * Structured information about a process of running simulations of a computational model.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Simulation extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationWasInformedBy{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/Simulation";

    @JsonIgnore
    public Reference<Simulation> getReference() {
        return doGetReference();
    }

    public static Reference<Simulation> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Simulation() {
        this(null);
    }

    private Simulation(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Simulation>{
        public Builder customPropertySet(List<Function<CustomPropertySet.EmbeddedBuilder, CustomPropertySet>> customPropertySet) { Simulation.this.customPropertySet = customPropertySet.stream().map(b -> b.apply(CustomPropertySet.createEmbedded())).toList(); return this; }
        public Builder description(String description) { Simulation.this.description = description; return this; }
        public Builder endTime(String endTime) { Simulation.this.endTime = endTime; return this; }
        public Builder environment(Reference<? extends SimulationEnvironment> environment) { Simulation.this.environment = environment; return this; }
        public Builder input(List<Reference<? extends SimulationInput>> input) { Simulation.this.input = input; return this; }
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { Simulation.this.launchConfiguration = launchConfiguration; return this; }
        public Builder lookupLabel(String lookupLabel) { Simulation.this.lookupLabel = lookupLabel; return this; }
        public Builder output(List<Reference<? extends SimulationOutput>> output) { Simulation.this.output = output; return this; }
        public Builder performedBy(List<Reference<? extends SimulationPerformedBy>> performedBy) { Simulation.this.performedBy = performedBy; return this; }
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { Simulation.this.recipe = recipe; return this; }
        public Builder resourceUsage(List<Function<SimulationResourceUsage.EmbeddedBuilder, SimulationResourceUsage>> resourceUsage) { Simulation.this.resourceUsage = resourceUsage.stream().map(b -> b.apply(SimulationResourceUsage.createEmbedded())).toList(); return this; }
        public Builder startTime(String startTime) { Simulation.this.startTime = startTime; return this; }
        public Builder startedBy(Reference<? extends SimulationStartedBy> startedBy) { Simulation.this.startedBy = startedBy; return this; }
        public Builder status(Reference<ActionStatusType> status) { Simulation.this.status = status; return this; }
        public Builder studyTarget(List<Reference<? extends SimulationStudyTarget>> studyTarget) { Simulation.this.studyTarget = studyTarget; return this; }
        public Builder tag(List<String> tag) { Simulation.this.tag = tag; return this; }
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { Simulation.this.technique = technique; return this; }
        public Builder wasInformedBy(Reference<? extends SimulationWasInformedBy> wasInformedBy) { Simulation.this.wasInformedBy = wasInformedBy; return this; }
        

        public Simulation build(OpenMINDSContext context) {
            Simulation.super.build(context);
            return Simulation.this;
        }
    }

    public static Simulation.Builder create(LocalId localId){
        return new Simulation(localId).new Builder();
    }

    public Simulation.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Simulation.class).new Builder();
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
    private Reference<? extends SimulationEnvironment> environment;
    
    public Reference<? extends SimulationEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends SimulationInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends SimulationInput>> getInput() {
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
    private List<Reference<? extends SimulationOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends SimulationOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends SimulationPerformedBy>> performedBy;
    
    public List<Reference<? extends SimulationPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends SimulationResourceUsage> resourceUsage;
    
    public List<? extends SimulationResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends SimulationStartedBy> startedBy;
    
    public Reference<? extends SimulationStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends SimulationStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends SimulationStudyTarget>> getStudyTarget() {
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
    private Reference<? extends SimulationWasInformedBy> wasInformedBy;
    
    public Reference<? extends SimulationWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 

}