package org.openmetadatainitiative.openminds.latest.ephys.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.DeviceType;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayConductorMaterial;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayInsulatorMaterial;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayIntrinsicResistance;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayManufacturer;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayOwner;


import static org.openmetadatainitiative.openminds.latest.ephys.device.ElectrodeArray.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElectrodeArray extends Instance implements org.openmetadatainitiative.openminds.latest.core.products.intf.SetupHasPart{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/ElectrodeArray";

    @JsonIgnore
    public Reference<ElectrodeArray> getReference() {
        return doGetReference();
    }

    public static Reference<ElectrodeArray> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ElectrodeArray(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ElectrodeArray>{
        
        public Builder conductorMaterial(Reference<? extends ElectrodeArrayConductorMaterial> conductorMaterial) { ElectrodeArray.this.conductorMaterial = conductorMaterial; return this; }
        
        public Builder description(String description) { ElectrodeArray.this.description = description; return this; }
        
        public Builder deviceType(Reference<DeviceType> deviceType) { ElectrodeArray.this.deviceType = deviceType; return this; }
        
        public Builder digitalIdentifier(Reference<? extends ElectrodeArrayDigitalIdentifier> digitalIdentifier) { ElectrodeArray.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder electrodeIdentifier(List<String> electrodeIdentifier) { ElectrodeArray.this.electrodeIdentifier = electrodeIdentifier; return this; }
        
        public Builder insulatorMaterial(Reference<? extends ElectrodeArrayInsulatorMaterial> insulatorMaterial) { ElectrodeArray.this.insulatorMaterial = insulatorMaterial; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { ElectrodeArray.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder intrinsicResistance(ElectrodeArrayIntrinsicResistance intrinsicResistance) { ElectrodeArray.this.intrinsicResistance = intrinsicResistance; return this; }
        
        public Builder lookupLabel(String lookupLabel) { ElectrodeArray.this.lookupLabel = lookupLabel; return this; }
        
        public Builder manufacturer(List<Reference<? extends ElectrodeArrayManufacturer>> manufacturer) { ElectrodeArray.this.manufacturer = manufacturer; return this; }
        
        public Builder name(String name) { ElectrodeArray.this.name = name; return this; }
        
        public Builder numberOfElectrodes(Object numberOfElectrodes) { ElectrodeArray.this.numberOfElectrodes = numberOfElectrodes; return this; }
        
        public Builder owner(List<Reference<? extends ElectrodeArrayOwner>> owner) { ElectrodeArray.this.owner = owner; return this; }
        
        public Builder serialNumber(String serialNumber) { ElectrodeArray.this.serialNumber = serialNumber; return this; }
        

        public ElectrodeArray build(OpenMINDSContext context) {
            if (ElectrodeArray.this.id == null) {
                ElectrodeArray.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            ElectrodeArray.this.type = SEMANTIC_NAME;
            return ElectrodeArray.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/conductorMaterial")
    private Reference<? extends ElectrodeArrayConductorMaterial> conductorMaterial;
    
    public Reference<? extends ElectrodeArrayConductorMaterial> getConductorMaterial() {
       return this.conductorMaterial;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/deviceType")
    private Reference<DeviceType> deviceType;
    
    public Reference<DeviceType> getDeviceType() {
       return this.deviceType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends ElectrodeArrayDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends ElectrodeArrayDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/electrodeIdentifier")
    private List<String> electrodeIdentifier;
    
    public List<String> getElectrodeIdentifier() {
       return this.electrodeIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/insulatorMaterial")
    private Reference<? extends ElectrodeArrayInsulatorMaterial> insulatorMaterial;
    
    public Reference<? extends ElectrodeArrayInsulatorMaterial> getInsulatorMaterial() {
       return this.insulatorMaterial;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/intrinsicResistance")
    private ElectrodeArrayIntrinsicResistance intrinsicResistance;
    
    public ElectrodeArrayIntrinsicResistance getIntrinsicResistance() {
       return this.intrinsicResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/manufacturer")
    private List<Reference<? extends ElectrodeArrayManufacturer>> manufacturer;
    
    public List<Reference<? extends ElectrodeArrayManufacturer>> getManufacturer() {
       return this.manufacturer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/numberOfElectrodes")
    private Object numberOfElectrodes;
    
    public Object getNumberOfElectrodes() {
       return this.numberOfElectrodes;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/owner")
    private List<Reference<? extends ElectrodeArrayOwner>> owner;
    
    public List<Reference<? extends ElectrodeArrayOwner>> getOwner() {
       return this.owner;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/serialNumber")
    private String serialNumber;
    
    public String getSerialNumber() {
       return this.serialNumber;
    }

 
    public static ElectrodeArray.Builder create(LocalId localId){
        return new ElectrodeArray(localId).new Builder();
    }

    public ElectrodeArray.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ElectrodeArray.class).new Builder();
    }
}