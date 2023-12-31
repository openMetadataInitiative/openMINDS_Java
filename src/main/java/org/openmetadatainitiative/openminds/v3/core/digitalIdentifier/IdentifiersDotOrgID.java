package org.openmetadatainitiative.openminds.v3.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.IdentifiersDotOrgID.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class IdentifiersDotOrgID extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetDigitalIdentifier, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionDigitalIdentifier{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/IdentifiersDotOrgID";

    @JsonIgnore
    public Reference<IdentifiersDotOrgID> getReference() {
        return doGetReference();
    }

    public static Reference<IdentifiersDotOrgID> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private IdentifiersDotOrgID() {
        this(null);
    }

    private IdentifiersDotOrgID(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<IdentifiersDotOrgID>{
        public Builder identifier(String identifier) { IdentifiersDotOrgID.this.identifier = identifier; return this; }
        

        public IdentifiersDotOrgID build(OpenMINDSContext context) {
            IdentifiersDotOrgID.super.build(context);
            return IdentifiersDotOrgID.this;
        }
    }

    public static IdentifiersDotOrgID.Builder create(LocalId localId){
        return new IdentifiersDotOrgID(localId).new Builder();
    }

    public IdentifiersDotOrgID.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, IdentifiersDotOrgID.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

 

}