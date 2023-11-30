package org.openmetadatainitiative.openminds.latest.ephys.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.CoordinatePoint;
import org.openmetadatainitiative.openminds.latest.chemicals.ChemicalMixture;
import org.openmetadatainitiative.openminds.latest.core.data.Measurement;
import org.openmetadatainitiative.openminds.latest.ephys.device.Pipette;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageAnatomicalLocation;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageLabelingCompound;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageMetadataLocation;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsagePipetteResistance;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageUsedSpecimen;


import static org.openmetadatainitiative.openminds.latest.ephys.device.PipetteUsage.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class PipetteUsage extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.ElectrodePlacementDevice, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingDevice, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityDevice, org.openmetadatainitiative.openminds.latest.ephys.entity.intf.RecordingRecordedWith, org.openmetadatainitiative.openminds.latest.core.data.intf.MeasurementMeasuredWith{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/PipetteUsage";

    @JsonIgnore
    public Reference<PipetteUsage> getReference() {
        return doGetReference();
    }

    public static Reference<PipetteUsage> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private PipetteUsage() {
        this(null);
    }

    private PipetteUsage(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<PipetteUsage>{
        public Builder anatomicalLocation(Reference<? extends PipetteUsageAnatomicalLocation> anatomicalLocation) { PipetteUsage.this.anatomicalLocation = anatomicalLocation; return this; }
        public Builder chlorideReversalPotential(List<Function<Measurement.EmbeddedBuilder, Measurement>> chlorideReversalPotential) { PipetteUsage.this.chlorideReversalPotential = chlorideReversalPotential.stream().map(b -> b.apply(Measurement.createEmbedded())).toList(); return this; }
        public Builder compensationCurrent(Function<Measurement.EmbeddedBuilder, Measurement> compensationCurrent) { PipetteUsage.this.compensationCurrent = compensationCurrent.apply(Measurement.createEmbedded()); return this; }
        public Builder device(Reference<Pipette> device) { PipetteUsage.this.device = device; return this; }
        public Builder endMembranePotential(Function<Measurement.EmbeddedBuilder, Measurement> endMembranePotential) { PipetteUsage.this.endMembranePotential = endMembranePotential.apply(Measurement.createEmbedded()); return this; }
        public Builder holdingPotential(Function<Measurement.EmbeddedBuilder, Measurement> holdingPotential) { PipetteUsage.this.holdingPotential = holdingPotential.apply(Measurement.createEmbedded()); return this; }
        public Builder inputResistance(Function<Measurement.EmbeddedBuilder, Measurement> inputResistance) { PipetteUsage.this.inputResistance = inputResistance.apply(Measurement.createEmbedded()); return this; }
        public Builder labelingCompound(Reference<? extends PipetteUsageLabelingCompound> labelingCompound) { PipetteUsage.this.labelingCompound = labelingCompound; return this; }
        public Builder liquidJunctionPotential(Function<Measurement.EmbeddedBuilder, Measurement> liquidJunctionPotential) { PipetteUsage.this.liquidJunctionPotential = liquidJunctionPotential.apply(Measurement.createEmbedded()); return this; }
        public Builder lookupLabel(String lookupLabel) { PipetteUsage.this.lookupLabel = lookupLabel; return this; }
        public Builder metadataLocation(List<Reference<? extends PipetteUsageMetadataLocation>> metadataLocation) { PipetteUsage.this.metadataLocation = metadataLocation; return this; }
        public Builder pipetteResistance(Function<PipetteUsagePipetteResistance.EmbeddedBuilder, PipetteUsagePipetteResistance> pipetteResistance) { PipetteUsage.this.pipetteResistance = pipetteResistance.apply(PipetteUsagePipetteResistance.createEmbedded()); return this; }
        public Builder pipetteSolution(Reference<ChemicalMixture> pipetteSolution) { PipetteUsage.this.pipetteSolution = pipetteSolution; return this; }
        public Builder sealResistance(Function<Measurement.EmbeddedBuilder, Measurement> sealResistance) { PipetteUsage.this.sealResistance = sealResistance.apply(Measurement.createEmbedded()); return this; }
        public Builder seriesResistance(Function<Measurement.EmbeddedBuilder, Measurement> seriesResistance) { PipetteUsage.this.seriesResistance = seriesResistance.apply(Measurement.createEmbedded()); return this; }
        public Builder spatialLocation(Function<CoordinatePoint.EmbeddedBuilder, CoordinatePoint> spatialLocation) { PipetteUsage.this.spatialLocation = spatialLocation.apply(CoordinatePoint.createEmbedded()); return this; }
        public Builder startMembranePotential(Function<Measurement.EmbeddedBuilder, Measurement> startMembranePotential) { PipetteUsage.this.startMembranePotential = startMembranePotential.apply(Measurement.createEmbedded()); return this; }
        public Builder usedSpecimen(Reference<? extends PipetteUsageUsedSpecimen> usedSpecimen) { PipetteUsage.this.usedSpecimen = usedSpecimen; return this; }
        

        public PipetteUsage build(OpenMINDSContext context) {
            PipetteUsage.super.build(context);
            return PipetteUsage.this;
        }
    }

    public static PipetteUsage.Builder create(LocalId localId){
        return new PipetteUsage(localId).new Builder();
    }

    public PipetteUsage.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, PipetteUsage.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalLocation")
    private Reference<? extends PipetteUsageAnatomicalLocation> anatomicalLocation;
    
    public Reference<? extends PipetteUsageAnatomicalLocation> getAnatomicalLocation() {
       return this.anatomicalLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/chlorideReversalPotential")
    private List<Measurement> chlorideReversalPotential;
    
    public List<Measurement> getChlorideReversalPotential() {
       return this.chlorideReversalPotential;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/compensationCurrent")
    private Measurement compensationCurrent;
    
    public Measurement getCompensationCurrent() {
       return this.compensationCurrent;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/device")
    private Reference<Pipette> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public Reference<Pipette> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/endMembranePotential")
    private Measurement endMembranePotential;
    
    public Measurement getEndMembranePotential() {
       return this.endMembranePotential;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/holdingPotential")
    private Measurement holdingPotential;
    
    public Measurement getHoldingPotential() {
       return this.holdingPotential;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/inputResistance")
    private Measurement inputResistance;
    
    public Measurement getInputResistance() {
       return this.inputResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/labelingCompound")
    private Reference<? extends PipetteUsageLabelingCompound> labelingCompound;
    
    public Reference<? extends PipetteUsageLabelingCompound> getLabelingCompound() {
       return this.labelingCompound;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/liquidJunctionPotential")
    private Measurement liquidJunctionPotential;
    
    public Measurement getLiquidJunctionPotential() {
       return this.liquidJunctionPotential;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/metadataLocation")
    private List<Reference<? extends PipetteUsageMetadataLocation>> metadataLocation;
    
    public List<Reference<? extends PipetteUsageMetadataLocation>> getMetadataLocation() {
       return this.metadataLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/pipetteResistance")
    private PipetteUsagePipetteResistance pipetteResistance;
    
    public PipetteUsagePipetteResistance getPipetteResistance() {
       return this.pipetteResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/pipetteSolution")
    private Reference<ChemicalMixture> pipetteSolution;
    
    public Reference<ChemicalMixture> getPipetteSolution() {
       return this.pipetteSolution;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/sealResistance")
    private Measurement sealResistance;
    
    public Measurement getSealResistance() {
       return this.sealResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/seriesResistance")
    private Measurement seriesResistance;
    
    public Measurement getSeriesResistance() {
       return this.seriesResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/spatialLocation")
    private CoordinatePoint spatialLocation;
    
    public CoordinatePoint getSpatialLocation() {
       return this.spatialLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startMembranePotential")
    private Measurement startMembranePotential;
    
    public Measurement getStartMembranePotential() {
       return this.startMembranePotential;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecimen")
    private Reference<? extends PipetteUsageUsedSpecimen> usedSpecimen;
    
    public Reference<? extends PipetteUsageUsedSpecimen> getUsedSpecimen() {
       return this.usedSpecimen;
    }

 

}