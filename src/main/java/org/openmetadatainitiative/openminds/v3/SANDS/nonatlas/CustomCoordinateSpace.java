package org.openmetadatainitiative.openminds.v3.SANDS.nonatlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.AnatomicalAxesOrientation;
import org.openmetadatainitiative.openminds.v3.controlledTerms.UnitOfMeasurement;
import org.openmetadatainitiative.openminds.v3.core.data.File;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.CustomCoordinateSpace.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomCoordinateSpace extends Instance implements org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnnotationCoordinateSpace, org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.CoordinatePointCoordinateSpace, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/CustomCoordinateSpace";

    @JsonIgnore
    public Reference<CustomCoordinateSpace> getReference() {
        return doGetReference();
    }

    public static Reference<CustomCoordinateSpace> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private CustomCoordinateSpace(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CustomCoordinateSpace>{
        
        public Builder anatomicalAxesOrientation(Reference<AnatomicalAxesOrientation> anatomicalAxesOrientation) { CustomCoordinateSpace.this.anatomicalAxesOrientation = anatomicalAxesOrientation; return this; }
        
        public Builder axesOrigin(List<QuantitativeValue> axesOrigin) { CustomCoordinateSpace.this.axesOrigin = axesOrigin; return this; }
        
        public Builder defaultImage(List<Reference<File>> defaultImage) { CustomCoordinateSpace.this.defaultImage = defaultImage; return this; }
        
        public Builder name(String name) { CustomCoordinateSpace.this.name = name; return this; }
        
        public Builder nativeUnit(Reference<UnitOfMeasurement> nativeUnit) { CustomCoordinateSpace.this.nativeUnit = nativeUnit; return this; }
        

        public CustomCoordinateSpace build(OpenMINDSContext context) {
            if (CustomCoordinateSpace.this.id == null) {
                CustomCoordinateSpace.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            CustomCoordinateSpace.this.atType = SEMANTIC_NAME;
            return CustomCoordinateSpace.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalAxesOrientation")
    private Reference<AnatomicalAxesOrientation> anatomicalAxesOrientation;
    
    /**
    * Relation between reference planes used in anatomy and mathematics.
    */
    public Reference<AnatomicalAxesOrientation> getAnatomicalAxesOrientation() {
       return this.anatomicalAxesOrientation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/axesOrigin")
    private List<QuantitativeValue> axesOrigin;
    
    /**
    * Special point in a coordinate system used as a fixed point of reference for the geometry of the surrounding space.
    */
    public List<QuantitativeValue> getAxesOrigin() {
       return this.axesOrigin;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/defaultImage")
    private List<Reference<File>> defaultImage;
    
    /**
    * Two or three dimensional image that particluarly represents a specific coordinate space.
    */
    public List<Reference<File>> getDefaultImage() {
       return this.defaultImage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/nativeUnit")
    private Reference<UnitOfMeasurement> nativeUnit;
    
    /**
    * Determinate quantity used in the original measurement.
    */
    public Reference<UnitOfMeasurement> getNativeUnit() {
       return this.nativeUnit;
    }

 
    public static CustomCoordinateSpace.Builder create(LocalId localId){
        return new CustomCoordinateSpace(localId).new Builder();
    }

    public CustomCoordinateSpace.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CustomCoordinateSpace.class).new Builder();
    }
}