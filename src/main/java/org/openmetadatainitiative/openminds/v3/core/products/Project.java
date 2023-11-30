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

import org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectCoordinator;
import org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart;


import static org.openmetadatainitiative.openminds.v3.core.products.Project.SEMANTIC_NAME;
/**
 * Structured information on a research project.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Project extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Project";

    @JsonIgnore
    public Reference<Project> getReference() {
        return doGetReference();
    }

    public static Reference<Project> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Project() {
        this(null);
    }

    private Project(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Project>{
        public Builder coordinator(List<Reference<? extends ProjectCoordinator>> coordinator) { Project.this.coordinator = coordinator; return this; }
        public Builder description(String description) { Project.this.description = description; return this; }
        public Builder fullName(String fullName) { Project.this.fullName = fullName; return this; }
        public Builder hasPart(List<Reference<? extends ProjectHasPart>> hasPart) { Project.this.hasPart = hasPart; return this; }
        public Builder homepage(String homepage) { Project.this.homepage = homepage; return this; }
        public Builder shortName(String shortName) { Project.this.shortName = shortName; return this; }
        

        public Project build(OpenMINDSContext context) {
            Project.super.build(context);
            return Project.this;
        }
    }

    public static Project.Builder create(LocalId localId){
        return new Project(localId).new Builder();
    }

    public Project.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Project.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/coordinator")
    private List<Reference<? extends ProjectCoordinator>> coordinator;
    
    /**
    * Legal person who organizes the collaborative work of people or groups.
    */
    public List<Reference<? extends ProjectCoordinator>> getCoordinator() {
       return this.coordinator;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasPart")
    private List<Reference<? extends ProjectHasPart>> hasPart;
    
    public List<Reference<? extends ProjectHasPart>> getHasPart() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

 

}