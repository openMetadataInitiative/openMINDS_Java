package org.openmetadatainitiative.openminds.latest.controlledTerms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.controlledTerms.AnatomicalPlane.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnatomicalPlane extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionKeyword, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionKeyword, org.openmetadatainitiative.openminds.latest.publications.intf.BookKeyword, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionKeyword, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionKeyword, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionKeyword{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/controlledTerms/AnatomicalPlane";

    @JsonIgnore
    public Reference<AnatomicalPlane> getReference() {
        return doGetReference();
    }

    public static Reference<AnatomicalPlane> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private AnatomicalPlane(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<AnatomicalPlane>{
        
        public Builder definition(String definition) { AnatomicalPlane.this.definition = definition; return this; }
        
        public Builder description(String description) { AnatomicalPlane.this.description = description; return this; }
        
        public Builder interlexIdentifier(String interlexIdentifier) { AnatomicalPlane.this.interlexIdentifier = interlexIdentifier; return this; }
        
        public Builder knowledgeSpaceLink(String knowledgeSpaceLink) { AnatomicalPlane.this.knowledgeSpaceLink = knowledgeSpaceLink; return this; }
        
        public Builder name(String name) { AnatomicalPlane.this.name = name; return this; }
        
        public Builder preferredOntologyIdentifier(String preferredOntologyIdentifier) { AnatomicalPlane.this.preferredOntologyIdentifier = preferredOntologyIdentifier; return this; }
        
        public Builder synonym(List<String> synonym) { AnatomicalPlane.this.synonym = synonym; return this; }
        

        public AnatomicalPlane build() {
            if (AnatomicalPlane.this.id == null) {
                AnatomicalPlane.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(AnatomicalPlane.this.types == null || AnatomicalPlane.this.types.isEmpty() || !AnatomicalPlane.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = AnatomicalPlane.this.types;
                AnatomicalPlane.this.types = new ArrayList<>();
                AnatomicalPlane.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    AnatomicalPlane.this.types.addAll(oldValues);
                }
            }
            return AnatomicalPlane.this;
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

 
    public static AnatomicalPlane.Builder create(LocalId localId){
        return new AnatomicalPlane(localId).new Builder();
    }

    public AnatomicalPlane.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, AnatomicalPlane.class).new Builder();
    }
}