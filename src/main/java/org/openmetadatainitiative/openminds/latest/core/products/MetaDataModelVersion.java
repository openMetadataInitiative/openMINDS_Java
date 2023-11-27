package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.MetaDataModelType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.latest.core.actors.Contribution;
import org.openmetadatainitiative.openminds.latest.core.data.ContentType;
import org.openmetadatainitiative.openminds.latest.core.data.Copyright;
import org.openmetadatainitiative.openminds.latest.core.data.FileRepository;
import org.openmetadatainitiative.openminds.latest.core.data.License;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.latest.core.products.MetaDataModelVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionDeveloper;
import org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionFullDocumentation;
import org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionKeyword;
import org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionRelatedPublication;


import static org.openmetadatainitiative.openminds.latest.core.products.MetaDataModelVersion.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaDataModelVersion extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/MetaDataModelVersion";

    @JsonIgnore
    public Reference<MetaDataModelVersion> getReference() {
        return doGetReference();
    }

    public static Reference<MetaDataModelVersion> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private MetaDataModelVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<MetaDataModelVersion>{
        
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { MetaDataModelVersion.this.accessibility = accessibility; return this; }
        
        public Builder copyright(Copyright copyright) { MetaDataModelVersion.this.copyright = copyright; return this; }
        
        public Builder custodian(List<Reference<? extends MetaDataModelVersionCustodian>> custodian) { MetaDataModelVersion.this.custodian = custodian; return this; }
        
        public Builder description(String description) { MetaDataModelVersion.this.description = description; return this; }
        
        public Builder developer(List<Reference<? extends MetaDataModelVersionDeveloper>> developer) { MetaDataModelVersion.this.developer = developer; return this; }
        
        public Builder digitalIdentifier(Reference<? extends MetaDataModelVersionDigitalIdentifier> digitalIdentifier) { MetaDataModelVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullDocumentation(Reference<? extends MetaDataModelVersionFullDocumentation> fullDocumentation) { MetaDataModelVersion.this.fullDocumentation = fullDocumentation; return this; }
        
        public Builder fullName(String fullName) { MetaDataModelVersion.this.fullName = fullName; return this; }
        
        public Builder funding(List<Reference<Funding>> funding) { MetaDataModelVersion.this.funding = funding; return this; }
        
        public Builder homepage(String homepage) { MetaDataModelVersion.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { MetaDataModelVersion.this.howToCite = howToCite; return this; }
        
        public Builder isAlternativeVersionOf(List<Reference<MetaDataModelVersion>> isAlternativeVersionOf) { MetaDataModelVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        
        public Builder isNewVersionOf(Reference<MetaDataModelVersion> isNewVersionOf) { MetaDataModelVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        
        public Builder keyword(List<Reference<? extends MetaDataModelVersionKeyword>> keyword) { MetaDataModelVersion.this.keyword = keyword; return this; }
        
        public Builder license(Reference<License> license) { MetaDataModelVersion.this.license = license; return this; }
        
        public Builder otherContribution(List<Contribution> otherContribution) { MetaDataModelVersion.this.otherContribution = otherContribution; return this; }
        
        public Builder relatedPublication(List<Reference<? extends MetaDataModelVersionRelatedPublication>> relatedPublication) { MetaDataModelVersion.this.relatedPublication = relatedPublication; return this; }
        
        public Builder releaseDate(String releaseDate) { MetaDataModelVersion.this.releaseDate = releaseDate; return this; }
        
        public Builder repository(Reference<FileRepository> repository) { MetaDataModelVersion.this.repository = repository; return this; }
        
        public Builder serializationFormat(List<Reference<ContentType>> serializationFormat) { MetaDataModelVersion.this.serializationFormat = serializationFormat; return this; }
        
        public Builder shortName(String shortName) { MetaDataModelVersion.this.shortName = shortName; return this; }
        
        public Builder specificationFormat(List<Reference<ContentType>> specificationFormat) { MetaDataModelVersion.this.specificationFormat = specificationFormat; return this; }
        
        public Builder supportChannel(List<String> supportChannel) { MetaDataModelVersion.this.supportChannel = supportChannel; return this; }
        
        public Builder type(Reference<MetaDataModelType> type) { MetaDataModelVersion.this.type = type; return this; }
        
        public Builder versionIdentifier(String versionIdentifier) { MetaDataModelVersion.this.versionIdentifier = versionIdentifier; return this; }
        
        public Builder versionInnovation(String versionInnovation) { MetaDataModelVersion.this.versionInnovation = versionInnovation; return this; }
        

        public MetaDataModelVersion build() {
            if (MetaDataModelVersion.this.id == null) {
                MetaDataModelVersion.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(MetaDataModelVersion.this.types == null || MetaDataModelVersion.this.types.isEmpty() || !MetaDataModelVersion.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = MetaDataModelVersion.this.types;
                MetaDataModelVersion.this.types = new ArrayList<>();
                MetaDataModelVersion.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    MetaDataModelVersion.this.types.addAll(oldValues);
                }
            }
            return MetaDataModelVersion.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/accessibility")
    private Reference<ProductAccessibility> accessibility;
    
    /**
    * Level to which something is accessible to someone or something.
    */
    public Reference<ProductAccessibility> getAccessibility() {
       return this.accessibility;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/copyright")
    private Copyright copyright;
    
    /**
    * Exclusive and assignable legal right of an originator to reproduce, publish, sell, or distribute the matter and form of a creative work for a defined time period.
    */
    public Copyright getCopyright() {
       return this.copyright;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends MetaDataModelVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends MetaDataModelVersionCustodian>> getCustodian() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/developer")
    private List<Reference<? extends MetaDataModelVersionDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends MetaDataModelVersionDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends MetaDataModelVersionDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends MetaDataModelVersionDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends MetaDataModelVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends MetaDataModelVersionFullDocumentation> getFullDocumentation() {
       return this.fullDocumentation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/funding")
    private List<Reference<Funding>> funding;
    
    /**
    * Money provided by a legal person for a particular purpose.
    */
    public List<Reference<Funding>> getFunding() {
       return this.funding;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isAlternativeVersionOf")
    private List<Reference<MetaDataModelVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<MetaDataModelVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<MetaDataModelVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<MetaDataModelVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends MetaDataModelVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends MetaDataModelVersionKeyword>> getKeyword() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/otherContribution")
    private List<Contribution> otherContribution;
    
    /**
    * Giving or supplying of something (such as money or time) as a part or share other than what is covered elsewhere.
    */
    public List<Contribution> getOtherContribution() {
       return this.otherContribution;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedPublication")
    private List<Reference<? extends MetaDataModelVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends MetaDataModelVersionRelatedPublication>> getRelatedPublication() {
       return this.relatedPublication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/releaseDate")
    private String releaseDate;
    
    /**
    * Fixed date on which a product is due to become or was made available for the general public to see or buy
    */
    public String getReleaseDate() {
       return this.releaseDate;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/repository")
    private Reference<FileRepository> repository;
    
    /**
    * Place, room, or container where something is deposited or stored.
    */
    public Reference<FileRepository> getRepository() {
       return this.repository;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/serializationFormat")
    private List<Reference<ContentType>> serializationFormat;
    
    /**
    * Form in which a particular data structure or object state is translated to for storage.
    */
    public List<Reference<ContentType>> getSerializationFormat() {
       return this.serializationFormat;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/specificationFormat")
    private List<Reference<ContentType>> specificationFormat;
    
    /**
    * Form in which a particular data structure or object state is specified in.
    */
    public List<Reference<ContentType>> getSpecificationFormat() {
       return this.specificationFormat;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/supportChannel")
    private List<String> supportChannel;
    
    /**
    * Way of communication used to interact with users or customers.
    */
    public List<String> getSupportChannel() {
       return this.supportChannel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<MetaDataModelType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<MetaDataModelType> getType() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/versionInnovation")
    private String versionInnovation;
    
    /**
    * Documentation on what changed in comparison to a previously published form of something.
    */
    public String getVersionInnovation() {
       return this.versionInnovation;
    }

 
    public static MetaDataModelVersion.Builder create(LocalId localId){
        return new MetaDataModelVersion(localId).new Builder();
    }

    public MetaDataModelVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, MetaDataModelVersion.class).new Builder();
    }
}