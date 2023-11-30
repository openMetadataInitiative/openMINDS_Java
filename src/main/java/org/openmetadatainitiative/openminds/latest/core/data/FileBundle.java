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
import org.openmetadatainitiative.openminds.latest.core.data.ContentType;
import org.openmetadatainitiative.openminds.latest.core.data.Hash;
import org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy;
import org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleIsPartOf;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.core.data.FileBundle.SEMANTIC_NAME;
/**
 * Structured information on a bundle of file instances.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class FileBundle extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionHasPart, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationInput, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationInput, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyInput, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyOutput, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationInput, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationInput, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionReferenceData, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisInput, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisOutput, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationInput, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationOutput, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityOutput, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayUsageMetadataLocation, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageMetadataLocation, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageMetadataLocation, org.openmetadatainitiative.openminds.latest.ephys.entity.intf.RecordingDataLocation, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionOutput, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionInputData, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionOutputData, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.latest.core.data.intf.ServiceLinkDataLocation, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleIsPartOf, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageMetadataLocation{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/FileBundle";

    @JsonIgnore
    public Reference<FileBundle> getReference() {
        return doGetReference();
    }

    public static Reference<FileBundle> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private FileBundle() {
        this(null);
    }

    private FileBundle(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<FileBundle>{
        public Builder contentDescription(String contentDescription) { FileBundle.this.contentDescription = contentDescription; return this; }
        public Builder format(Reference<ContentType> format) { FileBundle.this.format = format; return this; }
        public Builder groupedBy(List<Reference<? extends FileBundleGroupedBy>> groupedBy) { FileBundle.this.groupedBy = groupedBy; return this; }
        public Builder groupingType(List<Reference<FileBundleGrouping>> groupingType) { FileBundle.this.groupingType = groupingType; return this; }
        public Builder hash(Function<Hash.EmbeddedBuilder, Hash> hash) { FileBundle.this.hash = hash.apply(Hash.createEmbedded()); return this; }
        public Builder isPartOf(Reference<? extends FileBundleIsPartOf> isPartOf) { FileBundle.this.isPartOf = isPartOf; return this; }
        public Builder name(String name) { FileBundle.this.name = name; return this; }
        public Builder storageSize(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> storageSize) { FileBundle.this.storageSize = storageSize.apply(QuantitativeValue.createEmbedded()); return this; }
        

        public FileBundle build(OpenMINDSContext context) {
            FileBundle.super.build(context);
            return FileBundle.this;
        }
    }

    public static FileBundle.Builder create(LocalId localId){
        return new FileBundle(localId).new Builder();
    }

    public FileBundle.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, FileBundle.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contentDescription")
    private String contentDescription;
    
    public String getContentDescription() {
       return this.contentDescription;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/format")
    private Reference<ContentType> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public Reference<ContentType> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/groupedBy")
    private List<Reference<? extends FileBundleGroupedBy>> groupedBy;
    
    /**
    * Reference to the aspect used to group something.
    */
    public List<Reference<? extends FileBundleGroupedBy>> getGroupedBy() {
       return this.groupedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/groupingType")
    private List<Reference<FileBundleGrouping>> groupingType;
    
    public List<Reference<FileBundleGrouping>> getGroupingType() {
       return this.groupingType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hash")
    private Hash hash;
    
    /**
    * Term used for the process of converting any data into a single value. Often also directly refers to the resulting single value.
    */
    public Hash getHash() {
       return this.hash;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<? extends FileBundleIsPartOf> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<? extends FileBundleIsPartOf> getIsPartOf() {
       return this.isPartOf;
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

 

}