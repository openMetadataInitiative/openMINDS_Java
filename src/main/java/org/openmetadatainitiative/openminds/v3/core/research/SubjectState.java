package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.AgeCategory;
import org.openmetadatainitiative.openminds.v3.controlledTerms.Handedness;
import org.openmetadatainitiative.openminds.v3.controlledTerms.SubjectAttribute;
import org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStateAge;
import org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStatePathology;
import org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStateRelativeTimeIndication;
import org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStateWeight;


import static org.openmetadatainitiative.openminds.v3.core.research.SubjectState.SEMANTIC_NAME;
/**
 * Structured information on a temporary state of a subject.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class SubjectState extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementInput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementOutput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingInput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingOutput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityInput, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionOutput, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateDescendedFrom, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateDescendedFrom, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueCulturePreparationInput, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingInput, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityInput, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityOutput{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/SubjectState";

    @JsonIgnore
    public Reference<SubjectState> getReference() {
        return doGetReference();
    }

    public static Reference<SubjectState> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private SubjectState() {
        this(null);
    }

    private SubjectState(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SubjectState>{
        public Builder additionalRemarks(String additionalRemarks) { SubjectState.this.additionalRemarks = additionalRemarks; return this; }
        public Builder age(Function<SubjectStateAge.EmbeddedBuilder, SubjectStateAge> age) { SubjectState.this.age = age.apply(SubjectStateAge.createEmbedded()); return this; }
        public Builder ageCategory(Reference<AgeCategory> ageCategory) { SubjectState.this.ageCategory = ageCategory; return this; }
        public Builder attribute(List<Reference<SubjectAttribute>> attribute) { SubjectState.this.attribute = attribute; return this; }
        public Builder descendedFrom(Reference<SubjectState> descendedFrom) { SubjectState.this.descendedFrom = descendedFrom; return this; }
        public Builder handedness(Reference<Handedness> handedness) { SubjectState.this.handedness = handedness; return this; }
        public Builder internalIdentifier(String internalIdentifier) { SubjectState.this.internalIdentifier = internalIdentifier; return this; }
        public Builder lookupLabel(String lookupLabel) { SubjectState.this.lookupLabel = lookupLabel; return this; }
        public Builder pathology(List<Reference<? extends SubjectStatePathology>> pathology) { SubjectState.this.pathology = pathology; return this; }
        public Builder relativeTimeIndication(Function<SubjectStateRelativeTimeIndication.EmbeddedBuilder, SubjectStateRelativeTimeIndication> relativeTimeIndication) { SubjectState.this.relativeTimeIndication = relativeTimeIndication.apply(SubjectStateRelativeTimeIndication.createEmbedded()); return this; }
        public Builder weight(Function<SubjectStateWeight.EmbeddedBuilder, SubjectStateWeight> weight) { SubjectState.this.weight = weight.apply(SubjectStateWeight.createEmbedded()); return this; }
        

        public SubjectState build(OpenMINDSContext context) {
            SubjectState.super.build(context);
            return SubjectState.this;
        }
    }

    public static SubjectState.Builder create(LocalId localId){
        return new SubjectState(localId).new Builder();
    }

    public SubjectState.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SubjectState.class).new Builder();
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
    private SubjectStateAge age;
    
    /**
    * Time of life or existence at which some particular qualification, capacity or event arises.
    */
    public SubjectStateAge getAge() {
       return this.age;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ageCategory")
    private Reference<AgeCategory> ageCategory;
    
    /**
    * Distinct life cycle class that is defined by a similar age or age range (developmental stage) within a group of individual beings.
    */
    public Reference<AgeCategory> getAgeCategory() {
       return this.ageCategory;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/attribute")
    private List<Reference<SubjectAttribute>> attribute;
    
    public List<Reference<SubjectAttribute>> getAttribute() {
       return this.attribute;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/descendedFrom")
    private Reference<SubjectState> descendedFrom;
    
    public Reference<SubjectState> getDescendedFrom() {
       return this.descendedFrom;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/handedness")
    private Reference<Handedness> handedness;
    
    /**
    * Degree to which an organism prefers one hand or foot over the other hand or foot during the performance of a task.
    */
    public Reference<Handedness> getHandedness() {
       return this.handedness;
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
    private List<Reference<? extends SubjectStatePathology>> pathology;
    
    /**
    * Structural and functional deviation from the normal that constitutes a disease or characterizes a particular disease.
    */
    public List<Reference<? extends SubjectStatePathology>> getPathology() {
       return this.pathology;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relativeTimeIndication")
    private SubjectStateRelativeTimeIndication relativeTimeIndication;
    
    public SubjectStateRelativeTimeIndication getRelativeTimeIndication() {
       return this.relativeTimeIndication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/weight")
    private SubjectStateWeight weight;
    
    /**
    * Amount that a thing or being weighs.
    */
    public SubjectStateWeight getWeight() {
       return this.weight;
    }

 

}