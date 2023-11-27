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
import org.openmetadatainitiative.openminds.v3.core.research.SubjectGroupState;
import org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectGroupSpecies;


import static org.openmetadatainitiative.openminds.v3.core.research.SubjectGroup.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubjectGroup extends Instance implements org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionUsedSpecimen, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionUsedSpecimen, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionStudiedSpecimen, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/SubjectGroup";

    @JsonIgnore
    public Reference<SubjectGroup> getReference() {
        return doGetReference();
    }

    public static Reference<SubjectGroup> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private SubjectGroup(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SubjectGroup>{
        
        public Builder additionalRemarks(String additionalRemarks) { SubjectGroup.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder biologicalSex(List<Reference<BiologicalSex>> biologicalSex) { SubjectGroup.this.biologicalSex = biologicalSex; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { SubjectGroup.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder lookupLabel(String lookupLabel) { SubjectGroup.this.lookupLabel = lookupLabel; return this; }
        
        public Builder numberOfSubjects(Object numberOfSubjects) { SubjectGroup.this.numberOfSubjects = numberOfSubjects; return this; }
        
        public Builder species(List<Reference<? extends SubjectGroupSpecies>> species) { SubjectGroup.this.species = species; return this; }
        
        public Builder studiedState(List<Reference<SubjectGroupState>> studiedState) { SubjectGroup.this.studiedState = studiedState; return this; }
        

        public SubjectGroup build() {
            if (SubjectGroup.this.id == null) {
                SubjectGroup.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(SubjectGroup.this.types == null || SubjectGroup.this.types.isEmpty() || !SubjectGroup.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = SubjectGroup.this.types;
                SubjectGroup.this.types = new ArrayList<>();
                SubjectGroup.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    SubjectGroup.this.types.addAll(oldValues);
                }
            }
            return SubjectGroup.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/numberOfSubjects")
    private Object numberOfSubjects;
    
    public Object getNumberOfSubjects() {
       return this.numberOfSubjects;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/species")
    private List<Reference<? extends SubjectGroupSpecies>> species;
    
    /**
    * Category of biological classification comprising related organisms or populations potentially capable of interbreeding, and being designated by a binomial that consists of the name of a genus followed by a Latin or latinized uncapitalized noun or adjective.
    */
    public List<Reference<? extends SubjectGroupSpecies>> getSpecies() {
       return this.species;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studiedState")
    private List<Reference<SubjectGroupState>> studiedState;
    
    /**
    * Reference to a point in time at which something or someone was studied in a particular mode or condition.
    */
    public List<Reference<SubjectGroupState>> getStudiedState() {
       return this.studiedState;
    }

 
    public static SubjectGroup.Builder create(LocalId localId){
        return new SubjectGroup(localId).new Builder();
    }

    public SubjectGroup.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SubjectGroup.class).new Builder();
    }
}