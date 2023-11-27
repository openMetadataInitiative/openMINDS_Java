package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.data.intf.CopyrightHolder;


import static org.openmetadatainitiative.openminds.v3.core.data.Copyright.SEMANTIC_NAME;
/**
 * Structured information on the copyright.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Copyright extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Copyright";

    @JsonIgnore
    public Reference<Copyright> getReference() {
        return doGetReference();
    }

    public static Reference<Copyright> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private Copyright(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Copyright>{
        
        public Builder holder(List<Reference<? extends CopyrightHolder>> holder) { Copyright.this.holder = holder; return this; }
        
        public Builder year(List<String> year) { Copyright.this.year = year; return this; }
        

        public Copyright build(OpenMINDSContext context) {
            if (Copyright.this.id == null) {
                Copyright.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            Copyright.this.type = SEMANTIC_NAME;
            return Copyright.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/holder")
    private List<Reference<? extends CopyrightHolder>> holder;
    
    /**
    * Legal person in possession of something.
    */
    public List<Reference<? extends CopyrightHolder>> getHolder() {
       return this.holder;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/year")
    private List<String> year;
    
    /**
    * Cycle in the Gregorian calendar specified by a number and comprised of 365 or 366 days divided into 12 months beginning with January and ending with December.
    */
    public List<String> getYear() {
       return this.year;
    }

 
    public static Copyright.Builder create(LocalId localId){
        return new Copyright(localId).new Builder();
    }

    public Copyright.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Copyright.class).new Builder();
    }
}