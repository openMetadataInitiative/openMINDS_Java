package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.data.License.SEMANTIC_NAME;
/**
 * Structured information on a used license.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class License extends Instance implements org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionLicense{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/License";

    @JsonIgnore
    public Reference<License> getReference() {
        return doGetReference();
    }

    public static Reference<License> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private License(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<License>{
        
        public Builder fullName(String fullName) { License.this.fullName = fullName; return this; }
        
        public Builder legalCode(String legalCode) { License.this.legalCode = legalCode; return this; }
        
        public Builder shortName(String shortName) { License.this.shortName = shortName; return this; }
        
        public Builder webpage(List<String> webpage) { License.this.webpage = webpage; return this; }
        

        public License build(OpenMINDSContext context) {
            if (License.this.id == null) {
                License.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            License.this.type = SEMANTIC_NAME;
            return License.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/legalCode")
    private String legalCode;
    
    /**
    * Type of legislation that claims to cover the law system (complete or parts) as it existed at the time the code was enacted.
    */
    public String getLegalCode() {
       return this.legalCode;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/webpage")
    private List<String> webpage;
    
    /**
    * Hypertext document (block of information) found on the World Wide Web.
    */
    public List<String> getWebpage() {
       return this.webpage;
    }

 
    public static License.Builder create(LocalId localId){
        return new License(localId).new Builder();
    }

    public License.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, License.class).new Builder();
    }
}