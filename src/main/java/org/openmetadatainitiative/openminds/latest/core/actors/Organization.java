package org.openmetadatainitiative.openminds.latest.core.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.actors.Affiliation;
import org.openmetadatainitiative.openminds.latest.core.actors.intf.OrganizationDigitalIdentifier;


import static org.openmetadatainitiative.openminds.latest.core.actors.Organization.SEMANTIC_NAME;
/**
 * An entity comprised of one or more natural persons with a particular purpose. [adapted from Wikipedia](https://en.wikipedia.org/wiki/Organization)
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Organization extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.BookAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.BookCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.BookPublisher, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourcePublisher, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticlePublisher, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterPublisher, org.openmetadatainitiative.openminds.latest.chemicals.intf.ProductSourceProvider, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceManufacturer, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceOwner, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayManufacturer, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayOwner, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteManufacturer, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteOwner, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeManufacturer, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeOwner, org.openmetadatainitiative.openminds.latest.core.actors.intf.AffiliationMemberOf, org.openmetadatainitiative.openminds.latest.core.actors.intf.ContributionContributor, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.FundingFunder, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetAuthor, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectCoordinator, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionAuthor, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.SetupManufacturer, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.data.intf.CopyrightHolder, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeDeveloper, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionCustodian, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceCustodian, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasCustodian, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionCustodian{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/Organization";

    @JsonIgnore
    public Reference<Organization> getReference() {
        return doGetReference();
    }

    public static Reference<Organization> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Organization() {
        this(null);
    }

    private Organization(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Organization>{
        public Builder affiliation(List<Function<Affiliation.EmbeddedBuilder, Affiliation>> affiliation) { Organization.this.affiliation = affiliation.stream().map(b -> b.apply(Affiliation.createEmbedded())).toList(); return this; }
        public Builder digitalIdentifier(List<Reference<? extends OrganizationDigitalIdentifier>> digitalIdentifier) { Organization.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder fullName(String fullName) { Organization.this.fullName = fullName; return this; }
        public Builder hasParent(List<Reference<Organization>> hasParent) { Organization.this.hasParent = hasParent; return this; }
        public Builder homepage(String homepage) { Organization.this.homepage = homepage; return this; }
        public Builder shortName(String shortName) { Organization.this.shortName = shortName; return this; }
        

        public Organization build(OpenMINDSContext context) {
            Organization.super.build(context);
            return Organization.this;
        }
    }

    public static Organization.Builder create(LocalId localId){
        return new Organization(localId).new Builder();
    }

    public Organization.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Organization.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/affiliation")
    private List<Affiliation> affiliation;
    
    /**
    * Declaration of a person being closely associated to an organization.
    */
    public List<Affiliation> getAffiliation() {
       return this.affiliation;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/digitalIdentifier")
    private List<Reference<? extends OrganizationDigitalIdentifier>> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public List<Reference<? extends OrganizationDigitalIdentifier>> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/hasParent")
    private List<Reference<Organization>> hasParent;
    
    /**
    * Reference to a parent object or legal person.
    */
    public List<Reference<Organization>> getHasParent() {
       return this.hasParent;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/homepage")
    private String homepage;
    
    /**
    * Main website of something or someone.
    */
    public String getHomepage() {
       return this.homepage;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

 

}