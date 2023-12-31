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
import org.openmetadatainitiative.openminds.latest.ephys.device.Electrode;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageAnatomicalLocation;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageContactResistance;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageMetadataLocation;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageUsedSpecimen;


import static org.openmetadatainitiative.openminds.latest.ephys.device.ElectrodeUsage.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ElectrodeUsage extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.ElectrodePlacementDevice, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingDevice, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityDevice, org.openmetadatainitiative.openminds.latest.ephys.entity.intf.RecordingRecordedWith, org.openmetadatainitiative.openminds.latest.core.data.intf.MeasurementMeasuredWith{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/ElectrodeUsage";

    @JsonIgnore
    public Reference<ElectrodeUsage> getReference() {
        return doGetReference();
    }

    public static Reference<ElectrodeUsage> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ElectrodeUsage() {
        this(null);
    }

    private ElectrodeUsage(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ElectrodeUsage>{
        public Builder anatomicalLocation(Reference<? extends ElectrodeUsageAnatomicalLocation> anatomicalLocation) { ElectrodeUsage.this.anatomicalLocation = anatomicalLocation; return this; }
        public Builder contactResistance(Function<ElectrodeUsageContactResistance.EmbeddedBuilder, ElectrodeUsageContactResistance> contactResistance) { ElectrodeUsage.this.contactResistance = contactResistance.apply(ElectrodeUsageContactResistance.createEmbedded()); return this; }
        public Builder device(Reference<Electrode> device) { ElectrodeUsage.this.device = device; return this; }
        public Builder lookupLabel(String lookupLabel) { ElectrodeUsage.this.lookupLabel = lookupLabel; return this; }
        public Builder metadataLocation(List<Reference<? extends ElectrodeUsageMetadataLocation>> metadataLocation) { ElectrodeUsage.this.metadataLocation = metadataLocation; return this; }
        public Builder spatialLocation(Function<CoordinatePoint.EmbeddedBuilder, CoordinatePoint> spatialLocation) { ElectrodeUsage.this.spatialLocation = spatialLocation.apply(CoordinatePoint.createEmbedded()); return this; }
        public Builder usedSpecimen(Reference<? extends ElectrodeUsageUsedSpecimen> usedSpecimen) { ElectrodeUsage.this.usedSpecimen = usedSpecimen; return this; }
        

        public ElectrodeUsage build(OpenMINDSContext context) {
            ElectrodeUsage.super.build(context);
            return ElectrodeUsage.this;
        }
    }

    public static ElectrodeUsage.Builder create(LocalId localId){
        return new ElectrodeUsage(localId).new Builder();
    }

    public ElectrodeUsage.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ElectrodeUsage.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalLocation")
    private Reference<? extends ElectrodeUsageAnatomicalLocation> anatomicalLocation;
    
    public Reference<? extends ElectrodeUsageAnatomicalLocation> getAnatomicalLocation() {
       return this.anatomicalLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contactResistance")
    private ElectrodeUsageContactResistance contactResistance;
    
    public ElectrodeUsageContactResistance getContactResistance() {
       return this.contactResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/device")
    private Reference<Electrode> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public Reference<Electrode> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/metadataLocation")
    private List<Reference<? extends ElectrodeUsageMetadataLocation>> metadataLocation;
    
    public List<Reference<? extends ElectrodeUsageMetadataLocation>> getMetadataLocation() {
       return this.metadataLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/spatialLocation")
    private CoordinatePoint spatialLocation;
    
    public CoordinatePoint getSpatialLocation() {
       return this.spatialLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecimen")
    private Reference<? extends ElectrodeUsageUsedSpecimen> usedSpecimen;
    
    public Reference<? extends ElectrodeUsageUsedSpecimen> getUsedSpecimen() {
       return this.usedSpecimen;
    }

 

}