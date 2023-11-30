package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntity;
import org.openmetadatainitiative.openminds.latest.core.data.File;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationTerminology.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ParcellationTerminology extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/ParcellationTerminology";

    @JsonIgnore
    public Reference<ParcellationTerminology> getReference() {
        return doGetReference();
    }

    public static Reference<ParcellationTerminology> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ParcellationTerminology() {
        this(null);
    }

    private ParcellationTerminology(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder dataLocation(List<Reference<File>> dataLocation) { ParcellationTerminology.this.dataLocation = dataLocation; return this; }
        public EmbeddedBuilder hasEntity(List<Reference<ParcellationEntity>> hasEntity) { ParcellationTerminology.this.hasEntity = hasEntity; return this; }
        public EmbeddedBuilder ontologyIdentifier(List<String> ontologyIdentifier) { ParcellationTerminology.this.ontologyIdentifier = ontologyIdentifier; return this; }
        

        public ParcellationTerminology build(){
            return ParcellationTerminology.this;
        }
    }

    public static ParcellationTerminology.EmbeddedBuilder createEmbedded(){
        return new ParcellationTerminology(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataLocation")
    private List<Reference<File>> dataLocation;
    
    public List<Reference<File>> getDataLocation() {
       return this.dataLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasEntity")
    private List<Reference<ParcellationEntity>> hasEntity;
    
    public List<Reference<ParcellationEntity>> getHasEntity() {
       return this.hasEntity;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private List<String> ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public List<String> getOntologyIdentifier() {
       return this.ontologyIdentifier;
    }

 

}