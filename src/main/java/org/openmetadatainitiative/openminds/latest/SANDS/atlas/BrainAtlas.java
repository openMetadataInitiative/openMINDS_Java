package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlasVersion;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationTerminology;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasAuthor;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasCustodian;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Species;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlas.SEMANTIC_NAME;
/**
 * Structured information on a brain atlas (concept level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrainAtlas extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/BrainAtlas";

    @JsonIgnore
    public Reference<BrainAtlas> getReference() {
        return doGetReference();
    }

    public static Reference<BrainAtlas> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private BrainAtlas(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<BrainAtlas>{
        
        public Builder abbreviation(String abbreviation) { BrainAtlas.this.abbreviation = abbreviation; return this; }
        
        public Builder author(List<Reference<? extends BrainAtlasAuthor>> author) { BrainAtlas.this.author = author; return this; }
        
        public Builder custodian(List<Reference<? extends BrainAtlasCustodian>> custodian) { BrainAtlas.this.custodian = custodian; return this; }
        
        public Builder description(String description) { BrainAtlas.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<? extends BrainAtlasDigitalIdentifier> digitalIdentifier) { BrainAtlas.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullName(String fullName) { BrainAtlas.this.fullName = fullName; return this; }
        
        public Builder hasTerminology(ParcellationTerminology hasTerminology) { BrainAtlas.this.hasTerminology = hasTerminology; return this; }
        
        public Builder hasVersion(List<Reference<BrainAtlasVersion>> hasVersion) { BrainAtlas.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { BrainAtlas.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { BrainAtlas.this.howToCite = howToCite; return this; }
        
        public Builder ontologyIdentifier(String ontologyIdentifier) { BrainAtlas.this.ontologyIdentifier = ontologyIdentifier; return this; }
        
        public Builder shortName(String shortName) { BrainAtlas.this.shortName = shortName; return this; }
        
        public Builder usedSpecies(Reference<Species> usedSpecies) { BrainAtlas.this.usedSpecies = usedSpecies; return this; }
        

        public BrainAtlas build() {
            if (BrainAtlas.this.id == null) {
                BrainAtlas.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(BrainAtlas.this.types == null || BrainAtlas.this.types.isEmpty() || !BrainAtlas.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = BrainAtlas.this.types;
                BrainAtlas.this.types = new ArrayList<>();
                BrainAtlas.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    BrainAtlas.this.types.addAll(oldValues);
                }
            }
            return BrainAtlas.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abbreviation")
    private String abbreviation;
    
    public String getAbbreviation() {
       return this.abbreviation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends BrainAtlasAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends BrainAtlasAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends BrainAtlasCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends BrainAtlasCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends BrainAtlasDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends BrainAtlasDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasTerminology")
    private ParcellationTerminology hasTerminology;
    
    public ParcellationTerminology getHasTerminology() {
       return this.hasTerminology;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasVersion")
    private List<Reference<BrainAtlasVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<BrainAtlasVersion>> getHasVersion() {
       return this.hasVersion;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/homepage")
    private String homepage;
    
    /**
    * Main website of something or someone.
    */
    public String getHomepage() {
       return this.homepage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/howToCite")
    private String howToCite;
    
    /**
    * Preferred format for citing a particular object or legal person.
    */
    public String getHowToCite() {
       return this.howToCite;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private String ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public String getOntologyIdentifier() {
       return this.ontologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecies")
    private Reference<Species> usedSpecies;
    
    public Reference<Species> getUsedSpecies() {
       return this.usedSpecies;
    }

 
    public static BrainAtlas.Builder create(LocalId localId){
        return new BrainAtlas(localId).new Builder();
    }

    public BrainAtlas.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, BrainAtlas.class).new Builder();
    }
}