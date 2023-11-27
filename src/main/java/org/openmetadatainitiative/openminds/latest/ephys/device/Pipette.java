package org.openmetadatainitiative.openminds.latest.ephys.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.DeviceType;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteManufacturer;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteMaterial;
import org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteOwner;


import static org.openmetadatainitiative.openminds.latest.ephys.device.Pipette.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pipette extends Instance implements org.openmetadatainitiative.openminds.latest.core.products.intf.SetupHasPart{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/Pipette";

    @JsonIgnore
    public Reference<Pipette> getReference() {
        return doGetReference();
    }

    public static Reference<Pipette> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private Pipette(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Pipette>{
        
        public Builder description(String description) { Pipette.this.description = description; return this; }
        
        public Builder deviceType(Reference<DeviceType> deviceType) { Pipette.this.deviceType = deviceType; return this; }
        
        public Builder digitalIdentifier(Reference<? extends PipetteDigitalIdentifier> digitalIdentifier) { Pipette.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder externalDiameter(QuantitativeValue externalDiameter) { Pipette.this.externalDiameter = externalDiameter; return this; }
        
        public Builder internalDiameter(QuantitativeValue internalDiameter) { Pipette.this.internalDiameter = internalDiameter; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { Pipette.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder lookupLabel(String lookupLabel) { Pipette.this.lookupLabel = lookupLabel; return this; }
        
        public Builder manufacturer(List<Reference<? extends PipetteManufacturer>> manufacturer) { Pipette.this.manufacturer = manufacturer; return this; }
        
        public Builder material(Reference<? extends PipetteMaterial> material) { Pipette.this.material = material; return this; }
        
        public Builder name(String name) { Pipette.this.name = name; return this; }
        
        public Builder owner(List<Reference<? extends PipetteOwner>> owner) { Pipette.this.owner = owner; return this; }
        
        public Builder serialNumber(String serialNumber) { Pipette.this.serialNumber = serialNumber; return this; }
        

        public Pipette build(OpenMINDSContext context) {
            if (Pipette.this.id == null) {
                Pipette.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            Pipette.this.atType = SEMANTIC_NAME;
            return Pipette.this;
        }
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
    private Reference<? extends PipetteDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends PipetteDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/externalDiameter")
    private QuantitativeValue externalDiameter;
    
    public QuantitativeValue getExternalDiameter() {
       return this.externalDiameter;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalDiameter")
    private QuantitativeValue internalDiameter;
    
    public QuantitativeValue getInternalDiameter() {
       return this.internalDiameter;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/manufacturer")
    private List<Reference<? extends PipetteManufacturer>> manufacturer;
    
    public List<Reference<? extends PipetteManufacturer>> getManufacturer() {
       return this.manufacturer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/material")
    private Reference<? extends PipetteMaterial> material;
    
    public Reference<? extends PipetteMaterial> getMaterial() {
       return this.material;
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
    private List<Reference<? extends PipetteOwner>> owner;
    
    public List<Reference<? extends PipetteOwner>> getOwner() {
       return this.owner;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/serialNumber")
    private String serialNumber;
    
    public String getSerialNumber() {
       return this.serialNumber;
    }

 
    public static Pipette.Builder create(LocalId localId){
        return new Pipette(localId).new Builder();
    }

    public Pipette.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Pipette.class).new Builder();
    }
}