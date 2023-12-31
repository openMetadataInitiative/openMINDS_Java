package org.openmetadatainitiative.openminds.latest.stimulation.stimulus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.ElectricalStimulusType;


import static org.openmetadatainitiative.openminds.latest.stimulation.stimulus.EphysStimulus.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class EphysStimulus extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/stimulation/EphysStimulus";

    @JsonIgnore
    public Reference<EphysStimulus> getReference() {
        return doGetReference();
    }

    public static Reference<EphysStimulus> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private EphysStimulus() {
        this(null);
    }

    private EphysStimulus(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<EphysStimulus>{
        public Builder type(Reference<ElectricalStimulusType> type) { EphysStimulus.this.type = type; return this; }
        

        public EphysStimulus build(OpenMINDSContext context) {
            EphysStimulus.super.build(context);
            return EphysStimulus.this;
        }
    }

    public static EphysStimulus.Builder create(LocalId localId){
        return new EphysStimulus(localId).new Builder();
    }

    public EphysStimulus.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, EphysStimulus.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<ElectricalStimulusType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<ElectricalStimulusType> getType() {
       return this.type;
    }

 

}