package org.openmetadatainitiative.openminds.v3.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.atlas.BrainAtlasVersion;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.CommonCoordinateSpaceVersion;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationTerminologyVersion;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionAuthor;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionCustodian;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionDigitalIdentifier;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionFullDocumentation;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionKeyword;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionUsedSpecimen;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AtlasType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.v3.core.actors.Contribution;
import org.openmetadatainitiative.openminds.v3.core.data.Copyright;
import org.openmetadatainitiative.openminds.v3.core.data.FileRepository;
import org.openmetadatainitiative.openminds.v3.core.data.License;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.Funding;


import static org.openmetadatainitiative.openminds.v3.SANDS.atlas.BrainAtlasVersion.SEMANTIC_NAME;
/**
 * Structured information on a brain atlas (version level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class BrainAtlasVersion extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisInput, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/BrainAtlasVersion";

    @JsonIgnore
    public Reference<BrainAtlasVersion> getReference() {
        return doGetReference();
    }

    public static Reference<BrainAtlasVersion> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private BrainAtlasVersion() {
        this(null);
    }

    private BrainAtlasVersion(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<BrainAtlasVersion>{
        public Builder abbreviation(String abbreviation) { BrainAtlasVersion.this.abbreviation = abbreviation; return this; }
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { BrainAtlasVersion.this.accessibility = accessibility; return this; }
        public Builder author(List<Reference<? extends BrainAtlasVersionAuthor>> author) { BrainAtlasVersion.this.author = author; return this; }
        public Builder coordinateSpace(Reference<CommonCoordinateSpaceVersion> coordinateSpace) { BrainAtlasVersion.this.coordinateSpace = coordinateSpace; return this; }
        public Builder copyright(Function<Copyright.EmbeddedBuilder, Copyright> copyright) { BrainAtlasVersion.this.copyright = copyright.apply(Copyright.createEmbedded()); return this; }
        public Builder custodian(List<Reference<? extends BrainAtlasVersionCustodian>> custodian) { BrainAtlasVersion.this.custodian = custodian; return this; }
        public Builder description(String description) { BrainAtlasVersion.this.description = description; return this; }
        public Builder digitalIdentifier(Reference<? extends BrainAtlasVersionDigitalIdentifier> digitalIdentifier) { BrainAtlasVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder fullDocumentation(Reference<? extends BrainAtlasVersionFullDocumentation> fullDocumentation) { BrainAtlasVersion.this.fullDocumentation = fullDocumentation; return this; }
        public Builder fullName(String fullName) { BrainAtlasVersion.this.fullName = fullName; return this; }
        public Builder funding(List<Reference<Funding>> funding) { BrainAtlasVersion.this.funding = funding; return this; }
        public Builder hasTerminology(Function<ParcellationTerminologyVersion.EmbeddedBuilder, ParcellationTerminologyVersion> hasTerminology) { BrainAtlasVersion.this.hasTerminology = hasTerminology.apply(ParcellationTerminologyVersion.createEmbedded()); return this; }
        public Builder homepage(String homepage) { BrainAtlasVersion.this.homepage = homepage; return this; }
        public Builder howToCite(String howToCite) { BrainAtlasVersion.this.howToCite = howToCite; return this; }
        public Builder isAlternativeVersionOf(List<Reference<BrainAtlasVersion>> isAlternativeVersionOf) { BrainAtlasVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        public Builder isNewVersionOf(Reference<BrainAtlasVersion> isNewVersionOf) { BrainAtlasVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        public Builder keyword(List<Reference<? extends BrainAtlasVersionKeyword>> keyword) { BrainAtlasVersion.this.keyword = keyword; return this; }
        public Builder license(Reference<License> license) { BrainAtlasVersion.this.license = license; return this; }
        public Builder majorVersionIdentifier(String majorVersionIdentifier) { BrainAtlasVersion.this.majorVersionIdentifier = majorVersionIdentifier; return this; }
        public Builder ontologyIdentifier(String ontologyIdentifier) { BrainAtlasVersion.this.ontologyIdentifier = ontologyIdentifier; return this; }
        public Builder otherContribution(List<Function<Contribution.EmbeddedBuilder, Contribution>> otherContribution) { BrainAtlasVersion.this.otherContribution = otherContribution.stream().map(b -> b.apply(Contribution.createEmbedded())).toList(); return this; }
        public Builder relatedPublication(List<Reference<? extends BrainAtlasVersionRelatedPublication>> relatedPublication) { BrainAtlasVersion.this.relatedPublication = relatedPublication; return this; }
        public Builder releaseDate(String releaseDate) { BrainAtlasVersion.this.releaseDate = releaseDate; return this; }
        public Builder repository(Reference<FileRepository> repository) { BrainAtlasVersion.this.repository = repository; return this; }
        public Builder shortName(String shortName) { BrainAtlasVersion.this.shortName = shortName; return this; }
        public Builder supportChannel(List<String> supportChannel) { BrainAtlasVersion.this.supportChannel = supportChannel; return this; }
        public Builder type(Reference<AtlasType> type) { BrainAtlasVersion.this.type = type; return this; }
        public Builder usedSpecimen(List<Reference<? extends BrainAtlasVersionUsedSpecimen>> usedSpecimen) { BrainAtlasVersion.this.usedSpecimen = usedSpecimen; return this; }
        public Builder versionIdentifier(String versionIdentifier) { BrainAtlasVersion.this.versionIdentifier = versionIdentifier; return this; }
        public Builder versionInnovation(String versionInnovation) { BrainAtlasVersion.this.versionInnovation = versionInnovation; return this; }
        

        public BrainAtlasVersion build(OpenMINDSContext context) {
            BrainAtlasVersion.super.build(context);
            return BrainAtlasVersion.this;
        }
    }

    public static BrainAtlasVersion.Builder create(LocalId localId){
        return new BrainAtlasVersion(localId).new Builder();
    }

    public BrainAtlasVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, BrainAtlasVersion.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abbreviation")
    private String abbreviation;
    
    public String getAbbreviation() {
       return this.abbreviation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/accessibility")
    private Reference<ProductAccessibility> accessibility;
    
    /**
    * Level to which something is accessible to someone or something.
    */
    public Reference<ProductAccessibility> getAccessibility() {
       return this.accessibility;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends BrainAtlasVersionAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends BrainAtlasVersionAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/coordinateSpace")
    private Reference<CommonCoordinateSpaceVersion> coordinateSpace;
    
    /**
    * Two or three dimensional geometric setting.
    */
    public Reference<CommonCoordinateSpaceVersion> getCoordinateSpace() {
       return this.coordinateSpace;
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
    private List<Reference<? extends BrainAtlasVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends BrainAtlasVersionCustodian>> getCustodian() {
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
    private Reference<? extends BrainAtlasVersionDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends BrainAtlasVersionDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends BrainAtlasVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends BrainAtlasVersionFullDocumentation> getFullDocumentation() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasTerminology")
    private ParcellationTerminologyVersion hasTerminology;
    
    public ParcellationTerminologyVersion getHasTerminology() {
       return this.hasTerminology;
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
    private List<Reference<BrainAtlasVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<BrainAtlasVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<BrainAtlasVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<BrainAtlasVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends BrainAtlasVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends BrainAtlasVersionKeyword>> getKeyword() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/majorVersionIdentifier")
    private String majorVersionIdentifier;
    
    public String getMajorVersionIdentifier() {
       return this.majorVersionIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private String ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public String getOntologyIdentifier() {
       return this.ontologyIdentifier;
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
    private List<Reference<? extends BrainAtlasVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends BrainAtlasVersionRelatedPublication>> getRelatedPublication() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<AtlasType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<AtlasType> getType() {
       return this.type;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecimen")
    private List<Reference<? extends BrainAtlasVersionUsedSpecimen>> usedSpecimen;
    
    public List<Reference<? extends BrainAtlasVersionUsedSpecimen>> getUsedSpecimen() {
       return this.usedSpecimen;
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