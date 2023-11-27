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
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisEnvironment;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisInput;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisOutput;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisPerformedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisResourceUsage;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisStartedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisStudyTarget;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisWasInformedBy;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.v3.computation.DataAnalysis.SEMANTIC_NAME;
/**
 * Structured information on inspecting, cleansing, transforming, and modelling data.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataAnalysis extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationWasInformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/DataAnalysis";

    @JsonIgnore
    public Reference<DataAnalysis> getReference() {
        return doGetReference();
    }

    public static Reference<DataAnalysis> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private DataAnalysis(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<DataAnalysis>{
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { DataAnalysis.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { DataAnalysis.this.description = description; return this; }
        
        public Builder endTime(String endTime) { DataAnalysis.this.endTime = endTime; return this; }
        
        public Builder environment(Reference<? extends DataAnalysisEnvironment> environment) { DataAnalysis.this.environment = environment; return this; }
        
        public Builder input(List<Reference<? extends DataAnalysisInput>> input) { DataAnalysis.this.input = input; return this; }
        
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { DataAnalysis.this.launchConfiguration = launchConfiguration; return this; }
        
        public Builder lookupLabel(String lookupLabel) { DataAnalysis.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends DataAnalysisOutput>> output) { DataAnalysis.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends DataAnalysisPerformedBy>> performedBy) { DataAnalysis.this.performedBy = performedBy; return this; }
        
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { DataAnalysis.this.recipe = recipe; return this; }
        
        public Builder resourceUsage(List<? extends DataAnalysisResourceUsage> resourceUsage) { DataAnalysis.this.resourceUsage = resourceUsage; return this; }
        
        public Builder startTime(String startTime) { DataAnalysis.this.startTime = startTime; return this; }
        
        public Builder startedBy(Reference<? extends DataAnalysisStartedBy> startedBy) { DataAnalysis.this.startedBy = startedBy; return this; }
        
        public Builder status(Reference<ActionStatusType> status) { DataAnalysis.this.status = status; return this; }
        
        public Builder studyTarget(List<Reference<? extends DataAnalysisStudyTarget>> studyTarget) { DataAnalysis.this.studyTarget = studyTarget; return this; }
        
        public Builder tag(List<String> tag) { DataAnalysis.this.tag = tag; return this; }
        
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { DataAnalysis.this.technique = technique; return this; }
        
        public Builder wasInformedBy(Reference<? extends DataAnalysisWasInformedBy> wasInformedBy) { DataAnalysis.this.wasInformedBy = wasInformedBy; return this; }
        

        public DataAnalysis build(OpenMINDSContext context) {
            if (DataAnalysis.this.id == null) {
                DataAnalysis.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            DataAnalysis.this.type = SEMANTIC_NAME;
            return DataAnalysis.this;
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
    private Reference<? extends DataAnalysisEnvironment> environment;
    
    public Reference<? extends DataAnalysisEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends DataAnalysisInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends DataAnalysisInput>> getInput() {
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
    private List<Reference<? extends DataAnalysisOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends DataAnalysisOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends DataAnalysisPerformedBy>> performedBy;
    
    public List<Reference<? extends DataAnalysisPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends DataAnalysisResourceUsage> resourceUsage;
    
    public List<? extends DataAnalysisResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends DataAnalysisStartedBy> startedBy;
    
    public Reference<? extends DataAnalysisStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends DataAnalysisStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends DataAnalysisStudyTarget>> getStudyTarget() {
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
    private Reference<? extends DataAnalysisWasInformedBy> wasInformedBy;
    
    public Reference<? extends DataAnalysisWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 
    public static DataAnalysis.Builder create(LocalId localId){
        return new DataAnalysis(localId).new Builder();
    }

    public DataAnalysis.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, DataAnalysis.class).new Builder();
    }
}