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

import org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.QualitativeRelationAssessmentInRelationTo;
import org.openmetadatainitiative.openminds.latest.controlledTerms.QualitativeOverlap;
import org.openmetadatainitiative.openminds.latest.core.research.ProtocolExecution;


import static org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.QualitativeRelationAssessment.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class QualitativeRelationAssessment extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.ParcellationEntityVersionRelationAssessment, org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.intf.CustomAnatomicalEntityRelationAssessment{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/QualitativeRelationAssessment";

    @JsonIgnore
    public Reference<QualitativeRelationAssessment> getReference() {
        return doGetReference();
    }

    public static Reference<QualitativeRelationAssessment> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private QualitativeRelationAssessment() {
        this(null);
    }

    private QualitativeRelationAssessment(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder criteria(Reference<ProtocolExecution> criteria) { QualitativeRelationAssessment.this.criteria = criteria; return this; }
        public EmbeddedBuilder inRelationTo(Reference<? extends QualitativeRelationAssessmentInRelationTo> inRelationTo) { QualitativeRelationAssessment.this.inRelationTo = inRelationTo; return this; }
        public EmbeddedBuilder qualitativeOverlap(Reference<QualitativeOverlap> qualitativeOverlap) { QualitativeRelationAssessment.this.qualitativeOverlap = qualitativeOverlap; return this; }
        

        public QualitativeRelationAssessment build(){
            return QualitativeRelationAssessment.this;
        }
    }

    public static QualitativeRelationAssessment.EmbeddedBuilder createEmbedded(){
        return new QualitativeRelationAssessment(null).new EmbeddedBuilder();
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
    private Reference<? extends QualitativeRelationAssessmentInRelationTo> inRelationTo;
    
    /**
    * Reference to a related element.
    */
    public Reference<? extends QualitativeRelationAssessmentInRelationTo> getInRelationTo() {
       return this.inRelationTo;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/qualitativeOverlap")
    private Reference<QualitativeOverlap> qualitativeOverlap;
    
    /**
    * Semantic characterization of how much two things occupy the same space.
    */
    public Reference<QualitativeOverlap> getQualitativeOverlap() {
       return this.qualitativeOverlap;
    }

 

}