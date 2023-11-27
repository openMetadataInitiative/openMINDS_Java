package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.data.FilePathPattern;


import static org.openmetadatainitiative.openminds.v3.core.data.FileRepositoryStructure.SEMANTIC_NAME;
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

    public static Reference<FileRepositoryStructure> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private FileRepositoryStructure(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<FileRepositoryStructure>{
        
        public Builder filePathPattern(List<FilePathPattern> filePathPattern) { FileRepositoryStructure.this.filePathPattern = filePathPattern; return this; }
        
        public Builder lookupLabel(String lookupLabel) { FileRepositoryStructure.this.lookupLabel = lookupLabel; return this; }
        

        public FileRepositoryStructure build() {
            if (FileRepositoryStructure.this.id == null) {
                FileRepositoryStructure.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(FileRepositoryStructure.this.types == null || FileRepositoryStructure.this.types.isEmpty() || !FileRepositoryStructure.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = FileRepositoryStructure.this.types;
                FileRepositoryStructure.this.types = new ArrayList<>();
                FileRepositoryStructure.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    FileRepositoryStructure.this.types.addAll(oldValues);
                }
            }
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