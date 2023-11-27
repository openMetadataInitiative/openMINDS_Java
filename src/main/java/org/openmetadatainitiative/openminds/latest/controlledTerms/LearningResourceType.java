package org.openmetadatainitiative.openminds.latest.controlledTerms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.controlledTerms.LearningResourceType.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LearningResourceType extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionKeyword, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.BookKeyword, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionKeyword, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionKeyword{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/controlledTerms/LearningResourceType";

    @JsonIgnore
    public Reference<LearningResourceType> getReference() {
        return doGetReference();
    }

    public static Reference<LearningResourceType> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private LearningResourceType(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LearningResourceType>{
        
        public Builder definition(String definition) { LearningResourceType.this.definition = definition; return this; }
        
        public Builder description(String description) { LearningResourceType.this.description = description; return this; }
        
        public Builder interlexIdentifier(String interlexIdentifier) { LearningResourceType.this.interlexIdentifier = interlexIdentifier; return this; }
        
        public Builder knowledgeSpaceLink(String knowledgeSpaceLink) { LearningResourceType.this.knowledgeSpaceLink = knowledgeSpaceLink; return this; }
        
        public Builder name(String name) { LearningResourceType.this.name = name; return this; }
        
        public Builder preferredOntologyIdentifier(String preferredOntologyIdentifier) { LearningResourceType.this.preferredOntologyIdentifier = preferredOntologyIdentifier; return this; }
        
        public Builder synonym(List<String> synonym) { LearningResourceType.this.synonym = synonym; return this; }
        

        public LearningResourceType build(OpenMINDSContext context) {
            if (LearningResourceType.this.id == null) {
                LearningResourceType.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            LearningResourceType.this.atType = SEMANTIC_NAME;
            return LearningResourceType.this;
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

 
    public static LearningResourceType.Builder create(LocalId localId){
        return new LearningResourceType(localId).new Builder();
    }

    public LearningResourceType.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LearningResourceType.class).new Builder();
    }
}