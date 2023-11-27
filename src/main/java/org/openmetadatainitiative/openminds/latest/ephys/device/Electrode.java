package org.openmetadatainitiative.openminds.latest.ephys.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.DeviceType;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeConductorMaterial;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeInsulatorMaterial;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeIntrinsicResistance;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeManufacturer;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeOwner;


import static org.openmetadatainitiative.openminds.latest.ephys.device.Electrode.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Electrode extends Instance implements org.openmetadatainitiative.openminds.latest.core.products.intf.SetupHasPart{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/Electrode";

    @JsonIgnore
    public Reference<Electrode> getReference() {
        return doGetReference();
    }

    public static Reference<Electrode> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Electrode(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Electrode>{
        
        public Builder conductorMaterial(Reference<? extends ElectrodeConductorMaterial> conductorMaterial) { Electrode.this.conductorMaterial = conductorMaterial; return this; }
        
        public Builder description(String description) { Electrode.this.description = description; return this; }
        
        public Builder deviceType(Reference<DeviceType> deviceType) { Electrode.this.deviceType = deviceType; return this; }
        
        public Builder digitalIdentifier(Reference<? extends ElectrodeDigitalIdentifier> digitalIdentifier) { Electrode.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder insulatorMaterial(Reference<? extends ElectrodeInsulatorMaterial> insulatorMaterial) { Electrode.this.insulatorMaterial = insulatorMaterial; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { Electrode.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder intrinsicResistance(ElectrodeIntrinsicResistance intrinsicResistance) { Electrode.this.intrinsicResistance = intrinsicResistance; return this; }
        
        public Builder lookupLabel(String lookupLabel) { Electrode.this.lookupLabel = lookupLabel; return this; }
        
        public Builder manufacturer(List<Reference<? extends ElectrodeManufacturer>> manufacturer) { Electrode.this.manufacturer = manufacturer; return this; }
        
        public Builder name(String name) { Electrode.this.name = name; return this; }
        
        public Builder owner(List<Reference<? extends ElectrodeOwner>> owner) { Electrode.this.owner = owner; return this; }
        
        public Builder serialNumber(String serialNumber) { Electrode.this.serialNumber = serialNumber; return this; }
        

        public Electrode build() {
            if (Electrode.this.id == null) {
                Electrode.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Electrode.this.types == null || Electrode.this.types.isEmpty() || !Electrode.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Electrode.this.types;
                Electrode.this.types = new ArrayList<>();
                Electrode.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Electrode.this.types.addAll(oldValues);
                }
            }
            return Electrode.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/conductorMaterial")
    private Reference<? extends ElectrodeConductorMaterial> conductorMaterial;
    
    public Reference<? extends ElectrodeConductorMaterial> getConductorMaterial() {
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
    private Reference<? extends ElectrodeDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends ElectrodeDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/insulatorMaterial")
    private Reference<? extends ElectrodeInsulatorMaterial> insulatorMaterial;
    
    public Reference<? extends ElectrodeInsulatorMaterial> getInsulatorMaterial() {
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
    private ElectrodeIntrinsicResistance intrinsicResistance;
    
    public ElectrodeIntrinsicResistance getIntrinsicResistance() {
       return this.intrinsicResistance;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/manufacturer")
    private List<Reference<? extends ElectrodeManufacturer>> manufacturer;
    
    public List<Reference<? extends ElectrodeManufacturer>> getManufacturer() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/owner")
    private List<Reference<? extends ElectrodeOwner>> owner;
    
    public List<Reference<? extends ElectrodeOwner>> getOwner() {
       return this.owner;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/serialNumber")
    private String serialNumber;
    
    public String getSerialNumber() {
       return this.serialNumber;
    }

 
    public static Electrode.Builder create(LocalId localId){
        return new Electrode(localId).new Builder();
    }

    public Electrode.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Electrode.class).new Builder();
    }
}