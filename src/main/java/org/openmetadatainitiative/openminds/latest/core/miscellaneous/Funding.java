package org.openmetadatainitiative.openminds.latest.core.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.FundingFunder;


import static org.openmetadatainitiative.openminds.latest.core.miscellaneous.Funding.*;
/**
 * Structured information on used funding.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Funding extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Funding";

    @JsonIgnore
    public Reference<Funding> getReference() {
        return doGetReference();
    }

    public static Reference<Funding> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Funding(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Funding>{
        
        public Builder acknowledgement(String acknowledgement) { Funding.this.acknowledgement = acknowledgement; return this; }
        
        public Builder awardNumber(String awardNumber) { Funding.this.awardNumber = awardNumber; return this; }
        
        public Builder awardTitle(String awardTitle) { Funding.this.awardTitle = awardTitle; return this; }
        
        public Builder funder(Reference<? extends FundingFunder> funder) { Funding.this.funder = funder; return this; }
        

        public Funding build() {
            if (Funding.this.id == null) {
                Funding.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Funding.this.types == null || Funding.this.types.isEmpty() || !Funding.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Funding.this.types;
                Funding.this.types = new ArrayList<>();
                Funding.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Funding.this.types.addAll(oldValues);
                }
            }
            return Funding.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/acknowledgement")
    private String acknowledgement;
    
    /**
    * Official declaration or avowal of appreciation of an act or achievement.
    */
    public String getAcknowledgement() {
       return this.acknowledgement;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/awardNumber")
    private String awardNumber;
    
    /**
    * Machine-readable identifier for a benefit that is conferred or bestowed on the basis of merit or need.
    */
    public String getAwardNumber() {
       return this.awardNumber;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/awardTitle")
    private String awardTitle;
    
    /**
    * Human-readable identifier for a benefit that is conferred or bestowed on the basis of merit or need.
    */
    public String getAwardTitle() {
       return this.awardTitle;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/funder")
    private Reference<? extends FundingFunder> funder;
    
    /**
    * Legal person that provides money for a particular purpose.
    */
    public Reference<? extends FundingFunder> getFunder() {
       return this.funder;
    }

 
    public static Funding.Builder create(LocalId localId){
        return new Funding(localId).new Builder();
    }

    public Funding.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Funding.class).new Builder();
    }
}