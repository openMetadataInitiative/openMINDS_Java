package org.openmetadatainitiative.openminds.latest.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.data.FilePathPattern;


import static org.openmetadatainitiative.openminds.latest.core.data.FileRepositoryStructure.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileRepositoryStructure extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/FileRepositoryStructure";

    @JsonIgnore
    public Reference<FileRepositoryStructure> getReference() {
        return doGetReference();
    }

    public static Reference<FileRepositoryStructure> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private FileRepositoryStructure(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<FileRepositoryStructure>{
        
        public Builder filePathPattern(List<FilePathPattern> filePathPattern) { FileRepositoryStructure.this.filePathPattern = filePathPattern; return this; }
        
        public Builder lookupLabel(String lookupLabel) { FileRepositoryStructure.this.lookupLabel = lookupLabel; return this; }
        

        public FileRepositoryStructure build(OpenMINDSContext context) {
            if (FileRepositoryStructure.this.id == null) {
                FileRepositoryStructure.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            FileRepositoryStructure.this.type = SEMANTIC_NAME;
            return FileRepositoryStructure.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/filePathPattern")
    private List<FilePathPattern> filePathPattern;
    
    public List<FilePathPattern> getFilePathPattern() {
       return this.filePathPattern;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

 
    public static FileRepositoryStructure.Builder create(LocalId localId){
        return new FileRepositoryStructure(localId).new Builder();
    }

    public FileRepositoryStructure.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, FileRepositoryStructure.class).new Builder();
    }
}