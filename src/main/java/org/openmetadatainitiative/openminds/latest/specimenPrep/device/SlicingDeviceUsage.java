package org.openmetadatainitiative.openminds.latest.specimenPrep.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.AnatomicalPlane;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.SlicingDevice;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageMetadataLocation;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageSliceThickness;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageSlicingAngle;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageUsedSpecimen;


import static org.openmetadatainitiative.openminds.latest.specimenPrep.device.SlicingDeviceUsage.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class SlicingDeviceUsage extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingDevice, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.ElectrodePlacementDevice, org.openmetadatainitiative.openminds.latest.ephys.entity.intf.RecordingRecordedWith, org.openmetadatainitiative.openminds.latest.core.data.intf.MeasurementMeasuredWith, org.openmetadatainitiative.openminds.latest.stimulation.stimulus.intf.EphysStimulusDeliveredBy, org.openmetadatainitiative.openminds.latest.stimulation.stimulus.intf.EphysStimulusGeneratedBy{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/SlicingDeviceUsage";

    @JsonIgnore
    public Reference<SlicingDeviceUsage> getReference() {
        return doGetReference();
    }

    public static Reference<SlicingDeviceUsage> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private SlicingDeviceUsage() {
        this(null);
    }

    private SlicingDeviceUsage(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SlicingDeviceUsage>{
        public Builder device(Reference<SlicingDevice> device) { SlicingDeviceUsage.this.device = device; return this; }
        public Builder lookupLabel(String lookupLabel) { SlicingDeviceUsage.this.lookupLabel = lookupLabel; return this; }
        public Builder metadataLocation(List<Reference<? extends SlicingDeviceUsageMetadataLocation>> metadataLocation) { SlicingDeviceUsage.this.metadataLocation = metadataLocation; return this; }
        public Builder oscillationAmplitude(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> oscillationAmplitude) { SlicingDeviceUsage.this.oscillationAmplitude = oscillationAmplitude.apply(QuantitativeValue.createEmbedded()); return this; }
        public Builder sliceThickness(Function<SlicingDeviceUsageSliceThickness.EmbeddedBuilder, SlicingDeviceUsageSliceThickness> sliceThickness) { SlicingDeviceUsage.this.sliceThickness = sliceThickness.apply(SlicingDeviceUsageSliceThickness.createEmbedded()); return this; }
        public Builder slicingAngle(List<Function<SlicingDeviceUsageSlicingAngle.EmbeddedBuilder, SlicingDeviceUsageSlicingAngle>> slicingAngle) { SlicingDeviceUsage.this.slicingAngle = slicingAngle.stream().map(b -> b.apply(SlicingDeviceUsageSlicingAngle.createEmbedded())).toList(); return this; }
        public Builder slicingPlane(Reference<AnatomicalPlane> slicingPlane) { SlicingDeviceUsage.this.slicingPlane = slicingPlane; return this; }
        public Builder slicingSpeed(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> slicingSpeed) { SlicingDeviceUsage.this.slicingSpeed = slicingSpeed.apply(QuantitativeValue.createEmbedded()); return this; }
        public Builder usedSpecimen(Reference<? extends SlicingDeviceUsageUsedSpecimen> usedSpecimen) { SlicingDeviceUsage.this.usedSpecimen = usedSpecimen; return this; }
        public Builder vibrationFrequency(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> vibrationFrequency) { SlicingDeviceUsage.this.vibrationFrequency = vibrationFrequency.apply(QuantitativeValue.createEmbedded()); return this; }
        

        public SlicingDeviceUsage build(OpenMINDSContext context) {
            SlicingDeviceUsage.super.build(context);
            return SlicingDeviceUsage.this;
        }
    }

    public static SlicingDeviceUsage.Builder create(LocalId localId){
        return new SlicingDeviceUsage(localId).new Builder();
    }

    public SlicingDeviceUsage.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SlicingDeviceUsage.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/device")
    private Reference<SlicingDevice> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public Reference<SlicingDevice> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/metadataLocation")
    private List<Reference<? extends SlicingDeviceUsageMetadataLocation>> metadataLocation;
    
    public List<Reference<? extends SlicingDeviceUsageMetadataLocation>> getMetadataLocation() {
       return this.metadataLocation;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/oscillationAmplitude")
    private QuantitativeValue oscillationAmplitude;
    
    public QuantitativeValue getOscillationAmplitude() {
       return this.oscillationAmplitude;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/sliceThickness")
    private SlicingDeviceUsageSliceThickness sliceThickness;
    
    public SlicingDeviceUsageSliceThickness getSliceThickness() {
       return this.sliceThickness;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/slicingAngle")
    private List<? extends SlicingDeviceUsageSlicingAngle> slicingAngle;
    
    public List<? extends SlicingDeviceUsageSlicingAngle> getSlicingAngle() {
       return this.slicingAngle;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/slicingPlane")
    private Reference<AnatomicalPlane> slicingPlane;
    
    public Reference<AnatomicalPlane> getSlicingPlane() {
       return this.slicingPlane;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/slicingSpeed")
    private QuantitativeValue slicingSpeed;
    
    public QuantitativeValue getSlicingSpeed() {
       return this.slicingSpeed;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/usedSpecimen")
    private Reference<? extends SlicingDeviceUsageUsedSpecimen> usedSpecimen;
    
    public Reference<? extends SlicingDeviceUsageUsedSpecimen> getUsedSpecimen() {
       return this.usedSpecimen;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/vibrationFrequency")
    private QuantitativeValue vibrationFrequency;
    
    public QuantitativeValue getVibrationFrequency() {
       return this.vibrationFrequency;
    }

 

}