package org.openmetadatainitiative.openminds.latest.controlledTerms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MolecularEntity extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionKeyword, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionKeyword, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationStudyTarget, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.BookKeyword, org.openmetadatainitiative.openminds.latest.chemicals.intf.AmountOfChemicalChemicalProduct, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.ElectrodePlacementStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeConductorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeInsulatorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayConductorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayInsulatorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageLabelingCompound, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteMaterial, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionKeyword, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionKeyword, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionStudyTarget, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelStudyTarget, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionStudyTarget, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.CranialWindowPreparationStudyTarget, org.openmetadatainitiative.openminds.latest.stimulation.activity.intf.StimulationActivityStudyTarget{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/controlledTerms/MolecularEntity";

    @JsonIgnore
    public Reference<MolecularEntity> getReference() {
        return doGetReference();
    }

    public static Reference<MolecularEntity> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private MolecularEntity(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<MolecularEntity>{
        
        public Builder definition(String definition) { MolecularEntity.this.definition = definition; return this; }
        
        public Builder description(String description) { MolecularEntity.this.description = description; return this; }
        
        public Builder interlexIdentifier(String interlexIdentifier) { MolecularEntity.this.interlexIdentifier = interlexIdentifier; return this; }
        
        public Builder knowledgeSpaceLink(String knowledgeSpaceLink) { MolecularEntity.this.knowledgeSpaceLink = knowledgeSpaceLink; return this; }
        
        public Builder name(String name) { MolecularEntity.this.name = name; return this; }
        
        public Builder preferredOntologyIdentifier(String preferredOntologyIdentifier) { MolecularEntity.this.preferredOntologyIdentifier = preferredOntologyIdentifier; return this; }
        
        public Builder synonym(List<String> synonym) { MolecularEntity.this.synonym = synonym; return this; }
        

        public MolecularEntity build() {
            if (MolecularEntity.this.id == null) {
                MolecularEntity.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(MolecularEntity.this.types == null || MolecularEntity.this.types.isEmpty() || !MolecularEntity.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = MolecularEntity.this.types;
                MolecularEntity.this.types = new ArrayList<>();
                MolecularEntity.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    MolecularEntity.this.types.addAll(oldValues);
                }
            }
            return MolecularEntity.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/definition")
    private String definition;
    
    /**
    * Short, but precise statement of the meaning of a word, word group, sign or a symbol.
    */
    public String getDefinition() {
       return this.definition;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/interlexIdentifier")
    private String interlexIdentifier;
    
    /**
    * Persistent identifier for a term registered in the InterLex project.
    */
    public String getInterlexIdentifier() {
       return this.interlexIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/knowledgeSpaceLink")
    private String knowledgeSpaceLink;
    
    /**
    * Persistent link to an encyclopedia entry in the Knowledge Space project.
    */
    public String getKnowledgeSpaceLink() {
       return this.knowledgeSpaceLink;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/preferredOntologyIdentifier")
    private String preferredOntologyIdentifier;
    
    /**
    * Persistent identifier of a preferred ontological term.
    */
    public String getPreferredOntologyIdentifier() {
       return this.preferredOntologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/synonym")
    private List<String> synonym;
    
    /**
    * Words or expressions used in the same language that have the same or nearly the same meaning in some or all senses.
    */
    public List<String> getSynonym() {
       return this.synonym;
    }

 
    public static MolecularEntity.Builder create(LocalId localId){
        return new MolecularEntity(localId).new Builder();
    }

    public MolecularEntity.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, MolecularEntity.class).new Builder();
    }
}