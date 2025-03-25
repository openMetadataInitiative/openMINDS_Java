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

import org.openmetadatainitiative.openminds.v3.core.actors.Person;
import org.openmetadatainitiative.openminds.v3.core.data.Copyright;
import org.openmetadatainitiative.openminds.v3.core.data.License;
import org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.DOI;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.v3.publications.Book;
import org.openmetadatainitiative.openminds.v3.publications.intf.ChapterAuthor;
import org.openmetadatainitiative.openminds.v3.publications.intf.ChapterCitedPublication;
import org.openmetadatainitiative.openminds.v3.publications.intf.ChapterCustodian;
import org.openmetadatainitiative.openminds.v3.publications.intf.ChapterKeyword;
import org.openmetadatainitiative.openminds.v3.publications.intf.ChapterPublisher;


import static org.openmetadatainitiative.openminds.v3.publications.Chapter.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Chapter extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/Chapter";

    @JsonIgnore
    public Reference<Chapter> getReference() {
        return doGetReference();
    }

    public static Reference<Chapter> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Chapter() {
        this(null);
    }

    private Chapter(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Chapter>{
        public Builder IRI(String IRI) { Chapter.this.IRI = IRI; return this; }
        public Builder abstract_(String abstract_) { Chapter.this.abstract_ = abstract_; return this; }
        public Builder author(List<Reference<? extends ChapterAuthor>> author) { Chapter.this.author = author; return this; }
        public Builder citedPublication(List<Reference<? extends ChapterCitedPublication>> citedPublication) { Chapter.this.citedPublication = citedPublication; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { Chapter.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder creationDate(String creationDate) { Chapter.this.creationDate = creationDate; return this; }
        public Builder custodian(List<Reference<? extends ChapterCustodian>> custodian) { Chapter.this.custodian = custodian; return this; }
        public Builder digitalIdentifier(Reference<DOI> digitalIdentifier) { Chapter.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder editor(List<Reference<Person>> editor) { Chapter.this.editor = editor; return this; }
        public Builder funding(List<Reference<Funding>> funding) { Chapter.this.funding = funding; return this; }
        public Builder isPartOf(Reference<Book> isPartOf) { Chapter.this.isPartOf = isPartOf; return this; }
        public Builder keyword(List<Reference<? extends ChapterKeyword>> keyword) { Chapter.this.keyword = keyword; return this; }
        public Builder license(Reference<License> license) { Chapter.this.license = license; return this; }
        public Builder modificationDate(String modificationDate) { Chapter.this.modificationDate = modificationDate; return this; }
        public Builder name(String name) { Chapter.this.name = name; return this; }
        public Builder pagination(String pagination) { Chapter.this.pagination = pagination; return this; }
        public Builder publicationDate(String publicationDate) { Chapter.this.publicationDate = publicationDate; return this; }
        public Builder publisher(Reference<? extends ChapterPublisher> publisher) { Chapter.this.publisher = publisher; return this; }
        public Builder versionIdentifier(String versionIdentifier) { Chapter.this.versionIdentifier = versionIdentifier; return this; }
        

        public Chapter build(OpenMINDSContext context) {
            Chapter.super.build(context);
            return Chapter.this;
        }
    }

    public static Chapter.Builder create(LocalId localId){
        return new Chapter(localId).new Builder();
    }

    public Chapter.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Chapter.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abstract")
    private String abstract_;
    
    public String getAbstract_() {
       return this.abstract_;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends ChapterAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends ChapterAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/citedPublication")
    private List<Reference<? extends ChapterCitedPublication>> citedPublication;
    
    public List<Reference<? extends ChapterCitedPublication>> getCitedPublication() {
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
    private List<Reference<? extends ChapterCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends ChapterCustodian>> getCustodian() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/funding")
    private List<Reference<Funding>> funding;
    
    /**
    * Money provided by a legal person for a particular purpose.
    */
    public List<Reference<Funding>> getFunding() {
       return this.funding;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<Book> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<Book> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends ChapterKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends ChapterKeyword>> getKeyword() {
       return this.keyword;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/pagination")
    private String pagination;
    
    public String getPagination() {
       return this.pagination;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/publicationDate")
    private String publicationDate;
    
    public String getPublicationDate() {
       return this.publicationDate;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/publisher")
    private Reference<? extends ChapterPublisher> publisher;
    
    public Reference<? extends ChapterPublisher> getPublisher() {
       return this.publisher;
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