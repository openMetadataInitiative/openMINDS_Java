package org.openmetadatainitiative.openminds.v3.specimenPrep.activity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.chemicals.ChemicalMixture;
import org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingInput;
import org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingOutput;
import org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingTemperature;
import org.openmetadatainitiative.openminds.v3.specimenPrep.device.SlicingDeviceUsage;


import static org.openmetadatainitiative.openminds.v3.specimenPrep.activity.TissueSampleSlicing.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TissueSampleSlicing extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/specimenPrep/TissueSampleSlicing";

    @JsonIgnore
    public Reference<TissueSampleSlicing> getReference() {
        return doGetReference();
    }

    public static Reference<TissueSampleSlicing> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private TissueSampleSlicing(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<TissueSampleSlicing>{
        
        public Builder device(Reference<SlicingDeviceUsage> device) { TissueSampleSlicing.this.device = device; return this; }
        
        public Builder input(Reference<? extends TissueSampleSlicingInput> input) { TissueSampleSlicing.this.input = input; return this; }
        
        public Builder output(List<Reference<? extends TissueSampleSlicingOutput>> output) { TissueSampleSlicing.this.output = output; return this; }
        
        public Builder temperature(TissueSampleSlicingTemperature temperature) { TissueSampleSlicing.this.temperature = temperature; return this; }
        
        public Builder tissueBathSolution(Reference<ChemicalMixture> tissueBathSolution) { TissueSampleSlicing.this.tissueBathSolution = tissueBathSolution; return this; }
        

        public TissueSampleSlicing build(OpenMINDSContext context) {
            if (TissueSampleSlicing.this.id == null) {
                TissueSampleSlicing.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            TissueSampleSlicing.this.atType = SEMANTIC_NAME;
            return TissueSampleSlicing.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/device")
    private Reference<SlicingDeviceUsage> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public Reference<SlicingDeviceUsage> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private Reference<? extends TissueSampleSlicingInput> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public Reference<? extends TissueSampleSlicingInput> getInput() {
       return this.input;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/output")
    private List<Reference<? extends TissueSampleSlicingOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends TissueSampleSlicingOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/temperature")
    private TissueSampleSlicingTemperature temperature;
    
    public TissueSampleSlicingTemperature getTemperature() {
       return this.temperature;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/tissueBathSolution")
    private Reference<ChemicalMixture> tissueBathSolution;
    
    public Reference<ChemicalMixture> getTissueBathSolution() {
       return this.tissueBathSolution;
    }

 
    public static TissueSampleSlicing.Builder create(LocalId localId){
        return new TissueSampleSlicing(localId).new Builder();
    }

    public TissueSampleSlicing.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, TissueSampleSlicing.class).new Builder();
    }
}