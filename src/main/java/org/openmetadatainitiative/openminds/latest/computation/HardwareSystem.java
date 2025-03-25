package org.openmetadatainitiative.openminds.latest.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.computation.HardwareSystem.SEMANTIC_NAME;
/**
 * Structured information about computing hardware.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class HardwareSystem extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/HardwareSystem";

    @JsonIgnore
    public Reference<HardwareSystem> getReference() {
        return doGetReference();
    }

    public static Reference<HardwareSystem> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private HardwareSystem() {
        this(null);
    }

    private HardwareSystem(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<HardwareSystem>{
        public Builder description(String description) { HardwareSystem.this.description = description; return this; }
        public Builder name(String name) { HardwareSystem.this.name = name; return this; }
        public Builder versionIdentifier(String versionIdentifier) { HardwareSystem.this.versionIdentifier = versionIdentifier; return this; }
        

        public HardwareSystem build(OpenMINDSContext context) {
            HardwareSystem.super.build(context);
            return HardwareSystem.this;
        }
    }

    public static HardwareSystem.Builder create(LocalId localId){
        return new HardwareSystem(localId).new Builder();
    }

    public HardwareSystem.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, HardwareSystem.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/versionIdentifier")
    private String versionIdentifier;
    
    /**
    * Term or code used to identify the version of something.
    */
    public String getVersionIdentifier() {
       return this.versionIdentifier;
    }

 

}