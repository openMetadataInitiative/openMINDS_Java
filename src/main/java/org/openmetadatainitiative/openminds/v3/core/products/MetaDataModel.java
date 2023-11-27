package org.openmetadatainitiative.openminds.v3.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.products.MetaDataModelVersion;
import org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelCustodian;
import org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelDeveloper;
import org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelDigitalIdentifier;


import static org.openmetadatainitiative.openminds.v3.core.products.MetaDataModel.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaDataModel extends Instance implements org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/MetaDataModel";

    @JsonIgnore
    public Reference<MetaDataModel> getReference() {
        return doGetReference();
    }

    public static Reference<MetaDataModel> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private MetaDataModel(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<MetaDataModel>{
        
        public Builder custodian(List<Reference<? extends MetaDataModelCustodian>> custodian) { MetaDataModel.this.custodian = custodian; return this; }
        
        public Builder description(String description) { MetaDataModel.this.description = description; return this; }
        
        public Builder developer(List<Reference<? extends MetaDataModelDeveloper>> developer) { MetaDataModel.this.developer = developer; return this; }
        
        public Builder digitalIdentifier(Reference<? extends MetaDataModelDigitalIdentifier> digitalIdentifier) { MetaDataModel.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullName(String fullName) { MetaDataModel.this.fullName = fullName; return this; }
        
        public Builder hasVersion(List<Reference<MetaDataModelVersion>> hasVersion) { MetaDataModel.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { MetaDataModel.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { MetaDataModel.this.howToCite = howToCite; return this; }
        
        public Builder shortName(String shortName) { MetaDataModel.this.shortName = shortName; return this; }
        

        public MetaDataModel build() {
            if (MetaDataModel.this.id == null) {
                MetaDataModel.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(MetaDataModel.this.types == null || MetaDataModel.this.types.isEmpty() || !MetaDataModel.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = MetaDataModel.this.types;
                MetaDataModel.this.types = new ArrayList<>();
                MetaDataModel.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    MetaDataModel.this.types.addAll(oldValues);
                }
            }
            return MetaDataModel.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends MetaDataModelCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends MetaDataModelCustodian>> getCustodian() {
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
    private List<Reference<? extends MetaDataModelDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends MetaDataModelDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends MetaDataModelDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends MetaDataModelDigitalIdentifier> getDigitalIdentifier() {
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
    private List<Reference<MetaDataModelVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<MetaDataModelVersion>> getHasVersion() {
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

 
    public static MetaDataModel.Builder create(LocalId localId){
        return new MetaDataModel(localId).new Builder();
    }

    public MetaDataModel.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, MetaDataModel.class).new Builder();
    }
}