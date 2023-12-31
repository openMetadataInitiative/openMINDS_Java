package org.openmetadatainitiative.openminds.v3.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetAuthor;
import org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetCustodian;
import org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetDigitalIdentifier;


import static org.openmetadatainitiative.openminds.v3.core.products.Dataset.SEMANTIC_NAME;
/**
 * Structured information on data originating from human/animal studies or simulations (concept level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class Dataset extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Dataset";

    @JsonIgnore
    public Reference<Dataset> getReference() {
        return doGetReference();
    }

    public static Reference<Dataset> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private Dataset() {
        this(null);
    }

    private Dataset(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Dataset>{
        public Builder author(List<Reference<? extends DatasetAuthor>> author) { Dataset.this.author = author; return this; }
        public Builder custodian(List<Reference<? extends DatasetCustodian>> custodian) { Dataset.this.custodian = custodian; return this; }
        public Builder description(String description) { Dataset.this.description = description; return this; }
        public Builder digitalIdentifier(Reference<? extends DatasetDigitalIdentifier> digitalIdentifier) { Dataset.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder fullName(String fullName) { Dataset.this.fullName = fullName; return this; }
        public Builder hasVersion(List<Reference<DatasetVersion>> hasVersion) { Dataset.this.hasVersion = hasVersion; return this; }
        public Builder homepage(String homepage) { Dataset.this.homepage = homepage; return this; }
        public Builder howToCite(String howToCite) { Dataset.this.howToCite = howToCite; return this; }
        public Builder shortName(String shortName) { Dataset.this.shortName = shortName; return this; }
        

        public Dataset build(OpenMINDSContext context) {
            Dataset.super.build(context);
            return Dataset.this;
        }
    }

    public static Dataset.Builder create(LocalId localId){
        return new Dataset(localId).new Builder();
    }

    public Dataset.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Dataset.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends DatasetAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends DatasetAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends DatasetCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends DatasetCustodian>> getCustodian() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends DatasetDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends DatasetDigitalIdentifier> getDigitalIdentifier() {
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
    private List<Reference<DatasetVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<DatasetVersion>> getHasVersion() {
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