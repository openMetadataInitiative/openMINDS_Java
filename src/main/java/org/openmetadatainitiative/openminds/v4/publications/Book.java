package org.openmetadatainitiative.openminds.v4.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v4.core.actors.Person;
import org.openmetadatainitiative.openminds.v4.core.data.Copyright;
import org.openmetadatainitiative.openminds.v4.core.data.License;
import org.openmetadatainitiative.openminds.v4.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.v4.publications.intf.BookAuthor;
import org.openmetadatainitiative.openminds.v4.publications.intf.BookCitedPublication;
import org.openmetadatainitiative.openminds.v4.publications.intf.BookCustodian;
import org.openmetadatainitiative.openminds.v4.publications.intf.BookDigitalIdentifier;
import org.openmetadatainitiative.openminds.v4.publications.intf.BookKeyword;
import org.openmetadatainitiative.openminds.v4.publications.intf.BookPublisher;


import static org.openmetadatainitiative.openminds.v4.publications.Book.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Book extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V4.Entity, org.openmetadatainitiative.openminds.v4.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.core.products.intf.DatasetVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.v4.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/Book";

    @JsonIgnore
    public Reference<Book> getReference() {
        return doGetReference();
    }

    public static Reference<Book> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Book() {
        this(null);
    }

    private Book(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Book>{
        public Builder IRI(String IRI) { Book.this.IRI = IRI; return this; }
        public Builder abstract_(String abstract_) { Book.this.abstract_ = abstract_; return this; }
        public Builder author(List<Reference<? extends BookAuthor>> author) { Book.this.author = author; return this; }
        public Builder citedPublication(List<Reference<? extends BookCitedPublication>> citedPublication) { Book.this.citedPublication = citedPublication; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { Book.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder creationDate(String creationDate) { Book.this.creationDate = creationDate; return this; }
        public Builder custodian(List<Reference<? extends BookCustodian>> custodian) { Book.this.custodian = custodian; return this; }
        public Builder digitalIdentifier(Reference<? extends BookDigitalIdentifier> digitalIdentifier) { Book.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder editor(List<Reference<Person>> editor) { Book.this.editor = editor; return this; }
        public Builder funding(List<Reference<Funding>> funding) { Book.this.funding = funding; return this; }
        public Builder keyword(List<Reference<? extends BookKeyword>> keyword) { Book.this.keyword = keyword; return this; }
        public Builder license(Reference<License> license) { Book.this.license = license; return this; }
        public Builder modificationDate(String modificationDate) { Book.this.modificationDate = modificationDate; return this; }
        public Builder name(String name) { Book.this.name = name; return this; }
        public Builder publicationDate(String publicationDate) { Book.this.publicationDate = publicationDate; return this; }
        public Builder publisher(Reference<? extends BookPublisher> publisher) { Book.this.publisher = publisher; return this; }
        public Builder versionIdentifier(String versionIdentifier) { Book.this.versionIdentifier = versionIdentifier; return this; }
        

        public Book build(OpenMINDSContext context) {
            Book.super.build(context);
            return Book.this;
        }
    }

    public static Book.Builder create(LocalId localId){
        return new Book(localId).new Builder();
    }

    public Book.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Book.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/abstract")
    private String abstract_;
    
    public String getAbstract_() {
       return this.abstract_;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/author")
    private List<Reference<? extends BookAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends BookAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/citedPublication")
    private List<Reference<? extends BookCitedPublication>> citedPublication;
    
    public List<Reference<? extends BookCitedPublication>> getCitedPublication() {
       return this.citedPublication;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/copyright")
    private Copyright copyright;
    
    /**
    * Exclusive and assignable legal right of an originator to reproduce, publish, sell, or distribute the matter and form of a creative work for a defined time period.
    */
    public Copyright getCopyright() {
       return this.copyright;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/creationDate")
    private String creationDate;
    
    public String getCreationDate() {
       return this.creationDate;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/custodian")
    private List<Reference<? extends BookCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends BookCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/digitalIdentifier")
    private Reference<? extends BookDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends BookDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/editor")
    private List<Reference<Person>> editor;
    
    public List<Reference<Person>> getEditor() {
       return this.editor;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/funding")
    private List<Reference<Funding>> funding;
    
    /**
    * Money provided by a legal person for a particular purpose.
    */
    public List<Reference<Funding>> getFunding() {
       return this.funding;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/keyword")
    private List<Reference<? extends BookKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends BookKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/license")
    private Reference<License> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public Reference<License> getLicense() {
       return this.license;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/modificationDate")
    private String modificationDate;
    
    public String getModificationDate() {
       return this.modificationDate;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/publicationDate")
    private String publicationDate;
    
    public String getPublicationDate() {
       return this.publicationDate;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/publisher")
    private Reference<? extends BookPublisher> publisher;
    
    public Reference<? extends BookPublisher> getPublisher() {
       return this.publisher;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/versionIdentifier")
    private String versionIdentifier;
    
    /**
    * Term or code used to identify the version of something.
    */
    public String getVersionIdentifier() {
       return this.versionIdentifier;
    }

 

}