package org.openmetadatainitiative.openminds.latest.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.data.ContentType;
import org.openmetadatainitiative.openminds.latest.core.data.File;


import static org.openmetadatainitiative.openminds.latest.core.data.FileArchive.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileArchive extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.SimulationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisOutput, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationOutput, org.openmetadatainitiative.openminds.latest.core.data.intf.ServiceLinkDataLocation{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/FileArchive";

    @JsonIgnore
    public Reference<FileArchive> getReference() {
        return doGetReference();
    }

    public static Reference<FileArchive> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private FileArchive(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<FileArchive>{
        
        public Builder IRI(String IRI) { FileArchive.this.IRI = IRI; return this; }
        
        public Builder format(Reference<ContentType> format) { FileArchive.this.format = format; return this; }
        
        public Builder sourceData(List<Reference<File>> sourceData) { FileArchive.this.sourceData = sourceData; return this; }
        

        public FileArchive build() {
            if (FileArchive.this.id == null) {
                FileArchive.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(FileArchive.this.types == null || FileArchive.this.types.isEmpty() || !FileArchive.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = FileArchive.this.types;
                FileArchive.this.types = new ArrayList<>();
                FileArchive.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    FileArchive.this.types.addAll(oldValues);
                }
            }
            return FileArchive.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/format")
    private Reference<ContentType> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public Reference<ContentType> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/sourceData")
    private List<Reference<File>> sourceData;
    
    public List<Reference<File>> getSourceData() {
       return this.sourceData;
    }

 
    public static FileArchive.Builder create(LocalId localId){
        return new FileArchive(localId).new Builder();
    }

    public FileArchive.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, FileArchive.class).new Builder();
    }
}