package org.openmetadatainitiative.openminds.v3.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntity;
import org.openmetadatainitiative.openminds.v3.core.data.File;


import static org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationTerminology.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParcellationTerminology extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/ParcellationTerminology";

    @JsonIgnore
    public Reference<ParcellationTerminology> getReference() {
        return doGetReference();
    }

    public static Reference<ParcellationTerminology> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ParcellationTerminology(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ParcellationTerminology>{
        
        public Builder dataLocation(List<Reference<File>> dataLocation) { ParcellationTerminology.this.dataLocation = dataLocation; return this; }
        
        public Builder hasEntity(List<Reference<ParcellationEntity>> hasEntity) { ParcellationTerminology.this.hasEntity = hasEntity; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { ParcellationTerminology.this.ontologyIdentifier = ontologyIdentifier; return this; }
        

        public ParcellationTerminology build(OpenMINDSContext context) {
            if (ParcellationTerminology.this.id == null) {
                ParcellationTerminology.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            ParcellationTerminology.this.type = SEMANTIC_NAME;
            return ParcellationTerminology.this;
        }
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

 
    public static ParcellationTerminology.Builder create(LocalId localId){
        return new ParcellationTerminology(localId).new Builder();
    }

    public ParcellationTerminology.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ParcellationTerminology.class).new Builder();
    }
}