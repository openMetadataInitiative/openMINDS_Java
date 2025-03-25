package org.openmetadatainitiative.openminds.v4.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v4.controlledTerms.FileRepositoryType;
import org.openmetadatainitiative.openminds.v4.core.actors.Organization;
import org.openmetadatainitiative.openminds.v4.core.data.ContentType;
import org.openmetadatainitiative.openminds.v4.core.data.ContentTypePattern;
import org.openmetadatainitiative.openminds.v4.core.data.FileRepositoryStructure;
import org.openmetadatainitiative.openminds.v4.core.data.Hash;
import org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v4.core.data.FileRepository.SEMANTIC_NAME;
/**
 * Structured information on a file repository.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class FileRepository extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V4.Entity, org.openmetadatainitiative.openminds.v4.core.data.intf.FileBundleIsPartOf{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/FileRepository";

    @JsonIgnore
    public Reference<FileRepository> getReference() {
        return doGetReference();
    }

    public static Reference<FileRepository> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private FileRepository() {
        this(null);
    }

    private FileRepository(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<FileRepository>{
        public Builder IRI(String IRI) { FileRepository.this.IRI = IRI; return this; }
        public Builder contentTypePattern(List<Reference<ContentTypePattern>> contentTypePattern) { FileRepository.this.contentTypePattern = contentTypePattern; return this; }
        public Builder format(Reference<ContentType> format) { FileRepository.this.format = format; return this; }
        public Builder hash(Function<Hash.EmbeddedBuilder, Hash> hash) { FileRepository.this.hash = hash.apply(Hash.createEmbedded()); return this; }
        public Builder hostedBy(Reference<Organization> hostedBy) { FileRepository.this.hostedBy = hostedBy; return this; }
        public Builder name(String name) { FileRepository.this.name = name; return this; }
        public Builder storageSize(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> storageSize) { FileRepository.this.storageSize = storageSize.apply(QuantitativeValue.createEmbedded()); return this; }
        public Builder structurePattern(Reference<FileRepositoryStructure> structurePattern) { FileRepository.this.structurePattern = structurePattern; return this; }
        public Builder type(Reference<FileRepositoryType> type) { FileRepository.this.type = type; return this; }
        

        public FileRepository build(OpenMINDSContext context) {
            FileRepository.super.build(context);
            return FileRepository.this;
        }
    }

    public static FileRepository.Builder create(LocalId localId){
        return new FileRepository(localId).new Builder();
    }

    public FileRepository.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, FileRepository.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/contentTypePattern")
    private List<Reference<ContentTypePattern>> contentTypePattern;
    
    public List<Reference<ContentTypePattern>> getContentTypePattern() {
       return this.contentTypePattern;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/format")
    private Reference<ContentType> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public Reference<ContentType> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/hash")
    private Hash hash;
    
    /**
    * Term used for the process of converting any data into a single value. Often also directly refers to the resulting single value.
    */
    public Hash getHash() {
       return this.hash;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/hostedBy")
    private Reference<Organization> hostedBy;
    
    /**
    * Reference to an organization that provides facilities and services for something.
    */
    public Reference<Organization> getHostedBy() {
       return this.hostedBy;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/storageSize")
    private QuantitativeValue storageSize;
    
    /**
    * Quantitative value defining how much disk space is used by an object on a computer system.
    */
    public QuantitativeValue getStorageSize() {
       return this.storageSize;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/structurePattern")
    private Reference<FileRepositoryStructure> structurePattern;
    
    public Reference<FileRepositoryStructure> getStructurePattern() {
       return this.structurePattern;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/type")
    private Reference<FileRepositoryType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<FileRepositoryType> getType() {
       return this.type;
    }

 

}