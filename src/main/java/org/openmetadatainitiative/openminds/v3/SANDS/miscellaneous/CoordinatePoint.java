package org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.CoordinatePointCoordinateSpace;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.CoordinatePoint.SEMANTIC_NAME;
/**
 * Structured information on a coordinate point.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordinatePoint extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/CoordinatePoint";

    @JsonIgnore
    public Reference<CoordinatePoint> getReference() {
        return doGetReference();
    }

    public static Reference<CoordinatePoint> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private CoordinatePoint(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CoordinatePoint>{
        
        public Builder coordinateSpace(Reference<? extends CoordinatePointCoordinateSpace> coordinateSpace) { CoordinatePoint.this.coordinateSpace = coordinateSpace; return this; }
        
        public Builder coordinates(List<QuantitativeValue> coordinates) { CoordinatePoint.this.coordinates = coordinates; return this; }
        

        public CoordinatePoint build(OpenMINDSContext context) {
            if (CoordinatePoint.this.id == null) {
                CoordinatePoint.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            CoordinatePoint.this.atType = SEMANTIC_NAME;
            return CoordinatePoint.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/coordinateSpace")
    private Reference<? extends CoordinatePointCoordinateSpace> coordinateSpace;
    
    /**
    * Two or three dimensional geometric setting.
    */
    public Reference<? extends CoordinatePointCoordinateSpace> getCoordinateSpace() {
       return this.coordinateSpace;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/coordinates")
    private List<QuantitativeValue> coordinates;
    
    /**
    * Pair or triplet of numbers defining a location in a given coordinate space.
    */
    public List<QuantitativeValue> getCoordinates() {
       return this.coordinates;
    }

 
    public static CoordinatePoint.Builder create(LocalId localId){
        return new CoordinatePoint(localId).new Builder();
    }

    public CoordinatePoint.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CoordinatePoint.class).new Builder();
    }
}