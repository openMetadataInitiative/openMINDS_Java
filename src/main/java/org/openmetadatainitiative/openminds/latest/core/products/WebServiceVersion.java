package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.latest.core.actors.Contribution;
import org.openmetadatainitiative.openminds.latest.core.data.ContentType;
import org.openmetadatainitiative.openminds.latest.core.data.Copyright;
import org.openmetadatainitiative.openminds.latest.core.data.FileRepository;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.latest.core.products.SoftwareVersion;
import org.openmetadatainitiative.openminds.latest.core.products.WebServiceVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionDeveloper;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionFullDocumentation;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionKeyword;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionRelatedPublication;


import static org.openmetadatainitiative.openminds.latest.core.products.WebServiceVersion.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class WebServiceVersion extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationEnvironment, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationEnvironment, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyEnvironment, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationEnvironment, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationEnvironment, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisEnvironment, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationEnvironment, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/WebServiceVersion";

    @JsonIgnore
    public Reference<WebServiceVersion> getReference() {
        return doGetReference();
    }

    public static Reference<WebServiceVersion> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private WebServiceVersion() {
        this(null);
    }

    private WebServiceVersion(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<WebServiceVersion>{
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { WebServiceVersion.this.accessibility = accessibility; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { WebServiceVersion.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder custodian(List<Reference<? extends WebServiceVersionCustodian>> custodian) { WebServiceVersion.this.custodian = custodian; return this; }
        public Builder description(String description) { WebServiceVersion.this.description = description; return this; }
        public Builder developer(List<Reference<? extends WebServiceVersionDeveloper>> developer) { WebServiceVersion.this.developer = developer; return this; }
        public Builder fullDocumentation(Reference<? extends WebServiceVersionFullDocumentation> fullDocumentation) { WebServiceVersion.this.fullDocumentation = fullDocumentation; return this; }
        public Builder fullName(String fullName) { WebServiceVersion.this.fullName = fullName; return this; }
        public Builder funding(List<Reference<Funding>> funding) { WebServiceVersion.this.funding = funding; return this; }
        public Builder hasPart(List<Reference<SoftwareVersion>> hasPart) { WebServiceVersion.this.hasPart = hasPart; return this; }
        public Builder homepage(String homepage) { WebServiceVersion.this.homepage = homepage; return this; }
        public Builder howToCite(String howToCite) { WebServiceVersion.this.howToCite = howToCite; return this; }
        public Builder inputFormat(List<Reference<ContentType>> inputFormat) { WebServiceVersion.this.inputFormat = inputFormat; return this; }
        public Builder isAlternativeVersionOf(List<Reference<WebServiceVersion>> isAlternativeVersionOf) { WebServiceVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        public Builder isNewVersionOf(Reference<WebServiceVersion> isNewVersionOf) { WebServiceVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        public Builder keyword(List<Reference<? extends WebServiceVersionKeyword>> keyword) { WebServiceVersion.this.keyword = keyword; return this; }
        public Builder otherContribution(List<Function<Contribution.EmbeddedBuilder, Contribution>> otherContribution) { WebServiceVersion.this.otherContribution = otherContribution.stream().map(b -> b.apply(Contribution.createEmbedded())).toList(); return this; }
        public Builder outputFormat(List<Reference<ContentType>> outputFormat) { WebServiceVersion.this.outputFormat = outputFormat; return this; }
        public Builder relatedPublication(List<Reference<? extends WebServiceVersionRelatedPublication>> relatedPublication) { WebServiceVersion.this.relatedPublication = relatedPublication; return this; }
        public Builder releaseDate(String releaseDate) { WebServiceVersion.this.releaseDate = releaseDate; return this; }
        public Builder repository(Reference<FileRepository> repository) { WebServiceVersion.this.repository = repository; return this; }
        public Builder shortName(String shortName) { WebServiceVersion.this.shortName = shortName; return this; }
        public Builder supportChannel(List<String> supportChannel) { WebServiceVersion.this.supportChannel = supportChannel; return this; }
        public Builder versionIdentifier(String versionIdentifier) { WebServiceVersion.this.versionIdentifier = versionIdentifier; return this; }
        public Builder versionInnovation(String versionInnovation) { WebServiceVersion.this.versionInnovation = versionInnovation; return this; }
        

        public WebServiceVersion build(OpenMINDSContext context) {
            WebServiceVersion.super.build(context);
            return WebServiceVersion.this;
        }
    }

    public static WebServiceVersion.Builder create(LocalId localId){
        return new WebServiceVersion(localId).new Builder();
    }

    public WebServiceVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, WebServiceVersion.class).new Builder();
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
    private List<Reference<? extends WebServiceVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends WebServiceVersionCustodian>> getCustodian() {
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
    private List<Reference<? extends WebServiceVersionDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends WebServiceVersionDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends WebServiceVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends WebServiceVersionFullDocumentation> getFullDocumentation() {
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
    private List<Reference<SoftwareVersion>> hasPart;
    
    public List<Reference<SoftwareVersion>> getHasPart() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/inputFormat")
    private List<Reference<ContentType>> inputFormat;
    
    /**
    * Format of data that is put into a process or machine.
    */
    public List<Reference<ContentType>> getInputFormat() {
       return this.inputFormat;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isAlternativeVersionOf")
    private List<Reference<WebServiceVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<WebServiceVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<WebServiceVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<WebServiceVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends WebServiceVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends WebServiceVersionKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/otherContribution")
    private List<Contribution> otherContribution;
    
    /**
    * Giving or supplying of something (such as money or time) as a part or share other than what is covered elsewhere.
    */
    public List<Contribution> getOtherContribution() {
       return this.otherContribution;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/outputFormat")
    private List<Reference<ContentType>> outputFormat;
    
    /**
    * Format of data that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<ContentType>> getOutputFormat() {
       return this.outputFormat;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedPublication")
    private List<Reference<? extends WebServiceVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends WebServiceVersionRelatedPublication>> getRelatedPublication() {
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