package org.openmetadatainitiative.openminds.v3.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntityVersion;
import org.openmetadatainitiative.openminds.v3.core.data.File;


import static org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationTerminologyVersion.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParcellationTerminologyVersion extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/ParcellationTerminologyVersion";

    @JsonIgnore
    public Reference<ParcellationTerminologyVersion> getReference() {
        return doGetReference();
    }

    public static Reference<ParcellationTerminologyVersion> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ParcellationTerminologyVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ParcellationTerminologyVersion>{
        
        public Builder dataLocation(List<Reference<File>> dataLocation) { ParcellationTerminologyVersion.this.dataLocation = dataLocation; return this; }
        
        public Builder hasEntity(List<Reference<ParcellationEntityVersion>> hasEntity) { ParcellationTerminologyVersion.this.hasEntity = hasEntity; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { ParcellationTerminologyVersion.this.ontologyIdentifier = ontologyIdentifier; return this; }
        

        public ParcellationTerminologyVersion build() {
            if (ParcellationTerminologyVersion.this.id == null) {
                ParcellationTerminologyVersion.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ParcellationTerminologyVersion.this.types == null || ParcellationTerminologyVersion.this.types.isEmpty() || !ParcellationTerminologyVersion.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ParcellationTerminologyVersion.this.types;
                ParcellationTerminologyVersion.this.types = new ArrayList<>();
                ParcellationTerminologyVersion.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ParcellationTerminologyVersion.this.types.addAll(oldValues);
                }
            }
            return ParcellationTerminologyVersion.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataLocation")
    private List<Reference<File>> dataLocation;
    
    public List<Reference<File>> getDataLocation() {
       return this.dataLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasEntity")
    private List<Reference<ParcellationEntityVersion>> hasEntity;
    
    public List<Reference<ParcellationEntityVersion>> getHasEntity() {
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

 
    public static ParcellationTerminologyVersion.Builder create(LocalId localId){
        return new ParcellationTerminologyVersion(localId).new Builder();
    }

    public ParcellationTerminologyVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ParcellationTerminologyVersion.class).new Builder();
    }
}