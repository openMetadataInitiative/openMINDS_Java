package org.openmetadatainitiative.openminds.v3.core.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.actors.ContactInformation;


import static org.openmetadatainitiative.openminds.v3.core.actors.Consortium.SEMANTIC_NAME;
/**
 * Structured information about an association of two or more persons or organizations, with the objective of participating in a common activity.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Consortium extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionCustodian, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionDeveloper, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestCustodian, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestDeveloper, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeCustodian, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeDeveloper, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionCustodian, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionDeveloper, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperAuthor, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperCustodian, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAuthor, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceCustodian, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourcePublisher, org.openmetadatainitiative.openminds.v3.publications.intf.ChapterAuthor, org.openmetadatainitiative.openminds.v3.publications.intf.ChapterCustodian, org.openmetadatainitiative.openminds.v3.publications.intf.ChapterPublisher, org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticleAuthor, org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticleCustodian, org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticlePublisher, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionAuthor, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionCustodian, org.openmetadatainitiative.openminds.v3.publications.intf.BookAuthor, org.openmetadatainitiative.openminds.v3.publications.intf.BookCustodian, org.openmetadatainitiative.openminds.v3.publications.intf.BookPublisher, org.openmetadatainitiative.openminds.v3.chemicals.intf.ProductSourceProvider, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeManufacturer, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeOwner, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayManufacturer, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayOwner, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteManufacturer, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteOwner, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionAuthor, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionCustodian, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasAuthor, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasCustodian, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceAuthor, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceCustodian, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionAuthor, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionCustodian, org.openmetadatainitiative.openminds.v3.core.actors.intf.AffiliationMemberOf, org.openmetadatainitiative.openminds.v3.core.actors.intf.ContributionContributor, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.SetupManufacturer, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectCoordinator, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetAuthor, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionCustodian, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionDeveloper, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionAuthor, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionCustodian, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.FundingFunder, org.openmetadatainitiative.openminds.v3.core.data.intf.CopyrightHolder, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceManufacturer, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceOwner{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Consortium";

    @JsonIgnore
    public Reference<Consortium> getReference() {
        return doGetReference();
    }

    public static Reference<Consortium> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Consortium() {
        this(null);
    }

    private Consortium(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Consortium>{
        public Builder contactInformation(Reference<ContactInformation> contactInformation) { Consortium.this.contactInformation = contactInformation; return this; }
        public Builder fullName(String fullName) { Consortium.this.fullName = fullName; return this; }
        public Builder homepage(String homepage) { Consortium.this.homepage = homepage; return this; }
        public Builder shortName(String shortName) { Consortium.this.shortName = shortName; return this; }
        

        public Consortium build(OpenMINDSContext context) {
            Consortium.super.build(context);
            return Consortium.this;
        }
    }

    public static Consortium.Builder create(LocalId localId){
        return new Consortium(localId).new Builder();
    }

    public Consortium.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Consortium.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contactInformation")
    private Reference<ContactInformation> contactInformation;
    
    /**
    * Any available way used to contact a person or business (e.g., address, phone number, email address, etc.).
    */
    public Reference<ContactInformation> getContactInformation() {
       return this.contactInformation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/homepage")
    private String homepage;
    
    /**
    * Main website of something or someone.
    */
    public String getHomepage() {
       return this.homepage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

 

}