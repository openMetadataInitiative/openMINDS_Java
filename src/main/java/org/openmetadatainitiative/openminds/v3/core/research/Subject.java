package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalSex;
import org.openmetadatainitiative.openminds.v3.core.research.SubjectGroup;
import org.openmetadatainitiative.openminds.v3.core.research.SubjectState;
import org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectSpecies;


import static org.openmetadatainitiative.openminds.v3.core.research.Subject.*;
/**
 * Structured information on a subject.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subject extends Instance implements org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionUsedSpecimen, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionUsedSpecimen, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionStudiedSpecimen, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Subject";

    @JsonIgnore
    public Reference<Subject> getReference() {
        return doGetReference();
    }

    public static Reference<Subject> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Subject(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Subject>{
        
        public Builder biologicalSex(Reference<BiologicalSex> biologicalSex) { Subject.this.biologicalSex = biologicalSex; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { Subject.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder isPartOf(List<Reference<SubjectGroup>> isPartOf) { Subject.this.isPartOf = isPartOf; return this; }
        
        public Builder lookupLabel(String lookupLabel) { Subject.this.lookupLabel = lookupLabel; return this; }
        
        public Builder species(Reference<? extends SubjectSpecies> species) { Subject.this.species = species; return this; }
        
        public Builder studiedState(List<Reference<SubjectState>> studiedState) { Subject.this.studiedState = studiedState; return this; }
        

        public Subject build() {
            if (Subject.this.id == null) {
                Subject.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Subject.this.types == null || Subject.this.types.isEmpty() || !Subject.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Subject.this.types;
                Subject.this.types = new ArrayList<>();
                Subject.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Subject.this.types.addAll(oldValues);
                }
            }
            return Subject.this;
        }
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
    private List<Reference<SubjectGroup>> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public List<Reference<SubjectGroup>> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/species")
    private Reference<? extends SubjectSpecies> species;
    
    /**
    * Category of biological classification comprising related organisms or populations potentially capable of interbreeding, and being designated by a binomial that consists of the name of a genus followed by a Latin or latinized uncapitalized noun or adjective.
    */
    public Reference<? extends SubjectSpecies> getSpecies() {
       return this.species;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studiedState")
    private List<Reference<SubjectState>> studiedState;
    
    /**
    * Reference to a point in time at which something or someone was studied in a particular mode or condition.
    */
    public List<Reference<SubjectState>> getStudiedState() {
       return this.studiedState;
    }

 
    public static Subject.Builder create(LocalId localId){
        return new Subject(localId).new Builder();
    }

    public Subject.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Subject.class).new Builder();
    }
}