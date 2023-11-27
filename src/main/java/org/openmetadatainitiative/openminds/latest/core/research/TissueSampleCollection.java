package org.openmetadatainitiative.openminds.latest.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalSex;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Laterality;
import org.openmetadatainitiative.openminds.latest.controlledTerms.TissueSampleType;
import org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollectionState;
import org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionAnatomicalLocation;
import org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionOrigin;
import org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionSpecies;


import static org.openmetadatainitiative.openminds.latest.core.research.TissueSampleCollection.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TissueSampleCollection extends Instance implements org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionUsedSpecimen, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionUsedSpecimen, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionStudiedSpecimen, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/TissueSampleCollection";

    @JsonIgnore
    public Reference<TissueSampleCollection> getReference() {
        return doGetReference();
    }

    public static Reference<TissueSampleCollection> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private TissueSampleCollection(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<TissueSampleCollection>{
        
        public Builder additionalRemarks(String additionalRemarks) { TissueSampleCollection.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder anatomicalLocation(List<Reference<? extends TissueSampleCollectionAnatomicalLocation>> anatomicalLocation) { TissueSampleCollection.this.anatomicalLocation = anatomicalLocation; return this; }
        
        public Builder biologicalSex(List<Reference<BiologicalSex>> biologicalSex) { TissueSampleCollection.this.biologicalSex = biologicalSex; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { TissueSampleCollection.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder laterality(List<Reference<Laterality>> laterality) { TissueSampleCollection.this.laterality = laterality; return this; }
        
        public Builder lookupLabel(String lookupLabel) { TissueSampleCollection.this.lookupLabel = lookupLabel; return this; }
        
        public Builder numberOfTissueSamples(Object numberOfTissueSamples) { TissueSampleCollection.this.numberOfTissueSamples = numberOfTissueSamples; return this; }
        
        public Builder origin(List<Reference<? extends TissueSampleCollectionOrigin>> origin) { TissueSampleCollection.this.origin = origin; return this; }
        
        public Builder species(List<Reference<? extends TissueSampleCollectionSpecies>> species) { TissueSampleCollection.this.species = species; return this; }
        
        public Builder studiedState(List<Reference<TissueSampleCollectionState>> studiedState) { TissueSampleCollection.this.studiedState = studiedState; return this; }
        
        public Builder type(List<Reference<TissueSampleType>> type) { TissueSampleCollection.this.type = type; return this; }
        

        public TissueSampleCollection build() {
            if (TissueSampleCollection.this.id == null) {
                TissueSampleCollection.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(TissueSampleCollection.this.types == null || TissueSampleCollection.this.types.isEmpty() || !TissueSampleCollection.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = TissueSampleCollection.this.types;
                TissueSampleCollection.this.types = new ArrayList<>();
                TissueSampleCollection.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    TissueSampleCollection.this.types.addAll(oldValues);
                }
            }
            return TissueSampleCollection.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalLocation")
    private List<Reference<? extends TissueSampleCollectionAnatomicalLocation>> anatomicalLocation;
    
    public List<Reference<? extends TissueSampleCollectionAnatomicalLocation>> getAnatomicalLocation() {
       return this.anatomicalLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/biologicalSex")
    private List<Reference<BiologicalSex>> biologicalSex;
    
    /**
    * Differentiation of individuals of most species (animals and plants) based on the type of gametes they produce.
    */
    public List<Reference<BiologicalSex>> getBiologicalSex() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/numberOfTissueSamples")
    private Object numberOfTissueSamples;
    
    public Object getNumberOfTissueSamples() {
       return this.numberOfTissueSamples;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/origin")
    private List<Reference<? extends TissueSampleCollectionOrigin>> origin;
    
    /**
    * Source at which something begins or rises, or from which something derives.
    */
    public List<Reference<? extends TissueSampleCollectionOrigin>> getOrigin() {
       return this.origin;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/species")
    private List<Reference<? extends TissueSampleCollectionSpecies>> species;
    
    /**
    * Category of biological classification comprising related organisms or populations potentially capable of interbreeding, and being designated by a binomial that consists of the name of a genus followed by a Latin or latinized uncapitalized noun or adjective.
    */
    public List<Reference<? extends TissueSampleCollectionSpecies>> getSpecies() {
       return this.species;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studiedState")
    private List<Reference<TissueSampleCollectionState>> studiedState;
    
    /**
    * Reference to a point in time at which something or someone was studied in a particular mode or condition.
    */
    public List<Reference<TissueSampleCollectionState>> getStudiedState() {
       return this.studiedState;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private List<Reference<TissueSampleType>> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public List<Reference<TissueSampleType>> getType() {
       return this.type;
    }

 
    public static TissueSampleCollection.Builder create(LocalId localId){
        return new TissueSampleCollection(localId).new Builder();
    }

    public TissueSampleCollection.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, TissueSampleCollection.class).new Builder();
    }
}