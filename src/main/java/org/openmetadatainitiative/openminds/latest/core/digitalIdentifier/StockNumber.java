package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.actors.Organization;


import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.StockNumber.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class StockNumber extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/StockNumber";

    @JsonIgnore
    public Reference<StockNumber> getReference() {
        return doGetReference();
    }

    public static Reference<StockNumber> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private StockNumber() {
        this(null);
    }

    private StockNumber(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder identifier(String identifier) { StockNumber.this.identifier = identifier; return this; }
        public EmbeddedBuilder vendor(Reference<Organization> vendor) { StockNumber.this.vendor = vendor; return this; }
        

        public StockNumber build(){
            return StockNumber.this;
        }
    }

    public static StockNumber.EmbeddedBuilder createEmbedded(){
        return new StockNumber(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/vendor")
    private Reference<Organization> vendor;
    
    public Reference<Organization> getVendor() {
       return this.vendor;
    }

 

}