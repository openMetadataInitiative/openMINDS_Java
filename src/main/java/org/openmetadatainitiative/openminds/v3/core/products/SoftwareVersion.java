package org.openmetadatainitiative.openminds.v3.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.Language;
import org.openmetadatainitiative.openminds.v3.controlledTerms.OperatingDevice;
import org.openmetadatainitiative.openminds.v3.controlledTerms.OperatingSystem;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ProgrammingLanguage;
import org.openmetadatainitiative.openminds.v3.controlledTerms.SoftwareApplicationCategory;
import org.openmetadatainitiative.openminds.v3.controlledTerms.SoftwareFeature;
import org.openmetadatainitiative.openminds.v3.core.actors.Contribution;
import org.openmetadatainitiative.openminds.v3.core.data.ContentType;
import org.openmetadatainitiative.openminds.v3.core.data.Copyright;
import org.openmetadatainitiative.openminds.v3.core.data.FileRepository;
import org.openmetadatainitiative.openminds.v3.core.data.License;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.v3.core.products.SoftwareVersion;
import org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionCustodian;
import org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionDeveloper;
import org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionDigitalIdentifier;
import org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionFullDocumentation;
import org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionKeyword;
import org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionRelatedPublication;


import static org.openmetadatainitiative.openminds.v3.core.products.SoftwareVersion.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class SoftwareVersion extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionHasPart, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationInput, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationInput, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyInput, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationInput, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationInput, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisInput, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationInput, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionAbout, org.openmetadatainitiative.openminds.v3.core.products.intf.SetupHasPart, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/SoftwareVersion";

    @JsonIgnore
    public Reference<SoftwareVersion> getReference() {
        return doGetReference();
    }

    public static Reference<SoftwareVersion> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private SoftwareVersion() {
        this(null);
    }

    private SoftwareVersion(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SoftwareVersion>{
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { SoftwareVersion.this.accessibility = accessibility; return this; }
        public Builder applicationCategory(List<Reference<SoftwareApplicationCategory>> applicationCategory) { SoftwareVersion.this.applicationCategory = applicationCategory; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { SoftwareVersion.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder custodian(List<Reference<? extends SoftwareVersionCustodian>> custodian) { SoftwareVersion.this.custodian = custodian; return this; }
        public Builder description(String description) { SoftwareVersion.this.description = description; return this; }
        public Builder developer(List<Reference<? extends SoftwareVersionDeveloper>> developer) { SoftwareVersion.this.developer = developer; return this; }
        public Builder device(List<Reference<OperatingDevice>> device) { SoftwareVersion.this.device = device; return this; }
        public Builder digitalIdentifier(Reference<? extends SoftwareVersionDigitalIdentifier> digitalIdentifier) { SoftwareVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder feature(List<Reference<SoftwareFeature>> feature) { SoftwareVersion.this.feature = feature; return this; }
        public Builder fullDocumentation(Reference<? extends SoftwareVersionFullDocumentation> fullDocumentation) { SoftwareVersion.this.fullDocumentation = fullDocumentation; return this; }
        public Builder fullName(String fullName) { SoftwareVersion.this.fullName = fullName; return this; }
        public Builder funding(List<Reference<Funding>> funding) { SoftwareVersion.this.funding = funding; return this; }
        public Builder hasPart(List<Reference<SoftwareVersion>> hasPart) { SoftwareVersion.this.hasPart = hasPart; return this; }
        public Builder homepage(String homepage) { SoftwareVersion.this.homepage = homepage; return this; }
        public Builder howToCite(String howToCite) { SoftwareVersion.this.howToCite = howToCite; return this; }
        public Builder inputFormat(List<Reference<ContentType>> inputFormat) { SoftwareVersion.this.inputFormat = inputFormat; return this; }
        public Builder isAlternativeVersionOf(List<Reference<SoftwareVersion>> isAlternativeVersionOf) { SoftwareVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        public Builder isNewVersionOf(Reference<SoftwareVersion> isNewVersionOf) { SoftwareVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        public Builder keyword(List<Reference<? extends SoftwareVersionKeyword>> keyword) { SoftwareVersion.this.keyword = keyword; return this; }
        public Builder language(List<Reference<Language>> language) { SoftwareVersion.this.language = language; return this; }
        public Builder license(List<Reference<License>> license) { SoftwareVersion.this.license = license; return this; }
        public Builder operatingSystem(List<Reference<OperatingSystem>> operatingSystem) { SoftwareVersion.this.operatingSystem = operatingSystem; return this; }
        public Builder otherContribution(List<Function<Contribution.EmbeddedBuilder, Contribution>> otherContribution) { SoftwareVersion.this.otherContribution = otherContribution.stream().map(b -> b.apply(Contribution.createEmbedded())).toList(); return this; }
        public Builder outputFormat(List<Reference<ContentType>> outputFormat) { SoftwareVersion.this.outputFormat = outputFormat; return this; }
        public Builder programmingLanguage(List<Reference<ProgrammingLanguage>> programmingLanguage) { SoftwareVersion.this.programmingLanguage = programmingLanguage; return this; }
        public Builder relatedPublication(List<Reference<? extends SoftwareVersionRelatedPublication>> relatedPublication) { SoftwareVersion.this.relatedPublication = relatedPublication; return this; }
        public Builder releaseDate(String releaseDate) { SoftwareVersion.this.releaseDate = releaseDate; return this; }
        public Builder repository(Reference<FileRepository> repository) { SoftwareVersion.this.repository = repository; return this; }
        public Builder requirement(List<String> requirement) { SoftwareVersion.this.requirement = requirement; return this; }
        public Builder shortName(String shortName) { SoftwareVersion.this.shortName = shortName; return this; }
        public Builder supportChannel(List<String> supportChannel) { SoftwareVersion.this.supportChannel = supportChannel; return this; }
        public Builder versionIdentifier(String versionIdentifier) { SoftwareVersion.this.versionIdentifier = versionIdentifier; return this; }
        public Builder versionInnovation(String versionInnovation) { SoftwareVersion.this.versionInnovation = versionInnovation; return this; }
        

        public SoftwareVersion build(OpenMINDSContext context) {
            SoftwareVersion.super.build(context);
            return SoftwareVersion.this;
        }
    }

    public static SoftwareVersion.Builder create(LocalId localId){
        return new SoftwareVersion(localId).new Builder();
    }

    public SoftwareVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SoftwareVersion.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/accessibility")
    private Reference<ProductAccessibility> accessibility;
    
    /**
    * Level to which something is accessible to someone or something.
    */
    public Reference<ProductAccessibility> getAccessibility() {
       return this.accessibility;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/applicationCategory")
    private List<Reference<SoftwareApplicationCategory>> applicationCategory;
    
    /**
    * Distinct class that groups software programs which perform a similar task or set of tasks.
    */
    public List<Reference<SoftwareApplicationCategory>> getApplicationCategory() {
       return this.applicationCategory;
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
    private List<Reference<? extends SoftwareVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends SoftwareVersionCustodian>> getCustodian() {
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
    private List<Reference<? extends SoftwareVersionDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends SoftwareVersionDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/device")
    private List<Reference<OperatingDevice>> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public List<Reference<OperatingDevice>> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends SoftwareVersionDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends SoftwareVersionDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/feature")
    private List<Reference<SoftwareFeature>> feature;
    
    /**
    * Structure, form, or appearance that characterizes something or someone.
    */
    public List<Reference<SoftwareFeature>> getFeature() {
       return this.feature;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends SoftwareVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends SoftwareVersionFullDocumentation> getFullDocumentation() {
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
    private List<Reference<SoftwareVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<SoftwareVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<SoftwareVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<SoftwareVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends SoftwareVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends SoftwareVersionKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/language")
    private List<Reference<Language>> language;
    
    /**
    * System of communication (words, their pronunciation, and the methods of combining them) used and understood by a particular community.
    */
    public List<Reference<Language>> getLanguage() {
       return this.language;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/license")
    private List<Reference<License>> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public List<Reference<License>> getLicense() {
       return this.license;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/operatingSystem")
    private List<Reference<OperatingSystem>> operatingSystem;
    
    /**
    * Software that controls the operation of a computer and directs the processing of programs.
    */
    public List<Reference<OperatingSystem>> getOperatingSystem() {
       return this.operatingSystem;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/programmingLanguage")
    private List<Reference<ProgrammingLanguage>> programmingLanguage;
    
    /**
    * Distinct set of instructions for computer programs in order to produce various kinds of output.
    */
    public List<Reference<ProgrammingLanguage>> getProgrammingLanguage() {
       return this.programmingLanguage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedPublication")
    private List<Reference<? extends SoftwareVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends SoftwareVersionRelatedPublication>> getRelatedPublication() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/requirement")
    private List<String> requirement;
    
    /**
    * Something essential to the existence, occurrence or function of something else.
    */
    public List<String> getRequirement() {
       return this.requirement;
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