package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.FileRepositoryType;
import org.openmetadatainitiative.openminds.v3.core.actors.Organization;
import org.openmetadatainitiative.openminds.v3.core.data.ContentType;
import org.openmetadatainitiative.openminds.v3.core.data.ContentTypePattern;
import org.openmetadatainitiative.openminds.v3.core.data.FileRepositoryStructure;
import org.openmetadatainitiative.openminds.v3.core.data.Hash;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.core.data.FileRepository.SEMANTIC_NAME;
/**
 * Structured information on a file repository.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileRepository extends Instance implements org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleIsPartOf{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/FileRepository";

    @JsonIgnore
    public Reference<FileRepository> getReference() {
        return doGetReference();
    }

    public static Reference<FileRepository> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private FileRepository(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<FileRepository>{
        
        public Builder IRI(String IRI) { FileRepository.this.IRI = IRI; return this; }
        
        public Builder contentTypePattern(List<Reference<ContentTypePattern>> contentTypePattern) { FileRepository.this.contentTypePattern = contentTypePattern; return this; }
        
        public Builder format(Reference<ContentType> format) { FileRepository.this.format = format; return this; }
        
        public Builder hash(Hash hash) { FileRepository.this.hash = hash; return this; }
        
        public Builder hostedBy(Reference<Organization> hostedBy) { FileRepository.this.hostedBy = hostedBy; return this; }
        
        public Builder name(String name) { FileRepository.this.name = name; return this; }
        
        public Builder storageSize(QuantitativeValue storageSize) { FileRepository.this.storageSize = storageSize; return this; }
        
        public Builder structurePattern(Reference<FileRepositoryStructure> structurePattern) { FileRepository.this.structurePattern = structurePattern; return this; }
        
        public Builder type(Reference<FileRepositoryType> type) { FileRepository.this.type = type; return this; }
        

        public FileRepository build(OpenMINDSContext context) {
            if (FileRepository.this.id == null) {
                FileRepository.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            FileRepository.this.type = SEMANTIC_NAME;
            return FileRepository.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contentTypePattern")
    private List<Reference<ContentTypePattern>> contentTypePattern;
    
    public List<Reference<ContentTypePattern>> getContentTypePattern() {
       return this.contentTypePattern;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/format")
    private Reference<ContentType> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public Reference<ContentType> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hash")
    private Hash hash;
    
    /**
    * Term used for the process of converting any data into a single value. Often also directly refers to the resulting single value.
    */
    public Hash getHash() {
       return this.hash;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hostedBy")
    private Reference<Organization> hostedBy;
    
    /**
    * Reference to an organization that provides facilities and services for something.
    */
    public Reference<Organization> getHostedBy() {
       return this.hostedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/storageSize")
    private QuantitativeValue storageSize;
    
    /**
    * Quantitative value defining how much disk space is used by an object on a computer system.
    */
    public QuantitativeValue getStorageSize() {
       return this.storageSize;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/structurePattern")
    private Reference<FileRepositoryStructure> structurePattern;
    
    public Reference<FileRepositoryStructure> getStructurePattern() {
       return this.structurePattern;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<FileRepositoryType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<FileRepositoryType> getType() {
       return this.type;
    }

 
    public static FileRepository.Builder create(LocalId localId){
        return new FileRepository(localId).new Builder();
    }

    public FileRepository.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, FileRepository.class).new Builder();
    }
}