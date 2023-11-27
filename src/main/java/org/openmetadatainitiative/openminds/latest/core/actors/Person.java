package org.openmetadatainitiative.openminds.latest.core.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.actors.AccountInformation;
import org.openmetadatainitiative.openminds.latest.core.actors.Affiliation;
import org.openmetadatainitiative.openminds.latest.core.actors.ContactInformation;
import org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ORCID;


import static org.openmetadatainitiative.openminds.latest.core.actors.Person.SEMANTIC_NAME;
/**
 * Structured information on a person.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowExecutionStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionCustodian, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionDeveloper, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisStartedBy, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationPerformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationStartedBy, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourcePublisher, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterPublisher, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticlePublisher, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.BookAuthor, org.openmetadatainitiative.openminds.latest.publications.intf.BookCustodian, org.openmetadatainitiative.openminds.latest.publications.intf.BookPublisher, org.openmetadatainitiative.openminds.latest.chemicals.intf.ProductSourceProvider, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.ElectrodePlacementPerformedBy, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingPerformedBy, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityPerformedBy, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeManufacturer, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeOwner, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayManufacturer, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayOwner, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteManufacturer, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteOwner, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionCustodian, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasCustodian, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceCustodian, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionAuthor, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionCustodian, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionPerformedBy, org.openmetadatainitiative.openminds.latest.core.actors.intf.ContributionContributor, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.SetupManufacturer, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectCoordinator, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetAuthor, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionCustodian, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionDeveloper, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionAuthor, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionCustodian, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.FundingFunder, org.openmetadatainitiative.openminds.latest.core.data.intf.CopyrightHolder, org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.CranialWindowPreparationPerformedBy, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceManufacturer, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceOwner, org.openmetadatainitiative.openminds.latest.stimulation.activity.intf.StimulationActivityPerformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Person";

    @JsonIgnore
    public Reference<Person> getReference() {
        return doGetReference();
    }

    public static Reference<Person> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private Person(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Person>{
        
        public Builder affiliation(List<Affiliation> affiliation) { Person.this.affiliation = affiliation; return this; }
        
        public Builder alternateName(List<String> alternateName) { Person.this.alternateName = alternateName; return this; }
        
        public Builder associatedAccount(List<Reference<AccountInformation>> associatedAccount) { Person.this.associatedAccount = associatedAccount; return this; }
        
        public Builder contactInformation(Reference<ContactInformation> contactInformation) { Person.this.contactInformation = contactInformation; return this; }
        
        public Builder digitalIdentifier(List<Reference<ORCID>> digitalIdentifier) { Person.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder familyName(String familyName) { Person.this.familyName = familyName; return this; }
        
        public Builder givenName(String givenName) { Person.this.givenName = givenName; return this; }
        

        public Person build(OpenMINDSContext context) {
            if (Person.this.id == null) {
                Person.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            Person.this.atType = SEMANTIC_NAME;
            return Person.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/affiliation")
    private List<Affiliation> affiliation;
    
    /**
    * Declaration of a person being closely associated to an organization.
    */
    public List<Affiliation> getAffiliation() {
       return this.affiliation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/alternateName")
    private List<String> alternateName;
    
    public List<String> getAlternateName() {
       return this.alternateName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/associatedAccount")
    private List<Reference<AccountInformation>> associatedAccount;
    
    public List<Reference<AccountInformation>> getAssociatedAccount() {
       return this.associatedAccount;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contactInformation")
    private Reference<ContactInformation> contactInformation;
    
    /**
    * Any available way used to contact a person or business (e.g., address, phone number, email address, etc.).
    */
    public Reference<ContactInformation> getContactInformation() {
       return this.contactInformation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private List<Reference<ORCID>> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public List<Reference<ORCID>> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/familyName")
    private String familyName;
    
    /**
    * Name borne in common by members of a family.
    */
    public String getFamilyName() {
       return this.familyName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/givenName")
    private String givenName;
    
    /**
    * Name given to a person, including all potential middle names, but excluding the family name.
    */
    public String getGivenName() {
       return this.givenName;
    }

 
    public static Person.Builder create(LocalId localId){
        return new Person(localId).new Builder();
    }

    public Person.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Person.class).new Builder();
    }
}