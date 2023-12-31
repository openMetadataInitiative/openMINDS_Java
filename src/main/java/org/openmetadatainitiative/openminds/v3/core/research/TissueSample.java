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

import org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalSex;
import org.openmetadatainitiative.openminds.v3.controlledTerms.Laterality;
import org.openmetadatainitiative.openminds.v3.controlledTerms.TissueSampleType;
import org.openmetadatainitiative.openminds.v3.core.research.TissueSampleCollection;
import org.openmetadatainitiative.openminds.v3.core.research.TissueSampleState;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleAnatomicalLocation;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleOrigin;
import org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleSpecies;


import static org.openmetadatainitiative.openminds.v3.core.research.TissueSample.SEMANTIC_NAME;
/**
 * Structured information on a tissue sample.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class TissueSample extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionUsedSpecimen, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionUsedSpecimen, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionStudiedSpecimen, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/TissueSample";

    @JsonIgnore
    public Reference<TissueSample> getReference() {
        return doGetReference();
    }

    public static Reference<TissueSample> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private TissueSample() {
        this(null);
    }

    private TissueSample(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<TissueSample>{
        public Builder anatomicalLocation(List<Reference<? extends TissueSampleAnatomicalLocation>> anatomicalLocation) { TissueSample.this.anatomicalLocation = anatomicalLocation; return this; }
        public Builder biologicalSex(Reference<BiologicalSex> biologicalSex) { TissueSample.this.biologicalSex = biologicalSex; return this; }
        public Builder internalIdentifier(String internalIdentifier) { TissueSample.this.internalIdentifier = internalIdentifier; return this; }
        public Builder isPartOf(List<Reference<TissueSampleCollection>> isPartOf) { TissueSample.this.isPartOf = isPartOf; return this; }
        public Builder laterality(List<Reference<Laterality>> laterality) { TissueSample.this.laterality = laterality; return this; }
        public Builder lookupLabel(String lookupLabel) { TissueSample.this.lookupLabel = lookupLabel; return this; }
        public Builder origin(Reference<? extends TissueSampleOrigin> origin) { TissueSample.this.origin = origin; return this; }
        public Builder species(Reference<? extends TissueSampleSpecies> species) { TissueSample.this.species = species; return this; }
        public Builder studiedState(List<Reference<TissueSampleState>> studiedState) { TissueSample.this.studiedState = studiedState; return this; }
        public Builder type(Reference<TissueSampleType> type) { TissueSample.this.type = type; return this; }
        

        public TissueSample build(OpenMINDSContext context) {
            TissueSample.super.build(context);
            return TissueSample.this;
        }
    }

    public static TissueSample.Builder create(LocalId localId){
        return new TissueSample(localId).new Builder();
    }

    public TissueSample.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, TissueSample.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalLocation")
    private List<Reference<? extends TissueSampleAnatomicalLocation>> anatomicalLocation;
    
    public List<Reference<? extends TissueSampleAnatomicalLocation>> getAnatomicalLocation() {
       return this.anatomicalLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/biologicalSex")
    private Reference<BiologicalSex> biologicalSex;
    
    /**
    * Differentiation of individuals of most species (animals and plants) based on the type of gametes they produce.
    */
    public Reference<BiologicalSex> getBiologicalSex() {
       return this.biologicalSex;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private List<Reference<TissueSampleCollection>> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public List<Reference<TissueSampleCollection>> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/laterality")
    private List<Reference<Laterality>> laterality;
    
    /**
    * Differentiation between a pair of lateral homologous parts of the body.
    */
    public List<Reference<Laterality>> getLaterality() {
       return this.laterality;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/origin")
    private Reference<? extends TissueSampleOrigin> origin;
    
    /**
    * Source at which something begins or rises, or from which something derives.
    */
    public Reference<? extends TissueSampleOrigin> getOrigin() {
       return this.origin;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/species")
    private Reference<? extends TissueSampleSpecies> species;
    
    /**
    * Category of biological classification comprising related organisms or populations potentially capable of interbreeding, and being designated by a binomial that consists of the name of a genus followed by a Latin or latinized uncapitalized noun or adjective.
    */
    public Reference<? extends TissueSampleSpecies> getSpecies() {
       return this.species;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studiedState")
    private List<Reference<TissueSampleState>> studiedState;
    
    /**
    * Reference to a point in time at which something or someone was studied in a particular mode or condition.
    */
    public List<Reference<TissueSampleState>> getStudiedState() {
       return this.studiedState;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<TissueSampleType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<TissueSampleType> getType() {
       return this.type;
    }

 

}