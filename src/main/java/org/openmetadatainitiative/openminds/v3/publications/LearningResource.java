package org.openmetadatainitiative.openminds.v3.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.EducationalLevel;
import org.openmetadatainitiative.openminds.v3.controlledTerms.LearningResourceType;
import org.openmetadatainitiative.openminds.v3.core.actors.Person;
import org.openmetadatainitiative.openminds.v3.core.data.Copyright;
import org.openmetadatainitiative.openminds.v3.core.data.License;
import org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.DOI;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAuthor;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceCitedPublication;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceCustodian;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceKeyword;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourcePublisher;
import org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceRequiredTime;


import static org.openmetadatainitiative.openminds.v3.publications.LearningResource.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class LearningResource extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/LearningResource";

    @JsonIgnore
    public Reference<LearningResource> getReference() {
        return doGetReference();
    }

    public static Reference<LearningResource> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private LearningResource() {
        this(null);
    }

    private LearningResource(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LearningResource>{
        public Builder IRI(String IRI) { LearningResource.this.IRI = IRI; return this; }
        public Builder about(List<Reference<? extends LearningResourceAbout>> about) { LearningResource.this.about = about; return this; }
        public Builder abstract_(String abstract_) { LearningResource.this.abstract_ = abstract_; return this; }
        public Builder author(List<Reference<? extends LearningResourceAuthor>> author) { LearningResource.this.author = author; return this; }
        public Builder citedPublication(List<Reference<? extends LearningResourceCitedPublication>> citedPublication) { LearningResource.this.citedPublication = citedPublication; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { LearningResource.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder creationDate(String creationDate) { LearningResource.this.creationDate = creationDate; return this; }
        public Builder custodian(List<Reference<? extends LearningResourceCustodian>> custodian) { LearningResource.this.custodian = custodian; return this; }
        public Builder digitalIdentifier(Reference<DOI> digitalIdentifier) { LearningResource.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder editor(List<Reference<Person>> editor) { LearningResource.this.editor = editor; return this; }
        public Builder educationalLevel(Reference<EducationalLevel> educationalLevel) { LearningResource.this.educationalLevel = educationalLevel; return this; }
        public Builder funding(List<Reference<Funding>> funding) { LearningResource.this.funding = funding; return this; }
        public Builder keyword(List<Reference<? extends LearningResourceKeyword>> keyword) { LearningResource.this.keyword = keyword; return this; }
        public Builder learningOutcome(String learningOutcome) { LearningResource.this.learningOutcome = learningOutcome; return this; }
        public Builder license(Reference<License> license) { LearningResource.this.license = license; return this; }
        public Builder modificationDate(String modificationDate) { LearningResource.this.modificationDate = modificationDate; return this; }
        public Builder name(String name) { LearningResource.this.name = name; return this; }
        public Builder order(Object order) { LearningResource.this.order = order; return this; }
        public Builder prerequisite(String prerequisite) { LearningResource.this.prerequisite = prerequisite; return this; }
        public Builder publicationDate(String publicationDate) { LearningResource.this.publicationDate = publicationDate; return this; }
        public Builder publisher(Reference<? extends LearningResourcePublisher> publisher) { LearningResource.this.publisher = publisher; return this; }
        public Builder requiredTime(Function<LearningResourceRequiredTime.EmbeddedBuilder, LearningResourceRequiredTime> requiredTime) { LearningResource.this.requiredTime = requiredTime.apply(LearningResourceRequiredTime.createEmbedded()); return this; }
        public Builder topic(String topic) { LearningResource.this.topic = topic; return this; }
        public Builder type(Reference<LearningResourceType> type) { LearningResource.this.type = type; return this; }
        public Builder versionIdentifier(String versionIdentifier) { LearningResource.this.versionIdentifier = versionIdentifier; return this; }
        

        public LearningResource build(OpenMINDSContext context) {
            LearningResource.super.build(context);
            return LearningResource.this;
        }
    }

    public static LearningResource.Builder create(LocalId localId){
        return new LearningResource(localId).new Builder();
    }

    public LearningResource.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LearningResource.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/about")
    private List<Reference<? extends LearningResourceAbout>> about;
    
    public List<Reference<? extends LearningResourceAbout>> getAbout() {
       return this.about;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abstract")
    private String abstract_;
    
    public String getAbstract_() {
       return this.abstract_;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends LearningResourceAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends LearningResourceAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/citedPublication")
    private List<Reference<? extends LearningResourceCitedPublication>> citedPublication;
    
    public List<Reference<? extends LearningResourceCitedPublication>> getCitedPublication() {
       return this.citedPublication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/copyright")
    private Copyright copyright;
    
    /**
    * Exclusive and assignable legal right of an originator to reproduce, publish, sell, or distribute the matter and form of a creative work for a defined time period.
    */
    public Copyright getCopyright() {
       return this.copyright;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/creationDate")
    private String creationDate;
    
    public String getCreationDate() {
       return this.creationDate;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends LearningResourceCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends LearningResourceCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<DOI> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<DOI> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/editor")
    private List<Reference<Person>> editor;
    
    public List<Reference<Person>> getEditor() {
       return this.editor;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/educationalLevel")
    private Reference<EducationalLevel> educationalLevel;
    
    public Reference<EducationalLevel> getEducationalLevel() {
       return this.educationalLevel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/funding")
    private List<Reference<Funding>> funding;
    
    /**
    * Money provided by a legal person for a particular purpose.
    */
    public List<Reference<Funding>> getFunding() {
       return this.funding;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends LearningResourceKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends LearningResourceKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/learningOutcome")
    private String learningOutcome;
    
    public String getLearningOutcome() {
       return this.learningOutcome;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/license")
    private Reference<License> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public Reference<License> getLicense() {
       return this.license;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/modificationDate")
    private String modificationDate;
    
    public String getModificationDate() {
       return this.modificationDate;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/order")
    private Object order;
    
    public Object getOrder() {
       return this.order;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/prerequisite")
    private String prerequisite;
    
    public String getPrerequisite() {
       return this.prerequisite;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/publicationDate")
    private String publicationDate;
    
    public String getPublicationDate() {
       return this.publicationDate;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/publisher")
    private Reference<? extends LearningResourcePublisher> publisher;
    
    public Reference<? extends LearningResourcePublisher> getPublisher() {
       return this.publisher;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/requiredTime")
    private LearningResourceRequiredTime requiredTime;
    
    public LearningResourceRequiredTime getRequiredTime() {
       return this.requiredTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/topic")
    private String topic;
    
    public String getTopic() {
       return this.topic;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<LearningResourceType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<LearningResourceType> getType() {
       return this.type;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/versionIdentifier")
    private String versionIdentifier;
    
    /**
    * Term or code used to identify the version of something.
    */
    public String getVersionIdentifier() {
       return this.versionIdentifier;
    }

 

}