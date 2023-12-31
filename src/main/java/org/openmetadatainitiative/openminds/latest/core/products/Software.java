package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.products.SoftwareVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareDeveloper;
import org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareDigitalIdentifier;


import static org.openmetadatainitiative.openminds.latest.core.products.Software.SEMANTIC_NAME;
/**
 * Structured information on a software tool (concept level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Software extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Software";

    @JsonIgnore
    public Reference<Software> getReference() {
        return doGetReference();
    }

    public static Reference<Software> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Software() {
        this(null);
    }

    private Software(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Software>{
        public Builder custodian(List<Reference<? extends SoftwareCustodian>> custodian) { Software.this.custodian = custodian; return this; }
        public Builder description(String description) { Software.this.description = description; return this; }
        public Builder developer(List<Reference<? extends SoftwareDeveloper>> developer) { Software.this.developer = developer; return this; }
        public Builder digitalIdentifier(Reference<? extends SoftwareDigitalIdentifier> digitalIdentifier) { Software.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder fullName(String fullName) { Software.this.fullName = fullName; return this; }
        public Builder hasVersion(List<Reference<SoftwareVersion>> hasVersion) { Software.this.hasVersion = hasVersion; return this; }
        public Builder homepage(String homepage) { Software.this.homepage = homepage; return this; }
        public Builder howToCite(String howToCite) { Software.this.howToCite = howToCite; return this; }
        public Builder shortName(String shortName) { Software.this.shortName = shortName; return this; }
        

        public Software build(OpenMINDSContext context) {
            Software.super.build(context);
            return Software.this;
        }
    }

    public static Software.Builder create(LocalId localId){
        return new Software(localId).new Builder();
    }

    public Software.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Software.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends SoftwareCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends SoftwareCustodian>> getCustodian() {
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
    private List<Reference<? extends SoftwareDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends SoftwareDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends SoftwareDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends SoftwareDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
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
    private List<Reference<SoftwareVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<SoftwareVersion>> getHasVersion() {
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

 

}