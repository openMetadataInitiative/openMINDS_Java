package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.products.WebServiceVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceDeveloper;


import static org.openmetadatainitiative.openminds.latest.core.products.WebService.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebService extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperResourceItemHostedBy, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/WebService";

    @JsonIgnore
    public Reference<WebService> getReference() {
        return doGetReference();
    }

    public static Reference<WebService> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private WebService(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<WebService>{
        
        public Builder custodian(List<Reference<? extends WebServiceCustodian>> custodian) { WebService.this.custodian = custodian; return this; }
        
        public Builder description(String description) { WebService.this.description = description; return this; }
        
        public Builder developer(List<Reference<? extends WebServiceDeveloper>> developer) { WebService.this.developer = developer; return this; }
        
        public Builder fullName(String fullName) { WebService.this.fullName = fullName; return this; }
        
        public Builder hasVersion(List<Reference<WebServiceVersion>> hasVersion) { WebService.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { WebService.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { WebService.this.howToCite = howToCite; return this; }
        
        public Builder shortName(String shortName) { WebService.this.shortName = shortName; return this; }
        

        public WebService build(OpenMINDSContext context) {
            if (WebService.this.id == null) {
                WebService.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            WebService.this.type = SEMANTIC_NAME;
            return WebService.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends WebServiceCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends WebServiceCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/developer")
    private List<Reference<? extends WebServiceDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends WebServiceDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasVersion")
    private List<Reference<WebServiceVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<WebServiceVersion>> getHasVersion() {
       return this.hasVersion;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/homepage")
    private String homepage;
    
    /**
    * Main website of something or someone.
    */
    public String getHomepage() {
       return this.homepage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/howToCite")
    private String howToCite;
    
    /**
    * Preferred format for citing a particular object or legal person.
    */
    public String getHowToCite() {
       return this.howToCite;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

 
    public static WebService.Builder create(LocalId localId){
        return new WebService(localId).new Builder();
    }

    public WebService.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, WebService.class).new Builder();
    }
}