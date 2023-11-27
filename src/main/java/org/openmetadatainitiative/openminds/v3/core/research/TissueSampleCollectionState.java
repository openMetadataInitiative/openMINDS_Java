package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.TissueSampleAttribute;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateAge;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateDescendedFrom;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStatePathology;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateRelativeTimeIndication;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateWeight;


import static org.openmetadatainitiative.openminds.v3.core.research.TissueSampleCollectionState.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TissueSampleCollectionState extends Instance implements org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityInput, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionOutput, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateDescendedFrom, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateDescendedFrom, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueCulturePreparationInput, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingInput, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingOutput, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityInput, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityOutput{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/TissueSampleCollectionState";

    @JsonIgnore
    public Reference<TissueSampleCollectionState> getReference() {
        return doGetReference();
    }

    public static Reference<TissueSampleCollectionState> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private TissueSampleCollectionState(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<TissueSampleCollectionState>{
        
        public Builder additionalRemarks(String additionalRemarks) { TissueSampleCollectionState.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder age(TissueSampleCollectionStateAge age) { TissueSampleCollectionState.this.age = age; return this; }
        
        public Builder attribute(List<Reference<TissueSampleAttribute>> attribute) { TissueSampleCollectionState.this.attribute = attribute; return this; }
        
        public Builder descendedFrom(List<Reference<? extends TissueSampleCollectionStateDescendedFrom>> descendedFrom) { TissueSampleCollectionState.this.descendedFrom = descendedFrom; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { TissueSampleCollectionState.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder lookupLabel(String lookupLabel) { TissueSampleCollectionState.this.lookupLabel = lookupLabel; return this; }
        
        public Builder pathology(List<Reference<? extends TissueSampleCollectionStatePathology>> pathology) { TissueSampleCollectionState.this.pathology = pathology; return this; }
        
        public Builder relativeTimeIndication(TissueSampleCollectionStateRelativeTimeIndication relativeTimeIndication) { TissueSampleCollectionState.this.relativeTimeIndication = relativeTimeIndication; return this; }
        
        public Builder weight(TissueSampleCollectionStateWeight weight) { TissueSampleCollectionState.this.weight = weight; return this; }
        

        public TissueSampleCollectionState build(OpenMINDSContext context) {
            if (TissueSampleCollectionState.this.id == null) {
                TissueSampleCollectionState.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            TissueSampleCollectionState.this.type = SEMANTIC_NAME;
            return TissueSampleCollectionState.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/additionalRemarks")
    private String additionalRemarks;
    
    /**
    * Mention of what deserves additional attention or notice.
    */
    public String getAdditionalRemarks() {
       return this.additionalRemarks;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/age")
    private TissueSampleCollectionStateAge age;
    
    /**
    * Time of life or existence at which some particular qualification, capacity or event arises.
    */
    public TissueSampleCollectionStateAge getAge() {
       return this.age;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/attribute")
    private List<Reference<TissueSampleAttribute>> attribute;
    
    public List<Reference<TissueSampleAttribute>> getAttribute() {
       return this.attribute;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/descendedFrom")
    private List<Reference<? extends TissueSampleCollectionStateDescendedFrom>> descendedFrom;
    
    public List<Reference<? extends TissueSampleCollectionStateDescendedFrom>> getDescendedFrom() {
       return this.descendedFrom;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/pathology")
    private List<Reference<? extends TissueSampleCollectionStatePathology>> pathology;
    
    /**
    * Structural and functional deviation from the normal that constitutes a disease or characterizes a particular disease.
    */
    public List<Reference<? extends TissueSampleCollectionStatePathology>> getPathology() {
       return this.pathology;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relativeTimeIndication")
    private TissueSampleCollectionStateRelativeTimeIndication relativeTimeIndication;
    
    public TissueSampleCollectionStateRelativeTimeIndication getRelativeTimeIndication() {
       return this.relativeTimeIndication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/weight")
    private TissueSampleCollectionStateWeight weight;
    
    /**
    * Amount that a thing or being weighs.
    */
    public TissueSampleCollectionStateWeight getWeight() {
       return this.weight;
    }

 
    public static TissueSampleCollectionState.Builder create(LocalId localId){
        return new TissueSampleCollectionState(localId).new Builder();
    }

    public TissueSampleCollectionState.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, TissueSampleCollectionState.class).new Builder();
    }
}