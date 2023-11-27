package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.research.intf.BehavioralProtocolDescribedIn;
import org.openmetadatainitiative.openminds.v3.core.research.intf.BehavioralProtocolStimulation;
import org.openmetadatainitiative.openminds.v3.core.research.intf.BehavioralProtocolStimulusType;


import static org.openmetadatainitiative.openminds.v3.core.research.BehavioralProtocol.SEMANTIC_NAME;
/**
 * Structured information about a protocol used in an experiment studying human or animal behavior.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BehavioralProtocol extends Instance implements org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/BehavioralProtocol";

    @JsonIgnore
    public Reference<BehavioralProtocol> getReference() {
        return doGetReference();
    }

    public static Reference<BehavioralProtocol> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private BehavioralProtocol(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<BehavioralProtocol>{
        
        public Builder describedIn(List<Reference<? extends BehavioralProtocolDescribedIn>> describedIn) { BehavioralProtocol.this.describedIn = describedIn; return this; }
        
        public Builder description(String description) { BehavioralProtocol.this.description = description; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { BehavioralProtocol.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder name(String name) { BehavioralProtocol.this.name = name; return this; }
        
        public Builder stimulation(List<Reference<? extends BehavioralProtocolStimulation>> stimulation) { BehavioralProtocol.this.stimulation = stimulation; return this; }
        
        public Builder stimulusType(List<Reference<? extends BehavioralProtocolStimulusType>> stimulusType) { BehavioralProtocol.this.stimulusType = stimulusType; return this; }
        

        public BehavioralProtocol build(OpenMINDSContext context) {
            if (BehavioralProtocol.this.id == null) {
                BehavioralProtocol.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            BehavioralProtocol.this.atType = SEMANTIC_NAME;
            return BehavioralProtocol.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/describedIn")
    private List<Reference<? extends BehavioralProtocolDescribedIn>> describedIn;
    
    public List<Reference<? extends BehavioralProtocolDescribedIn>> getDescribedIn() {
       return this.describedIn;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/stimulation")
    private List<Reference<? extends BehavioralProtocolStimulation>> stimulation;
    
    public List<Reference<? extends BehavioralProtocolStimulation>> getStimulation() {
       return this.stimulation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/stimulusType")
    private List<Reference<? extends BehavioralProtocolStimulusType>> stimulusType;
    
    public List<Reference<? extends BehavioralProtocolStimulusType>> getStimulusType() {
       return this.stimulusType;
    }

 
    public static BehavioralProtocol.Builder create(LocalId localId){
        return new BehavioralProtocol(localId).new Builder();
    }

    public BehavioralProtocol.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, BehavioralProtocol.class).new Builder();
    }
}