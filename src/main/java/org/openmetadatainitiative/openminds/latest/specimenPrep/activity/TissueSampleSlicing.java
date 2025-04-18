package org.openmetadatainitiative.openminds.latest.specimenPrep.activity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.chemicals.ChemicalMixture;
import org.openmetadatainitiative.openminds.latest.controlledTerms.PreparationType;
import org.openmetadatainitiative.openminds.latest.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.latest.core.research.CustomPropertySet;
import org.openmetadatainitiative.openminds.latest.core.research.Protocol;
import org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingInput;
import org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingOutput;
import org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingPerformedBy;
import org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingStudyTarget;
import org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingTemperature;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.SlicingDeviceUsage;


import static org.openmetadatainitiative.openminds.latest.specimenPrep.activity.TissueSampleSlicing.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class TissueSampleSlicing extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/TissueSampleSlicing";

    @JsonIgnore
    public Reference<TissueSampleSlicing> getReference() {
        return doGetReference();
    }

    public static Reference<TissueSampleSlicing> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private TissueSampleSlicing() {
        this(null);
    }

    private TissueSampleSlicing(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<TissueSampleSlicing>{
        public Builder customPropertySet(List<Function<CustomPropertySet.EmbeddedBuilder, CustomPropertySet>> customPropertySet) { TissueSampleSlicing.this.customPropertySet = customPropertySet.stream().map(b -> b.apply(CustomPropertySet.createEmbedded())).toList(); return this; }
        public Builder description(String description) { TissueSampleSlicing.this.description = description; return this; }
        public Builder device(Reference<SlicingDeviceUsage> device) { TissueSampleSlicing.this.device = device; return this; }
        public Builder endTime(String endTime) { TissueSampleSlicing.this.endTime = endTime; return this; }
        public Builder input(List<Reference<? extends TissueSampleSlicingInput>> input) { TissueSampleSlicing.this.input = input; return this; }
        public Builder isPartOf(Reference<DatasetVersion> isPartOf) { TissueSampleSlicing.this.isPartOf = isPartOf; return this; }
        public Builder lookupLabel(String lookupLabel) { TissueSampleSlicing.this.lookupLabel = lookupLabel; return this; }
        public Builder output(List<Reference<? extends TissueSampleSlicingOutput>> output) { TissueSampleSlicing.this.output = output; return this; }
        public Builder performedBy(List<Reference<? extends TissueSampleSlicingPerformedBy>> performedBy) { TissueSampleSlicing.this.performedBy = performedBy; return this; }
        public Builder preparationDesign(Reference<PreparationType> preparationDesign) { TissueSampleSlicing.this.preparationDesign = preparationDesign; return this; }
        public Builder protocol(List<Reference<Protocol>> protocol) { TissueSampleSlicing.this.protocol = protocol; return this; }
        public Builder startTime(String startTime) { TissueSampleSlicing.this.startTime = startTime; return this; }
        public Builder studyTarget(List<Reference<? extends TissueSampleSlicingStudyTarget>> studyTarget) { TissueSampleSlicing.this.studyTarget = studyTarget; return this; }
        public Builder temperature(Function<TissueSampleSlicingTemperature.EmbeddedBuilder, TissueSampleSlicingTemperature> temperature) { TissueSampleSlicing.this.temperature = temperature.apply(TissueSampleSlicingTemperature.createEmbedded()); return this; }
        public Builder tissueBathSolution(Reference<ChemicalMixture> tissueBathSolution) { TissueSampleSlicing.this.tissueBathSolution = tissueBathSolution; return this; }
        

        public TissueSampleSlicing build(OpenMINDSContext context) {
            TissueSampleSlicing.super.build(context);
            return TissueSampleSlicing.this;
        }
    }

    public static TissueSampleSlicing.Builder create(LocalId localId){
        return new TissueSampleSlicing(localId).new Builder();
    }

    public TissueSampleSlicing.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, TissueSampleSlicing.class).new Builder();
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

    @JsonProperty(value = "https://openminds.om-i.org/props/device")
    private Reference<SlicingDeviceUsage> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public Reference<SlicingDeviceUsage> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/endTime")
    private String endTime;
    
    public String getEndTime() {
       return this.endTime;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/input")
    private List<Reference<? extends TissueSampleSlicingInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends TissueSampleSlicingInput>> getInput() {
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
    private List<Reference<? extends TissueSampleSlicingOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends TissueSampleSlicingOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/performedBy")
    private List<Reference<? extends TissueSampleSlicingPerformedBy>> performedBy;
    
    public List<Reference<? extends TissueSampleSlicingPerformedBy>> getPerformedBy() {
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

    @JsonProperty(value = "https://openminds.om-i.org/props/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/studyTarget")
    private List<Reference<? extends TissueSampleSlicingStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends TissueSampleSlicingStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/temperature")
    private TissueSampleSlicingTemperature temperature;
    
    public TissueSampleSlicingTemperature getTemperature() {
       return this.temperature;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/tissueBathSolution")
    private Reference<ChemicalMixture> tissueBathSolution;
    
    public Reference<ChemicalMixture> getTissueBathSolution() {
       return this.tissueBathSolution;
    }

 

}