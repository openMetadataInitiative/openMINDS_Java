package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.ViewerSpecification;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnnotationCriteriaType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnnotationType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.CriteriaQualityType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Laterality;
import org.openmetadatainitiative.openminds.latest.core.data.File;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;
import org.openmetadatainitiative.openminds.latest.core.research.ProtocolExecution;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.AtlasAnnotation.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class AtlasAnnotation extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/AtlasAnnotation";

    @JsonIgnore
    public Reference<AtlasAnnotation> getReference() {
        return doGetReference();
    }

    public static Reference<AtlasAnnotation> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private AtlasAnnotation() {
        this(null);
    }

    private AtlasAnnotation(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder anchorPoint(List<Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue>> anchorPoint) { AtlasAnnotation.this.anchorPoint = anchorPoint.stream().map(b -> b.apply(QuantitativeValue.createEmbedded())).toList(); return this; }
        public EmbeddedBuilder criteria(Reference<ProtocolExecution> criteria) { AtlasAnnotation.this.criteria = criteria; return this; }
        public EmbeddedBuilder criteriaQualityType(Reference<CriteriaQualityType> criteriaQualityType) { AtlasAnnotation.this.criteriaQualityType = criteriaQualityType; return this; }
        public EmbeddedBuilder criteriaType(Reference<AnnotationCriteriaType> criteriaType) { AtlasAnnotation.this.criteriaType = criteriaType; return this; }
        public EmbeddedBuilder inspiredBy(List<Reference<File>> inspiredBy) { AtlasAnnotation.this.inspiredBy = inspiredBy; return this; }
        public EmbeddedBuilder internalIdentifier(String internalIdentifier) { AtlasAnnotation.this.internalIdentifier = internalIdentifier; return this; }
        public EmbeddedBuilder laterality(List<Reference<Laterality>> laterality) { AtlasAnnotation.this.laterality = laterality; return this; }
        public EmbeddedBuilder preferredVisualization(Function<ViewerSpecification.EmbeddedBuilder, ViewerSpecification> preferredVisualization) { AtlasAnnotation.this.preferredVisualization = preferredVisualization.apply(ViewerSpecification.createEmbedded()); return this; }
        public EmbeddedBuilder specification(Reference<File> specification) { AtlasAnnotation.this.specification = specification; return this; }
        public EmbeddedBuilder type(Reference<AnnotationType> type) { AtlasAnnotation.this.type = type; return this; }
        

        public AtlasAnnotation build(){
            return AtlasAnnotation.this;
        }
    }

    public static AtlasAnnotation.EmbeddedBuilder createEmbedded(){
        return new AtlasAnnotation(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.om-i.org/props/anchorPoint")
    private List<QuantitativeValue> anchorPoint;
    
    public List<QuantitativeValue> getAnchorPoint() {
       return this.anchorPoint;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/criteria")
    private Reference<ProtocolExecution> criteria;
    
    /**
    * Aspects or standards on which a judgement or decision is based.
    */
    public Reference<ProtocolExecution> getCriteria() {
       return this.criteria;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/criteriaQualityType")
    private Reference<CriteriaQualityType> criteriaQualityType;
    
    /**
    * Distinct class that defines how the judgement or decision was made for a particular criteria.
    */
    public Reference<CriteriaQualityType> getCriteriaQualityType() {
       return this.criteriaQualityType;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/criteriaType")
    private Reference<AnnotationCriteriaType> criteriaType;
    
    public Reference<AnnotationCriteriaType> getCriteriaType() {
       return this.criteriaType;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/inspiredBy")
    private List<Reference<File>> inspiredBy;
    
    /**
    * Reference to an inspiring element.
    */
    public List<Reference<File>> getInspiredBy() {
       return this.inspiredBy;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/laterality")
    private List<Reference<Laterality>> laterality;
    
    /**
    * Differentiation between a pair of lateral homologous parts of the body.
    */
    public List<Reference<Laterality>> getLaterality() {
       return this.laterality;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/preferredVisualization")
    private ViewerSpecification preferredVisualization;
    
    public ViewerSpecification getPreferredVisualization() {
       return this.preferredVisualization;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/specification")
    private Reference<File> specification;
    
    /**
    * Detailed and precise presentation of, or proposal for something.
    */
    public Reference<File> getSpecification() {
       return this.specification;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/type")
    private Reference<AnnotationType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<AnnotationType> getType() {
       return this.type;
    }

 

}