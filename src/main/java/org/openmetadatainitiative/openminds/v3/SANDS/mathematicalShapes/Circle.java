package org.openmetadatainitiative.openminds.v3.SANDS.mathematicalShapes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.SANDS.mathematicalShapes.Circle.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Circle extends Instance implements org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationDimension{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/Circle";

    @JsonIgnore
    public Reference<Circle> getReference() {
        return doGetReference();
    }

    public static Reference<Circle> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Circle(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Circle>{
        
        public Builder radius(QuantitativeValue radius) { Circle.this.radius = radius; return this; }
        

        public Circle build() {
            if (Circle.this.id == null) {
                Circle.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Circle.this.types == null || Circle.this.types.isEmpty() || !Circle.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Circle.this.types;
                Circle.this.types = new ArrayList<>();
                Circle.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Circle.this.types.addAll(oldValues);
                }
            }
            return Circle.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/radius")
    private QuantitativeValue radius;
    
    public QuantitativeValue getRadius() {
       return this.radius;
    }

 
    public static Circle.Builder create(LocalId localId){
        return new Circle(localId).new Builder();
    }

    public Circle.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Circle.class).new Builder();
    }
}