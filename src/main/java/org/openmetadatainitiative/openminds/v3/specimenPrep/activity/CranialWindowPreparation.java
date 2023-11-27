package org.openmetadatainitiative.openminds.v3.specimenPrep.activity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.CranialWindowConstructionType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.CranialWindowReinforcementType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.PreparationType;
import org.openmetadatainitiative.openminds.v3.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;
import org.openmetadatainitiative.openminds.v3.core.research.Protocol;
import org.openmetadatainitiative.openminds.v3.core.research.SubjectState;
import org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationDimension;
import org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationPerformedBy;
import org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationStudyTarget;


import static org.openmetadatainitiative.openminds.v3.specimenPrep.activity.CranialWindowPreparation.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CranialWindowPreparation extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/specimenPrep/CranialWindowPreparation";

    @JsonIgnore
    public Reference<CranialWindowPreparation> getReference() {
        return doGetReference();
    }

    public static Reference<CranialWindowPreparation> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private CranialWindowPreparation(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CranialWindowPreparation>{
        
        public Builder constructionType(Reference<CranialWindowConstructionType> constructionType) { CranialWindowPreparation.this.constructionType = constructionType; return this; }
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { CranialWindowPreparation.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { CranialWindowPreparation.this.description = description; return this; }
        
        public Builder dimension(CranialWindowPreparationDimension dimension) { CranialWindowPreparation.this.dimension = dimension; return this; }
        
        public Builder endTime(String endTime) { CranialWindowPreparation.this.endTime = endTime; return this; }
        
        public Builder input(List<Reference<SubjectState>> input) { CranialWindowPreparation.this.input = input; return this; }
        
        public Builder isPartOf(Reference<DatasetVersion> isPartOf) { CranialWindowPreparation.this.isPartOf = isPartOf; return this; }
        
        public Builder lookupLabel(String lookupLabel) { CranialWindowPreparation.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<SubjectState>> output) { CranialWindowPreparation.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends CranialWindowPreparationPerformedBy>> performedBy) { CranialWindowPreparation.this.performedBy = performedBy; return this; }
        
        public Builder preparationDesign(Reference<PreparationType> preparationDesign) { CranialWindowPreparation.this.preparationDesign = preparationDesign; return this; }
        
        public Builder protocol(List<Reference<Protocol>> protocol) { CranialWindowPreparation.this.protocol = protocol; return this; }
        
        public Builder reinforcementType(Reference<CranialWindowReinforcementType> reinforcementType) { CranialWindowPreparation.this.reinforcementType = reinforcementType; return this; }
        
        public Builder startTime(String startTime) { CranialWindowPreparation.this.startTime = startTime; return this; }
        
        public Builder studyTarget(List<Reference<? extends CranialWindowPreparationStudyTarget>> studyTarget) { CranialWindowPreparation.this.studyTarget = studyTarget; return this; }
        

        public CranialWindowPreparation build(OpenMINDSContext context) {
            if (CranialWindowPreparation.this.id == null) {
                CranialWindowPreparation.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            CranialWindowPreparation.this.atType = SEMANTIC_NAME;
            return CranialWindowPreparation.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/constructionType")
    private Reference<CranialWindowConstructionType> constructionType;
    
    public Reference<CranialWindowConstructionType> getConstructionType() {
       return this.constructionType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/customPropertySet")
    private List<CustomPropertySet> customPropertySet;
    
    public List<CustomPropertySet> getCustomPropertySet() {
       return this.customPropertySet;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dimension")
    private CranialWindowPreparationDimension dimension;
    
    public CranialWindowPreparationDimension getDimension() {
       return this.dimension;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/endTime")
    private String endTime;
    
    public String getEndTime() {
       return this.endTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<SubjectState>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<SubjectState>> getInput() {
       return this.input;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<DatasetVersion> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<DatasetVersion> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/output")
    private List<Reference<SubjectState>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<SubjectState>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends CranialWindowPreparationPerformedBy>> performedBy;
    
    public List<Reference<? extends CranialWindowPreparationPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/preparationDesign")
    private Reference<PreparationType> preparationDesign;
    
    public Reference<PreparationType> getPreparationDesign() {
       return this.preparationDesign;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/protocol")
    private List<Reference<Protocol>> protocol;
    
    /**
    * Plan that describes the process of a scientific or medical experiment, treatment, or procedure.
    */
    public List<Reference<Protocol>> getProtocol() {
       return this.protocol;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/reinforcementType")
    private Reference<CranialWindowReinforcementType> reinforcementType;
    
    public Reference<CranialWindowReinforcementType> getReinforcementType() {
       return this.reinforcementType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends CranialWindowPreparationStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends CranialWindowPreparationStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

 
    public static CranialWindowPreparation.Builder create(LocalId localId){
        return new CranialWindowPreparation(localId).new Builder();
    }

    public CranialWindowPreparation.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CranialWindowPreparation.class).new Builder();
    }
}