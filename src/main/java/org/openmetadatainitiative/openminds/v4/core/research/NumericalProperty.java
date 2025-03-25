package org.openmetadatainitiative.openminds.v4.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v4.core.research.intf.NumericalPropertyValue;


import static org.openmetadatainitiative.openminds.v4.core.research.NumericalProperty.SEMANTIC_NAME;
/**
 * Structured information about a property of some entity or process whose value is a number.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class NumericalProperty extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V4.Entity, org.openmetadatainitiative.openminds.v4.specimenPrep.device.intf.SlicingDeviceUsageSlicingAngle, org.openmetadatainitiative.openminds.v4.core.research.intf.PropertyValueListPropertyValuePair{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/NumericalProperty";

    @JsonIgnore
    public Reference<NumericalProperty> getReference() {
        return doGetReference();
    }

    public static Reference<NumericalProperty> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private NumericalProperty() {
        this(null);
    }

    private NumericalProperty(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder name(String name) { NumericalProperty.this.name = name; return this; }
        public EmbeddedBuilder value(List<Function<NumericalPropertyValue.EmbeddedBuilder, NumericalPropertyValue>> value) { NumericalProperty.this.value = value.stream().map(b -> b.apply(NumericalPropertyValue.createEmbedded())).toList(); return this; }
        

        public NumericalProperty build(){
            return NumericalProperty.this;
        }
    }

    public static NumericalProperty.EmbeddedBuilder createEmbedded(){
        return new NumericalProperty(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.om-i.org/props/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/value")
    private List<? extends NumericalPropertyValue> value;
    
    /**
    * Entry for a property.
    */
    public List<? extends NumericalPropertyValue> getValue() {
       return this.value;
    }

 

}