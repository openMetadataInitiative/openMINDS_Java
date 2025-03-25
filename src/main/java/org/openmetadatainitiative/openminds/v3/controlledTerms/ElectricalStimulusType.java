package org.openmetadatainitiative.openminds.v3.controlledTerms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.controlledTerms.ElectricalStimulusType.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ElectricalStimulusType extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.BookKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticleKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.ChapterKeyword, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingStudyTarget, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementStudyTarget, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionStudyTarget, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelStudyTarget, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionKeyword, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionStudyTarget, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolStimulusType, org.openmetadatainitiative.openminds.v3.core.research.intf.BehavioralProtocolStimulusType, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionKeyword, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationStudyTarget, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionKeyword, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyStudyTarget, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionKeyword, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionKeyword, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityStudyTarget{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/controlledTerms/ElectricalStimulusType";

    @JsonIgnore
    public Reference<ElectricalStimulusType> getReference() {
        return doGetReference();
    }

    public static Reference<ElectricalStimulusType> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ElectricalStimulusType() {
        this(null);
    }

    private ElectricalStimulusType(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ElectricalStimulusType>{
        public Builder definition(String definition) { ElectricalStimulusType.this.definition = definition; return this; }
        public Builder description(String description) { ElectricalStimulusType.this.description = description; return this; }
        public Builder interlexIdentifier(String interlexIdentifier) { ElectricalStimulusType.this.interlexIdentifier = interlexIdentifier; return this; }
        public Builder knowledgeSpaceLink(String knowledgeSpaceLink) { ElectricalStimulusType.this.knowledgeSpaceLink = knowledgeSpaceLink; return this; }
        public Builder name(String name) { ElectricalStimulusType.this.name = name; return this; }
        public Builder preferredOntologyIdentifier(String preferredOntologyIdentifier) { ElectricalStimulusType.this.preferredOntologyIdentifier = preferredOntologyIdentifier; return this; }
        public Builder synonym(List<String> synonym) { ElectricalStimulusType.this.synonym = synonym; return this; }
        

        public ElectricalStimulusType build(OpenMINDSContext context) {
            ElectricalStimulusType.super.build(context);
            return ElectricalStimulusType.this;
        }
    }

    public static ElectricalStimulusType.Builder create(LocalId localId){
        return new ElectricalStimulusType(localId).new Builder();
    }

    public ElectricalStimulusType.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ElectricalStimulusType.class).new Builder();
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

 

}