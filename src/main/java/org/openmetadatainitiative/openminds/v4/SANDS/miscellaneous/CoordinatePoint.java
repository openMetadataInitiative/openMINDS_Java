package org.openmetadatainitiative.openminds.v4.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v4.SANDS.miscellaneous.intf.CoordinatePointCoordinateSpace;
import org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v4.SANDS.miscellaneous.CoordinatePoint.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class CoordinatePoint extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V4.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/CoordinatePoint";

    @JsonIgnore
    public Reference<CoordinatePoint> getReference() {
        return doGetReference();
    }

    public static Reference<CoordinatePoint> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private CoordinatePoint() {
        this(null);
    }

    private CoordinatePoint(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder coordinateSpace(Reference<? extends CoordinatePointCoordinateSpace> coordinateSpace) { CoordinatePoint.this.coordinateSpace = coordinateSpace; return this; }
        public EmbeddedBuilder coordinates(List<Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue>> coordinates) { CoordinatePoint.this.coordinates = coordinates.stream().map(b -> b.apply(QuantitativeValue.createEmbedded())).toList(); return this; }
        

        public CoordinatePoint build(){
            return CoordinatePoint.this;
        }
    }

    public static CoordinatePoint.EmbeddedBuilder createEmbedded(){
        return new CoordinatePoint(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.om-i.org/props/coordinateSpace")
    private Reference<? extends CoordinatePointCoordinateSpace> coordinateSpace;
    
    /**
    * Two or three dimensional geometric setting.
    */
    public Reference<? extends CoordinatePointCoordinateSpace> getCoordinateSpace() {
       return this.coordinateSpace;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/coordinates")
    private List<QuantitativeValue> coordinates;
    
    /**
    * Pair or triplet of numbers defining a location in a given coordinate space.
    */
    public List<QuantitativeValue> getCoordinates() {
       return this.coordinates;
    }

 

}