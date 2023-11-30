package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.research.intf.PropertyValueListPropertyValuePair;


import static org.openmetadatainitiative.openminds.v3.core.research.PropertyValueList.SEMANTIC_NAME;
/**
 * An identifiable list of property-value pairs.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class PropertyValueList extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionConfiguration, org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnnotationSpecification, org.openmetadatainitiative.openminds.v3.core.research.intf.CustomPropertySetDataLocation{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/PropertyValueList";

    @JsonIgnore
    public Reference<PropertyValueList> getReference() {
        return doGetReference();
    }

    public static Reference<PropertyValueList> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private PropertyValueList() {
        this(null);
    }

    private PropertyValueList(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<PropertyValueList>{
        public Builder lookupLabel(String lookupLabel) { PropertyValueList.this.lookupLabel = lookupLabel; return this; }
        public Builder propertyValuePair(List<Function<PropertyValueListPropertyValuePair.EmbeddedBuilder, PropertyValueListPropertyValuePair>> propertyValuePair) { PropertyValueList.this.propertyValuePair = propertyValuePair.stream().map(b -> b.apply(PropertyValueListPropertyValuePair.createEmbedded())).toList(); return this; }
        

        public PropertyValueList build(OpenMINDSContext context) {
            PropertyValueList.super.build(context);
            return PropertyValueList.this;
        }
    }

    public static PropertyValueList.Builder create(LocalId localId){
        return new PropertyValueList(localId).new Builder();
    }

    public PropertyValueList.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, PropertyValueList.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/propertyValuePair")
    private List<? extends PropertyValueListPropertyValuePair> propertyValuePair;
    
    public List<? extends PropertyValueListPropertyValuePair> getPropertyValuePair() {
       return this.propertyValuePair;
    }

 

}