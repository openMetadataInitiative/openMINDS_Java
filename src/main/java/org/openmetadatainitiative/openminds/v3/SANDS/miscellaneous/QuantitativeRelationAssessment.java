package org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntityVersion;
import org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.QuantitativeRelationAssessmentQuantitativeOverlap;
import org.openmetadatainitiative.openminds.v3.core.research.ProtocolExecution;


import static org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.QuantitativeRelationAssessment.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuantitativeRelationAssessment extends Instance implements org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.ParcellationEntityVersionRelationAssessment, org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnatomicalEntityRelationAssessment{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/QuantitativeRelationAssessment";

    @JsonIgnore
    public Reference<QuantitativeRelationAssessment> getReference() {
        return doGetReference();
    }

    public static Reference<QuantitativeRelationAssessment> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private QuantitativeRelationAssessment(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<QuantitativeRelationAssessment>{
        
        public Builder criteria(Reference<ProtocolExecution> criteria) { QuantitativeRelationAssessment.this.criteria = criteria; return this; }
        
        public Builder inRelationTo(Reference<ParcellationEntityVersion> inRelationTo) { QuantitativeRelationAssessment.this.inRelationTo = inRelationTo; return this; }
        
        public Builder quantitativeOverlap(QuantitativeRelationAssessmentQuantitativeOverlap quantitativeOverlap) { QuantitativeRelationAssessment.this.quantitativeOverlap = quantitativeOverlap; return this; }
        

        public QuantitativeRelationAssessment build(OpenMINDSContext context) {
            if (QuantitativeRelationAssessment.this.id == null) {
                QuantitativeRelationAssessment.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            QuantitativeRelationAssessment.this.type = SEMANTIC_NAME;
            return QuantitativeRelationAssessment.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/criteria")
    private Reference<ProtocolExecution> criteria;
    
    /**
    * Aspects or standards on which a judgement or decision is based.
    */
    public Reference<ProtocolExecution> getCriteria() {
       return this.criteria;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/inRelationTo")
    private Reference<ParcellationEntityVersion> inRelationTo;
    
    /**
    * Reference to a related element.
    */
    public Reference<ParcellationEntityVersion> getInRelationTo() {
       return this.inRelationTo;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/quantitativeOverlap")
    private QuantitativeRelationAssessmentQuantitativeOverlap quantitativeOverlap;
    
    /**
    * Numerical characterization of how much two things occupy the same space.
    */
    public QuantitativeRelationAssessmentQuantitativeOverlap getQuantitativeOverlap() {
       return this.quantitativeOverlap;
    }

 
    public static QuantitativeRelationAssessment.Builder create(LocalId localId){
        return new QuantitativeRelationAssessment(localId).new Builder();
    }

    public QuantitativeRelationAssessment.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, QuantitativeRelationAssessment.class).new Builder();
    }
}