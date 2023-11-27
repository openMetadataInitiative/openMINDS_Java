package org.openmetadatainitiative.openminds.v3.core.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.ContributionType;
import org.openmetadatainitiative.openminds.v3.core.actors.intf.ContributionContributor;


import static org.openmetadatainitiative.openminds.v3.core.actors.Contribution.SEMANTIC_NAME;
/**
 * Structured information on the contribution made to a research product.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contribution extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Contribution";

    @JsonIgnore
    public Reference<Contribution> getReference() {
        return doGetReference();
    }

    public static Reference<Contribution> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Contribution(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Contribution>{
        
        public Builder contributor(Reference<? extends ContributionContributor> contributor) { Contribution.this.contributor = contributor; return this; }
        
        public Builder type(List<Reference<ContributionType>> type) { Contribution.this.type = type; return this; }
        

        public Contribution build() {
            if (Contribution.this.id == null) {
                Contribution.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Contribution.this.types == null || Contribution.this.types.isEmpty() || !Contribution.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Contribution.this.types;
                Contribution.this.types = new ArrayList<>();
                Contribution.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Contribution.this.types.addAll(oldValues);
                }
            }
            return Contribution.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contributor")
    private Reference<? extends ContributionContributor> contributor;
    
    /**
    * Legal person that gave or supplied something as a part or share.
    */
    public Reference<? extends ContributionContributor> getContributor() {
       return this.contributor;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private List<Reference<ContributionType>> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public List<Reference<ContributionType>> getType() {
       return this.type;
    }

 
    public static Contribution.Builder create(LocalId localId){
        return new Contribution(localId).new Builder();
    }

    public Contribution.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Contribution.class).new Builder();
    }
}