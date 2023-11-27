package org.openmetadatainitiative.openminds.v3.ephys.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.CoordinatePoint;
import org.openmetadatainitiative.openminds.v3.ephys.device.ElectrodeArray;
import org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageAnatomicalLocationOfArray;
import org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageAnatomicalLocationOfElectrodes;
import org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageContactResistances;
import org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageMetadataLocation;
import org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageUsedSpecimen;


import static org.openmetadatainitiative.openminds.v3.ephys.device.ElectrodeArrayUsage.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElectrodeArrayUsage extends Instance implements org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementDevice, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingDevice, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityDevice, org.openmetadatainitiative.openminds.v3.ephys.entity.intf.RecordingRecordedWith, org.openmetadatainitiative.openminds.v3.core.data.intf.MeasurementMeasuredWith{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/ElectrodeArrayUsage";

    @JsonIgnore
    public Reference<ElectrodeArrayUsage> getReference() {
        return doGetReference();
    }

    public static Reference<ElectrodeArrayUsage> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ElectrodeArrayUsage(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ElectrodeArrayUsage>{
        
        public Builder anatomicalLocationOfArray(List<Reference<? extends ElectrodeArrayUsageAnatomicalLocationOfArray>> anatomicalLocationOfArray) { ElectrodeArrayUsage.this.anatomicalLocationOfArray = anatomicalLocationOfArray; return this; }
        
        public Builder anatomicalLocationOfElectrodes(List<Reference<? extends ElectrodeArrayUsageAnatomicalLocationOfElectrodes>> anatomicalLocationOfElectrodes) { ElectrodeArrayUsage.this.anatomicalLocationOfElectrodes = anatomicalLocationOfElectrodes; return this; }
        
        public Builder contactResistances(List<? extends ElectrodeArrayUsageContactResistances> contactResistances) { ElectrodeArrayUsage.this.contactResistances = contactResistances; return this; }
        
        public Builder device(Reference<ElectrodeArray> device) { ElectrodeArrayUsage.this.device = device; return this; }
        
        public Builder lookupLabel(String lookupLabel) { ElectrodeArrayUsage.this.lookupLabel = lookupLabel; return this; }
        
        public Builder metadataLocation(List<Reference<? extends ElectrodeArrayUsageMetadataLocation>> metadataLocation) { ElectrodeArrayUsage.this.metadataLocation = metadataLocation; return this; }
        
        public Builder spatialLocationOfElectrodes(List<CoordinatePoint> spatialLocationOfElectrodes) { ElectrodeArrayUsage.this.spatialLocationOfElectrodes = spatialLocationOfElectrodes; return this; }
        
        public Builder usedElectrode(List<String> usedElectrode) { ElectrodeArrayUsage.this.usedElectrode = usedElectrode; return this; }
        
        public Builder usedSpecimen(Reference<? extends ElectrodeArrayUsageUsedSpecimen> usedSpecimen) { ElectrodeArrayUsage.this.usedSpecimen = usedSpecimen; return this; }
        

        public ElectrodeArrayUsage build() {
            if (ElectrodeArrayUsage.this.id == null) {
                ElectrodeArrayUsage.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ElectrodeArrayUsage.this.types == null || ElectrodeArrayUsage.this.types.isEmpty() || !ElectrodeArrayUsage.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ElectrodeArrayUsage.this.types;
                ElectrodeArrayUsage.this.types = new ArrayList<>();
                ElectrodeArrayUsage.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ElectrodeArrayUsage.this.types.addAll(oldValues);
                }
            }
            return ElectrodeArrayUsage.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalLocationOfArray")
    private List<Reference<? extends ElectrodeArrayUsageAnatomicalLocationOfArray>> anatomicalLocationOfArray;
    
    public List<Reference<? extends ElectrodeArrayUsageAnatomicalLocationOfArray>> getAnatomicalLocationOfArray() {
       return this.anatomicalLocationOfArray;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalLocationOfElectrodes")
    private List<Reference<? extends ElectrodeArrayUsageAnatomicalLocationOfElectrodes>> anatomicalLocationOfElectrodes;
    
    public List<Reference<? extends ElectrodeArrayUsageAnatomicalLocationOfElectrodes>> getAnatomicalLocationOfElectrodes() {
       return this.anatomicalLocationOfElectrodes;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contactResistances")
    private List<? extends ElectrodeArrayUsageContactResistances> contactResistances;
    
    public List<? extends ElectrodeArrayUsageContactResistances> getContactResistances() {
       return this.contactResistances;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/device")
    private Reference<ElectrodeArray> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public Reference<ElectrodeArray> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/metadataLocation")
    private List<Reference<? extends ElectrodeArrayUsageMetadataLocation>> metadataLocation;
    
    public List<Reference<? extends ElectrodeArrayUsageMetadataLocation>> getMetadataLocation() {
       return this.metadataLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/spatialLocationOfElectrodes")
    private List<CoordinatePoint> spatialLocationOfElectrodes;
    
    public List<CoordinatePoint> getSpatialLocationOfElectrodes() {
       return this.spatialLocationOfElectrodes;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedElectrode")
    private List<String> usedElectrode;
    
    public List<String> getUsedElectrode() {
       return this.usedElectrode;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecimen")
    private Reference<? extends ElectrodeArrayUsageUsedSpecimen> usedSpecimen;
    
    public Reference<? extends ElectrodeArrayUsageUsedSpecimen> getUsedSpecimen() {
       return this.usedSpecimen;
    }

 
    public static ElectrodeArrayUsage.Builder create(LocalId localId){
        return new ElectrodeArrayUsage(localId).new Builder();
    }

    public ElectrodeArrayUsage.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ElectrodeArrayUsage.class).new Builder();
    }
}