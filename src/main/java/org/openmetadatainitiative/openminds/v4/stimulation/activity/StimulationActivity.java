package org.openmetadatainitiative.openminds.v4.stimulation.activity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v4.controlledTerms.PreparationType;
import org.openmetadatainitiative.openminds.v4.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.v4.core.products.Setup;
import org.openmetadatainitiative.openminds.v4.core.research.CustomPropertySet;
import org.openmetadatainitiative.openminds.v4.core.research.Protocol;
import org.openmetadatainitiative.openminds.v4.stimulation.activity.intf.StimulationActivityInput;
import org.openmetadatainitiative.openminds.v4.stimulation.activity.intf.StimulationActivityOutput;
import org.openmetadatainitiative.openminds.v4.stimulation.activity.intf.StimulationActivityPerformedBy;
import org.openmetadatainitiative.openminds.v4.stimulation.activity.intf.StimulationActivityStudyTarget;
import org.openmetadatainitiative.openminds.v4.stimulation.stimulus.EphysStimulus;


import static org.openmetadatainitiative.openminds.v4.stimulation.activity.StimulationActivity.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class StimulationActivity extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V4.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/StimulationActivity";

    @JsonIgnore
    public Reference<StimulationActivity> getReference() {
        return doGetReference();
    }

    public static Reference<StimulationActivity> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private StimulationActivity() {
        this(null);
    }

    private StimulationActivity(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<StimulationActivity>{
        public Builder customPropertySet(List<Function<CustomPropertySet.EmbeddedBuilder, CustomPropertySet>> customPropertySet) { StimulationActivity.this.customPropertySet = customPropertySet.stream().map(b -> b.apply(CustomPropertySet.createEmbedded())).toList(); return this; }
        public Builder description(String description) { StimulationActivity.this.description = description; return this; }
        public Builder endTime(String endTime) { StimulationActivity.this.endTime = endTime; return this; }
        public Builder input(List<Reference<? extends StimulationActivityInput>> input) { StimulationActivity.this.input = input; return this; }
        public Builder isPartOf(Reference<DatasetVersion> isPartOf) { StimulationActivity.this.isPartOf = isPartOf; return this; }
        public Builder lookupLabel(String lookupLabel) { StimulationActivity.this.lookupLabel = lookupLabel; return this; }
        public Builder output(List<Reference<? extends StimulationActivityOutput>> output) { StimulationActivity.this.output = output; return this; }
        public Builder performedBy(List<Reference<? extends StimulationActivityPerformedBy>> performedBy) { StimulationActivity.this.performedBy = performedBy; return this; }
        public Builder preparationDesign(Reference<PreparationType> preparationDesign) { StimulationActivity.this.preparationDesign = preparationDesign; return this; }
        public Builder protocol(List<Reference<Protocol>> protocol) { StimulationActivity.this.protocol = protocol; return this; }
        public Builder setup(Reference<Setup> setup) { StimulationActivity.this.setup = setup; return this; }
        public Builder startTime(String startTime) { StimulationActivity.this.startTime = startTime; return this; }
        public Builder stimulus(List<Reference<EphysStimulus>> stimulus) { StimulationActivity.this.stimulus = stimulus; return this; }
        public Builder studyTarget(List<Reference<? extends StimulationActivityStudyTarget>> studyTarget) { StimulationActivity.this.studyTarget = studyTarget; return this; }
        

        public StimulationActivity build(OpenMINDSContext context) {
            StimulationActivity.super.build(context);
            return StimulationActivity.this;
        }
    }

    public static StimulationActivity.Builder create(LocalId localId){
        return new StimulationActivity(localId).new Builder();
    }

    public StimulationActivity.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, StimulationActivity.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/customPropertySet")
    private List<CustomPropertySet> customPropertySet;
    
    public List<CustomPropertySet> getCustomPropertySet() {
       return this.customPropertySet;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/endTime")
    private String endTime;
    
    public String getEndTime() {
       return this.endTime;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/input")
    private List<Reference<? extends StimulationActivityInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends StimulationActivityInput>> getInput() {
       return this.input;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/isPartOf")
    private Reference<DatasetVersion> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<DatasetVersion> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/output")
    private List<Reference<? extends StimulationActivityOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends StimulationActivityOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/performedBy")
    private List<Reference<? extends StimulationActivityPerformedBy>> performedBy;
    
    public List<Reference<? extends StimulationActivityPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/preparationDesign")
    private Reference<PreparationType> preparationDesign;
    
    public Reference<PreparationType> getPreparationDesign() {
       return this.preparationDesign;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/protocol")
    private List<Reference<Protocol>> protocol;
    
    /**
    * Plan that describes the process of a scientific or medical experiment, treatment, or procedure.
    */
    public List<Reference<Protocol>> getProtocol() {
       return this.protocol;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/setup")
    private Reference<Setup> setup;
    
    public Reference<Setup> getSetup() {
       return this.setup;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/stimulus")
    private List<Reference<EphysStimulus>> stimulus;
    
    public List<Reference<EphysStimulus>> getStimulus() {
       return this.stimulus;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/studyTarget")
    private List<Reference<? extends StimulationActivityStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends StimulationActivityStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

 

}