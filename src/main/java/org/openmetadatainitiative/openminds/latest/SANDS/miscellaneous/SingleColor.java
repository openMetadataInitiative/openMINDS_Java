package org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.SingleColor.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class SingleColor extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.ViewerSpecificationPreferredDisplayColor{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/SingleColor";

    @JsonIgnore
    public Reference<SingleColor> getReference() {
        return doGetReference();
    }

    public static Reference<SingleColor> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private SingleColor() {
        this(null);
    }

    private SingleColor(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SingleColor>{
        public Builder value(String value) { SingleColor.this.value = value; return this; }
        

        public SingleColor build(OpenMINDSContext context) {
            SingleColor.super.build(context);
            return SingleColor.this;
        }
    }

    public static SingleColor.Builder create(LocalId localId){
        return new SingleColor(localId).new Builder();
    }

    public SingleColor.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SingleColor.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/value")
    private String value;
    
    /**
    * Entry for a property.
    */
    public String getValue() {
       return this.value;
    }

 

}