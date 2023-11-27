package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntityVersion;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.ParcellationEntityRelatedUBERONTerm;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.ParcellationEntity.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParcellationEntity extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisStudyTarget, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.ElectrodePlacementStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityStudyTarget, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayUsageAnatomicalLocationOfArray, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayUsageAnatomicalLocationOfElectrodes, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageAnatomicalLocation, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageAnatomicalLocation, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.ParcellationEntityVersionHasParent, org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.QualitativeRelationAssessmentInRelationTo, org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.AnatomicalTargetPositionAnatomicalTarget, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionStudyTarget, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleAnatomicalLocation, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionAnatomicalLocation, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelStudyTarget, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionStudyTarget, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.CranialWindowPreparationStudyTarget, org.openmetadatainitiative.openminds.latest.stimulation.activity.intf.StimulationActivityStudyTarget{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/ParcellationEntity";

    @JsonIgnore
    public Reference<ParcellationEntity> getReference() {
        return doGetReference();
    }

    public static Reference<ParcellationEntity> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ParcellationEntity(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ParcellationEntity>{
        
        public Builder abbreviation(String abbreviation) { ParcellationEntity.this.abbreviation = abbreviation; return this; }
        
        public Builder alternateName(List<String> alternateName) { ParcellationEntity.this.alternateName = alternateName; return this; }
        
        public Builder definition(String definition) { ParcellationEntity.this.definition = definition; return this; }
        
        public Builder hasParent(List<Reference<ParcellationEntity>> hasParent) { ParcellationEntity.this.hasParent = hasParent; return this; }
        
        public Builder hasVersion(List<Reference<ParcellationEntityVersion>> hasVersion) { ParcellationEntity.this.hasVersion = hasVersion; return this; }
        
        public Builder lookupLabel(String lookupLabel) { ParcellationEntity.this.lookupLabel = lookupLabel; return this; }
        
        public Builder name(String name) { ParcellationEntity.this.name = name; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { ParcellationEntity.this.ontologyIdentifier = ontologyIdentifier; return this; }
        
        public Builder relatedUBERONTerm(Reference<? extends ParcellationEntityRelatedUBERONTerm> relatedUBERONTerm) { ParcellationEntity.this.relatedUBERONTerm = relatedUBERONTerm; return this; }
        

        public ParcellationEntity build() {
            if (ParcellationEntity.this.id == null) {
                ParcellationEntity.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ParcellationEntity.this.types == null || ParcellationEntity.this.types.isEmpty() || !ParcellationEntity.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ParcellationEntity.this.types;
                ParcellationEntity.this.types = new ArrayList<>();
                ParcellationEntity.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ParcellationEntity.this.types.addAll(oldValues);
                }
            }
            return ParcellationEntity.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abbreviation")
    private String abbreviation;
    
    public String getAbbreviation() {
       return this.abbreviation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/alternateName")
    private List<String> alternateName;
    
    public List<String> getAlternateName() {
       return this.alternateName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/definition")
    private String definition;
    
    /**
    * Short, but precise statement of the meaning of a word, word group, sign or a symbol.
    */
    public String getDefinition() {
       return this.definition;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasParent")
    private List<Reference<ParcellationEntity>> hasParent;
    
    /**
    * Reference to a parent object or legal person.
    */
    public List<Reference<ParcellationEntity>> getHasParent() {
       return this.hasParent;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasVersion")
    private List<Reference<ParcellationEntityVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<ParcellationEntityVersion>> getHasVersion() {
       return this.hasVersion;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private List<String> ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public List<String> getOntologyIdentifier() {
       return this.ontologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedUBERONTerm")
    private Reference<? extends ParcellationEntityRelatedUBERONTerm> relatedUBERONTerm;
    
    public Reference<? extends ParcellationEntityRelatedUBERONTerm> getRelatedUBERONTerm() {
       return this.relatedUBERONTerm;
    }

 
    public static ParcellationEntity.Builder create(LocalId localId){
        return new ParcellationEntity(localId).new Builder();
    }

    public ParcellationEntity.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ParcellationEntity.class).new Builder();
    }
}