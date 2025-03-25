package org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.CoordinatePoint;
import org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.ViewerSpecificationPreferredDisplayColor;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.ViewerSpecification.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ViewerSpecification extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/ViewerSpecification";

    @JsonIgnore
    public Reference<ViewerSpecification> getReference() {
        return doGetReference();
    }

    public static Reference<ViewerSpecification> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ViewerSpecification() {
        this(null);
    }

    private ViewerSpecification(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder additionalRemarks(String additionalRemarks) { ViewerSpecification.this.additionalRemarks = additionalRemarks; return this; }
        public EmbeddedBuilder anchorPoint(List<Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue>> anchorPoint) { ViewerSpecification.this.anchorPoint = anchorPoint.stream().map(b -> b.apply(QuantitativeValue.createEmbedded())).toList(); return this; }
        public EmbeddedBuilder cameraPosition(Function<CoordinatePoint.EmbeddedBuilder, CoordinatePoint> cameraPosition) { ViewerSpecification.this.cameraPosition = cameraPosition.apply(CoordinatePoint.createEmbedded()); return this; }
        public EmbeddedBuilder preferredDisplayColor(Reference<? extends ViewerSpecificationPreferredDisplayColor> preferredDisplayColor) { ViewerSpecification.this.preferredDisplayColor = preferredDisplayColor; return this; }
        

        public ViewerSpecification build(){
            return ViewerSpecification.this;
        }
    }

    public static ViewerSpecification.EmbeddedBuilder createEmbedded(){
        return new ViewerSpecification(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.om-i.org/props/additionalRemarks")
    private String additionalRemarks;
    
    /**
    * Mention of what deserves additional attention or notice.
    */
    public String getAdditionalRemarks() {
       return this.additionalRemarks;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/anchorPoint")
    private List<QuantitativeValue> anchorPoint;
    
    public List<QuantitativeValue> getAnchorPoint() {
       return this.anchorPoint;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/cameraPosition")
    private CoordinatePoint cameraPosition;
    
    public CoordinatePoint getCameraPosition() {
       return this.cameraPosition;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/preferredDisplayColor")
    private Reference<? extends ViewerSpecificationPreferredDisplayColor> preferredDisplayColor;
    
    public Reference<? extends ViewerSpecificationPreferredDisplayColor> getPreferredDisplayColor() {
       return this.preferredDisplayColor;
    }

 

}