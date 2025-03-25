package org.openmetadatainitiative.openminds.v3.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.computation.LaunchConfiguration;
import org.openmetadatainitiative.openminds.v3.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyEnvironment;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyInput;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyOutput;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyPerformedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyResourceUsage;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyStartedBy;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyStudyTarget;
import org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyWasInformedBy;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.v3.computation.DataCopy.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class DataCopy extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyWasInformedBy{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/DataCopy";

    @JsonIgnore
    public Reference<DataCopy> getReference() {
        return doGetReference();
    }

    public static Reference<DataCopy> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private DataCopy() {
        this(null);
    }

    private DataCopy(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<DataCopy>{
        public Builder customPropertySet(List<Function<CustomPropertySet.EmbeddedBuilder, CustomPropertySet>> customPropertySet) { DataCopy.this.customPropertySet = customPropertySet.stream().map(b -> b.apply(CustomPropertySet.createEmbedded())).toList(); return this; }
        public Builder description(String description) { DataCopy.this.description = description; return this; }
        public Builder endTime(String endTime) { DataCopy.this.endTime = endTime; return this; }
        public Builder environment(Reference<? extends DataCopyEnvironment> environment) { DataCopy.this.environment = environment; return this; }
        public Builder input(List<Reference<? extends DataCopyInput>> input) { DataCopy.this.input = input; return this; }
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { DataCopy.this.launchConfiguration = launchConfiguration; return this; }
        public Builder lookupLabel(String lookupLabel) { DataCopy.this.lookupLabel = lookupLabel; return this; }
        public Builder output(List<Reference<? extends DataCopyOutput>> output) { DataCopy.this.output = output; return this; }
        public Builder performedBy(List<Reference<? extends DataCopyPerformedBy>> performedBy) { DataCopy.this.performedBy = performedBy; return this; }
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { DataCopy.this.recipe = recipe; return this; }
        public Builder resourceUsage(List<Function<DataCopyResourceUsage.EmbeddedBuilder, DataCopyResourceUsage>> resourceUsage) { DataCopy.this.resourceUsage = resourceUsage.stream().map(b -> b.apply(DataCopyResourceUsage.createEmbedded())).toList(); return this; }
        public Builder startTime(String startTime) { DataCopy.this.startTime = startTime; return this; }
        public Builder startedBy(Reference<? extends DataCopyStartedBy> startedBy) { DataCopy.this.startedBy = startedBy; return this; }
        public Builder status(Reference<ActionStatusType> status) { DataCopy.this.status = status; return this; }
        public Builder studyTarget(List<Reference<? extends DataCopyStudyTarget>> studyTarget) { DataCopy.this.studyTarget = studyTarget; return this; }
        public Builder tag(List<String> tag) { DataCopy.this.tag = tag; return this; }
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { DataCopy.this.technique = technique; return this; }
        public Builder wasInformedBy(Reference<? extends DataCopyWasInformedBy> wasInformedBy) { DataCopy.this.wasInformedBy = wasInformedBy; return this; }
        

        public DataCopy build(OpenMINDSContext context) {
            DataCopy.super.build(context);
            return DataCopy.this;
        }
    }

    public static DataCopy.Builder create(LocalId localId){
        return new DataCopy(localId).new Builder();
    }

    public DataCopy.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, DataCopy.class).new Builder();
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
    private Reference<? extends DataCopyEnvironment> environment;
    
    public Reference<? extends DataCopyEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends DataCopyInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends DataCopyInput>> getInput() {
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
    private List<Reference<? extends DataCopyOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends DataCopyOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends DataCopyPerformedBy>> performedBy;
    
    public List<Reference<? extends DataCopyPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends DataCopyResourceUsage> resourceUsage;
    
    public List<? extends DataCopyResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends DataCopyStartedBy> startedBy;
    
    public Reference<? extends DataCopyStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends DataCopyStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends DataCopyStudyTarget>> getStudyTarget() {
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
    private Reference<? extends DataCopyWasInformedBy> wasInformedBy;
    
    public Reference<? extends DataCopyWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 

}