package org.openmetadatainitiative.openminds.v3.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionCustodian;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionDeveloper;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionFullDocumentation;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionHasPart;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionKeyword;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionRelatedPublication;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.v3.core.actors.Contribution;
import org.openmetadatainitiative.openminds.v3.core.data.ContentType;
import org.openmetadatainitiative.openminds.v3.core.data.Copyright;
import org.openmetadatainitiative.openminds.v3.core.data.FileRepository;
import org.openmetadatainitiative.openminds.v3.core.data.License;
import org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.DOI;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.Funding;


import static org.openmetadatainitiative.openminds.v3.computation.WorkflowRecipeVersion.SEMANTIC_NAME;
/**
 * Structured information about a specific implemented version of a workflow recipe.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class WorkflowRecipeVersion extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionHasPart{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/WorkflowRecipeVersion";

    @JsonIgnore
    public Reference<WorkflowRecipeVersion> getReference() {
        return doGetReference();
    }

    public static Reference<WorkflowRecipeVersion> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private WorkflowRecipeVersion() {
        this(null);
    }

    private WorkflowRecipeVersion(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<WorkflowRecipeVersion>{
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { WorkflowRecipeVersion.this.accessibility = accessibility; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { WorkflowRecipeVersion.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder custodian(List<Reference<? extends WorkflowRecipeVersionCustodian>> custodian) { WorkflowRecipeVersion.this.custodian = custodian; return this; }
        public Builder description(String description) { WorkflowRecipeVersion.this.description = description; return this; }
        public Builder developer(List<Reference<? extends WorkflowRecipeVersionDeveloper>> developer) { WorkflowRecipeVersion.this.developer = developer; return this; }
        public Builder digitalIdentifier(Reference<DOI> digitalIdentifier) { WorkflowRecipeVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder format(Reference<ContentType> format) { WorkflowRecipeVersion.this.format = format; return this; }
        public Builder fullDocumentation(Reference<? extends WorkflowRecipeVersionFullDocumentation> fullDocumentation) { WorkflowRecipeVersion.this.fullDocumentation = fullDocumentation; return this; }
        public Builder fullName(String fullName) { WorkflowRecipeVersion.this.fullName = fullName; return this; }
        public Builder funding(List<Reference<Funding>> funding) { WorkflowRecipeVersion.this.funding = funding; return this; }
        public Builder hasPart(List<Reference<? extends WorkflowRecipeVersionHasPart>> hasPart) { WorkflowRecipeVersion.this.hasPart = hasPart; return this; }
        public Builder homepage(String homepage) { WorkflowRecipeVersion.this.homepage = homepage; return this; }
        public Builder howToCite(String howToCite) { WorkflowRecipeVersion.this.howToCite = howToCite; return this; }
        public Builder isAlternativeVersionOf(List<Reference<WorkflowRecipeVersion>> isAlternativeVersionOf) { WorkflowRecipeVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        public Builder isNewVersionOf(Reference<WorkflowRecipeVersion> isNewVersionOf) { WorkflowRecipeVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        public Builder keyword(List<Reference<? extends WorkflowRecipeVersionKeyword>> keyword) { WorkflowRecipeVersion.this.keyword = keyword; return this; }
        public Builder license(List<Reference<License>> license) { WorkflowRecipeVersion.this.license = license; return this; }
        public Builder otherContribution(List<Function<Contribution.EmbeddedBuilder, Contribution>> otherContribution) { WorkflowRecipeVersion.this.otherContribution = otherContribution.stream().map(b -> b.apply(Contribution.createEmbedded())).toList(); return this; }
        public Builder relatedPublication(List<Reference<? extends WorkflowRecipeVersionRelatedPublication>> relatedPublication) { WorkflowRecipeVersion.this.relatedPublication = relatedPublication; return this; }
        public Builder releaseDate(String releaseDate) { WorkflowRecipeVersion.this.releaseDate = releaseDate; return this; }
        public Builder repository(Reference<FileRepository> repository) { WorkflowRecipeVersion.this.repository = repository; return this; }
        public Builder shortName(String shortName) { WorkflowRecipeVersion.this.shortName = shortName; return this; }
        public Builder supportChannel(List<String> supportChannel) { WorkflowRecipeVersion.this.supportChannel = supportChannel; return this; }
        public Builder versionIdentifier(String versionIdentifier) { WorkflowRecipeVersion.this.versionIdentifier = versionIdentifier; return this; }
        public Builder versionInnovation(String versionInnovation) { WorkflowRecipeVersion.this.versionInnovation = versionInnovation; return this; }
        

        public WorkflowRecipeVersion build(OpenMINDSContext context) {
            WorkflowRecipeVersion.super.build(context);
            return WorkflowRecipeVersion.this;
        }
    }

    public static WorkflowRecipeVersion.Builder create(LocalId localId){
        return new WorkflowRecipeVersion(localId).new Builder();
    }

    public WorkflowRecipeVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, WorkflowRecipeVersion.class).new Builder();
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
    private List<Reference<? extends WorkflowRecipeVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends WorkflowRecipeVersionCustodian>> getCustodian() {
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
    private List<Reference<? extends WorkflowRecipeVersionDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends WorkflowRecipeVersionDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<DOI> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<DOI> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/format")
    private Reference<ContentType> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public Reference<ContentType> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends WorkflowRecipeVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends WorkflowRecipeVersionFullDocumentation> getFullDocumentation() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasPart")
    private List<Reference<? extends WorkflowRecipeVersionHasPart>> hasPart;
    
    public List<Reference<? extends WorkflowRecipeVersionHasPart>> getHasPart() {
       return this.hasPart;
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
    private List<Reference<WorkflowRecipeVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<WorkflowRecipeVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<WorkflowRecipeVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<WorkflowRecipeVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends WorkflowRecipeVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends WorkflowRecipeVersionKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/license")
    private List<Reference<License>> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public List<Reference<License>> getLicense() {
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
    private List<Reference<? extends WorkflowRecipeVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends WorkflowRecipeVersionRelatedPublication>> getRelatedPublication() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/supportChannel")
    private List<String> supportChannel;
    
    /**
    * Way of communication used to interact with users or customers.
    */
    public List<String> getSupportChannel() {
       return this.supportChannel;
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

 

}