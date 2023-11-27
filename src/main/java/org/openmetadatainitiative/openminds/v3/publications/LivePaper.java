package org.openmetadatainitiative.openminds.v3.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.DOI;
import org.openmetadatainitiative.openminds.v3.publications.LivePaperVersion;
import org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperAuthor;
import org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperCustodian;


import static org.openmetadatainitiative.openminds.v3.publications.LivePaper.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LivePaper extends Instance implements org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/LivePaper";

    @JsonIgnore
    public Reference<LivePaper> getReference() {
        return doGetReference();
    }

    public static Reference<LivePaper> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private LivePaper(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LivePaper>{
        
        public Builder author(List<Reference<? extends LivePaperAuthor>> author) { LivePaper.this.author = author; return this; }
        
        public Builder custodian(List<Reference<? extends LivePaperCustodian>> custodian) { LivePaper.this.custodian = custodian; return this; }
        
        public Builder description(String description) { LivePaper.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<DOI> digitalIdentifier) { LivePaper.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullName(String fullName) { LivePaper.this.fullName = fullName; return this; }
        
        public Builder hasVersion(List<Reference<LivePaperVersion>> hasVersion) { LivePaper.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { LivePaper.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { LivePaper.this.howToCite = howToCite; return this; }
        
        public Builder shortName(String shortName) { LivePaper.this.shortName = shortName; return this; }
        

        public LivePaper build(OpenMINDSContext context) {
            if (LivePaper.this.id == null) {
                LivePaper.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            LivePaper.this.atType = SEMANTIC_NAME;
            return LivePaper.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends LivePaperAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends LivePaperAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends LivePaperCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends LivePaperCustodian>> getCustodian() {
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
    private Reference<DOI> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<DOI> getDigitalIdentifier() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasVersion")
    private List<Reference<LivePaperVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<LivePaperVersion>> getHasVersion() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

 
    public static LivePaper.Builder create(LocalId localId){
        return new LivePaper(localId).new Builder();
    }

    public LivePaper.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LivePaper.class).new Builder();
    }
}