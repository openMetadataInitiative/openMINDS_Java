package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.*;
/**
 * Structured information about a digital object identifier, as standardized by the International Organization for Standardization.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DOI extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionReferenceData, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.BookCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.BookDigitalIdentifier, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeDigitalIdentifier, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayDigitalIdentifier, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.research.intf.BehavioralProtocolDescribedIn, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolDescribedIn, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionInputData, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionOutputData, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionFullDocumentation, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceDigitalIdentifier{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/DOI";

    @JsonIgnore
    public Reference<DOI> getReference() {
        return doGetReference();
    }

    public static Reference<DOI> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private DOI(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<DOI>{
        
        public Builder identifier(String identifier) { DOI.this.identifier = identifier; return this; }
        

        public DOI build() {
            if (DOI.this.id == null) {
                DOI.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(DOI.this.types == null || DOI.this.types.isEmpty() || !DOI.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = DOI.this.types;
                DOI.this.types = new ArrayList<>();
                DOI.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    DOI.this.types.addAll(oldValues);
                }
            }
            return DOI.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

 
    public static DOI.Builder create(LocalId localId){
        return new DOI(localId).new Builder();
    }

    public DOI.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, DOI.class).new Builder();
    }
}