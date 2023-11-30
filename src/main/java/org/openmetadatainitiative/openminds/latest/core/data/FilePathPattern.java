package org.openmetadatainitiative.openminds.latest.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.FileBundleGrouping;


import static org.openmetadatainitiative.openminds.latest.core.data.FilePathPattern.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class FilePathPattern extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/FilePathPattern";

    @JsonIgnore
    public Reference<FilePathPattern> getReference() {
        return doGetReference();
    }

    public static Reference<FilePathPattern> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private FilePathPattern() {
        this(null);
    }

    private FilePathPattern(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder groupingType(List<Reference<FileBundleGrouping>> groupingType) { FilePathPattern.this.groupingType = groupingType; return this; }
        public EmbeddedBuilder regex(String regex) { FilePathPattern.this.regex = regex; return this; }
        

        public FilePathPattern build(){
            return FilePathPattern.this;
        }
    }

    public static FilePathPattern.EmbeddedBuilder createEmbedded(){
        return new FilePathPattern(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/groupingType")
    private List<Reference<FileBundleGrouping>> groupingType;
    
    public List<Reference<FileBundleGrouping>> getGroupingType() {
       return this.groupingType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/regex")
    private String regex;
    
    public String getRegex() {
       return this.regex;
    }

 

}