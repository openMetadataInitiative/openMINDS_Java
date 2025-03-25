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

import org.openmetadatainitiative.openminds.v3.controlledTerms.TissueSampleAttribute;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateAge;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateDescendedFrom;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStatePathology;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateRelativeTimeIndication;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateWeight;


import static org.openmetadatainitiative.openminds.v3.core.research.TissueSampleState.SEMANTIC_NAME;
/**
 * Structured information on a temporary state of a tissue sample.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class TissueSampleState extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueCulturePreparationInput, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingInput, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingOutput, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityInput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingInput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingOutput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementInput, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementOutput, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageUsedSpecimen, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateDescendedFrom, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionOutput, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateDescendedFrom, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityInput, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityOutput{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/TissueSampleState";

    @JsonIgnore
    public Reference<TissueSampleState> getReference() {
        return doGetReference();
    }

    public static Reference<TissueSampleState> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private TissueSampleState() {
        this(null);
    }

    private TissueSampleState(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<TissueSampleState>{
        public Builder additionalRemarks(String additionalRemarks) { TissueSampleState.this.additionalRemarks = additionalRemarks; return this; }
        public Builder age(Function<TissueSampleStateAge.EmbeddedBuilder, TissueSampleStateAge> age) { TissueSampleState.this.age = age.apply(TissueSampleStateAge.createEmbedded()); return this; }
        public Builder attribute(List<Reference<TissueSampleAttribute>> attribute) { TissueSampleState.this.attribute = attribute; return this; }
        public Builder descendedFrom(List<Reference<? extends TissueSampleStateDescendedFrom>> descendedFrom) { TissueSampleState.this.descendedFrom = descendedFrom; return this; }
        public Builder internalIdentifier(String internalIdentifier) { TissueSampleState.this.internalIdentifier = internalIdentifier; return this; }
        public Builder lookupLabel(String lookupLabel) { TissueSampleState.this.lookupLabel = lookupLabel; return this; }
        public Builder pathology(List<Reference<? extends TissueSampleStatePathology>> pathology) { TissueSampleState.this.pathology = pathology; return this; }
        public Builder relativeTimeIndication(Function<TissueSampleStateRelativeTimeIndication.EmbeddedBuilder, TissueSampleStateRelativeTimeIndication> relativeTimeIndication) { TissueSampleState.this.relativeTimeIndication = relativeTimeIndication.apply(TissueSampleStateRelativeTimeIndication.createEmbedded()); return this; }
        public Builder weight(Function<TissueSampleStateWeight.EmbeddedBuilder, TissueSampleStateWeight> weight) { TissueSampleState.this.weight = weight.apply(TissueSampleStateWeight.createEmbedded()); return this; }
        

        public TissueSampleState build(OpenMINDSContext context) {
            TissueSampleState.super.build(context);
            return TissueSampleState.this;
        }
    }

    public static TissueSampleState.Builder create(LocalId localId){
        return new TissueSampleState(localId).new Builder();
    }

    public TissueSampleState.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, TissueSampleState.class).new Builder();
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
    private TissueSampleStateAge age;
    
    /**
    * Time of life or existence at which some particular qualification, capacity or event arises.
    */
    public TissueSampleStateAge getAge() {
       return this.age;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/attribute")
    private List<Reference<TissueSampleAttribute>> attribute;
    
    public List<Reference<TissueSampleAttribute>> getAttribute() {
       return this.attribute;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/descendedFrom")
    private List<Reference<? extends TissueSampleStateDescendedFrom>> descendedFrom;
    
    public List<Reference<? extends TissueSampleStateDescendedFrom>> getDescendedFrom() {
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
    private List<Reference<? extends TissueSampleStatePathology>> pathology;
    
    /**
    * Structural and functional deviation from the normal that constitutes a disease or characterizes a particular disease.
    */
    public List<Reference<? extends TissueSampleStatePathology>> getPathology() {
       return this.pathology;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relativeTimeIndication")
    private TissueSampleStateRelativeTimeIndication relativeTimeIndication;
    
    public TissueSampleStateRelativeTimeIndication getRelativeTimeIndication() {
       return this.relativeTimeIndication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/weight")
    private TissueSampleStateWeight weight;
    
    /**
    * Amount that a thing or being weighs.
    */
    public TissueSampleStateWeight getWeight() {
       return this.weight;
    }

 

}