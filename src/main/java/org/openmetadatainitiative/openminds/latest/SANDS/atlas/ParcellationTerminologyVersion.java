package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntityVersion;
import org.openmetadatainitiative.openminds.latest.core.data.File;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationTerminologyVersion.SEMANTIC_NAME;
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

    public static Reference<ParcellationTerminologyVersion> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ParcellationTerminologyVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ParcellationTerminologyVersion>{
        
        public Builder dataLocation(List<Reference<File>> dataLocation) { ParcellationTerminologyVersion.this.dataLocation = dataLocation; return this; }
        
        public Builder hasEntity(List<Reference<ParcellationEntityVersion>> hasEntity) { ParcellationTerminologyVersion.this.hasEntity = hasEntity; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { ParcellationTerminologyVersion.this.ontologyIdentifier = ontologyIdentifier; return this; }
        

        public ParcellationTerminologyVersion build(OpenMINDSContext context) {
            if (ParcellationTerminologyVersion.this.id == null) {
                ParcellationTerminologyVersion.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            ParcellationTerminologyVersion.this.type = SEMANTIC_NAME;
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