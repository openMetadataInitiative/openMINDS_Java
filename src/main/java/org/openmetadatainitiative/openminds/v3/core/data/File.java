package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.DataType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.FileUsageRole;
import org.openmetadatainitiative.openminds.v3.core.data.ContentType;
import org.openmetadatainitiative.openminds.v3.core.data.FileBundle;
import org.openmetadatainitiative.openminds.v3.core.data.FileRepository;
import org.openmetadatainitiative.openminds.v3.core.data.Hash;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.core.data.File.SEMANTIC_NAME;
/**
 * Structured information on a file instance that is accessible via a URL.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class File extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V3.Entity, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionHasPart, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationInput, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationOutput, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationInput, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationOutput, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyInput, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyOutput, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationInput, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationOutput, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationInput, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationOutput, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionConfiguration, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionConfiguration, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionReferenceData, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisInput, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisOutput, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationInput, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationOutput, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityOutput, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageMetadataLocation, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeUsageMetadataLocation, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteUsageMetadataLocation, org.openmetadatainitiative.openminds.v3.ephys.entity.intf.RecordingDataLocation, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnnotationSpecification, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionOutput, org.openmetadatainitiative.openminds.v3.core.research.intf.BehavioralProtocolDescribedIn, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolDescribedIn, org.openmetadatainitiative.openminds.v3.core.research.intf.CustomPropertySetDataLocation, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionInputData, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionOutputData, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionFullDocumentation, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.v3.core.data.intf.ServiceLinkDataLocation, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceUsageMetadataLocation{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/File";

    @JsonIgnore
    public Reference<File> getReference() {
        return doGetReference();
    }

    public static Reference<File> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private File() {
        this(null);
    }

    private File(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<File>{
        public Builder IRI(String IRI) { File.this.IRI = IRI; return this; }
        public Builder contentDescription(String contentDescription) { File.this.contentDescription = contentDescription; return this; }
        public Builder dataType(List<Reference<DataType>> dataType) { File.this.dataType = dataType; return this; }
        public Builder fileRepository(Reference<FileRepository> fileRepository) { File.this.fileRepository = fileRepository; return this; }
        public Builder format(Reference<ContentType> format) { File.this.format = format; return this; }
        public Builder hash(List<Function<Hash.EmbeddedBuilder, Hash>> hash) { File.this.hash = hash.stream().map(b -> b.apply(Hash.createEmbedded())).toList(); return this; }
        public Builder isPartOf(List<Reference<FileBundle>> isPartOf) { File.this.isPartOf = isPartOf; return this; }
        public Builder name(String name) { File.this.name = name; return this; }
        public Builder specialUsageRole(Reference<FileUsageRole> specialUsageRole) { File.this.specialUsageRole = specialUsageRole; return this; }
        public Builder storageSize(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> storageSize) { File.this.storageSize = storageSize.apply(QuantitativeValue.createEmbedded()); return this; }
        

        public File build(OpenMINDSContext context) {
            File.super.build(context);
            return File.this;
        }
    }

    public static File.Builder create(LocalId localId){
        return new File(localId).new Builder();
    }

    public File.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, File.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contentDescription")
    private String contentDescription;
    
    public String getContentDescription() {
       return this.contentDescription;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataType")
    private List<Reference<DataType>> dataType;
    
    public List<Reference<DataType>> getDataType() {
       return this.dataType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fileRepository")
    private Reference<FileRepository> fileRepository;
    
    public Reference<FileRepository> getFileRepository() {
       return this.fileRepository;
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
    private List<Hash> hash;
    
    /**
    * Term used for the process of converting any data into a single value. Often also directly refers to the resulting single value.
    */
    public List<Hash> getHash() {
       return this.hash;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private List<Reference<FileBundle>> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public List<Reference<FileBundle>> getIsPartOf() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/specialUsageRole")
    private Reference<FileUsageRole> specialUsageRole;
    
    /**
    * Particular function of something when it is used.
    */
    public Reference<FileUsageRole> getSpecialUsageRole() {
       return this.specialUsageRole;
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