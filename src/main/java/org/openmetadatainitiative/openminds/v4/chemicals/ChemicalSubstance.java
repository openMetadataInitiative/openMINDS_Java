package org.openmetadatainitiative.openminds.v4.chemicals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v4.chemicals.ProductSource;
import org.openmetadatainitiative.openminds.v4.chemicals.intf.ChemicalSubstancePurity;
import org.openmetadatainitiative.openminds.v4.controlledTerms.MolecularEntity;


import static org.openmetadatainitiative.openminds.v4.chemicals.ChemicalSubstance.SEMANTIC_NAME;
/**
 * Structured information about a chemical substance.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ChemicalSubstance extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.V4.Entity, org.openmetadatainitiative.openminds.v4.chemicals.intf.AmountOfChemicalChemicalProduct, org.openmetadatainitiative.openminds.v4.ephys.device.intf.ElectrodeArrayConductorMaterial, org.openmetadatainitiative.openminds.v4.ephys.device.intf.ElectrodeArrayInsulatorMaterial, org.openmetadatainitiative.openminds.v4.ephys.device.intf.PipetteUsageLabelingCompound, org.openmetadatainitiative.openminds.v4.ephys.device.intf.PipetteMaterial, org.openmetadatainitiative.openminds.v4.ephys.device.intf.ElectrodeConductorMaterial, org.openmetadatainitiative.openminds.v4.ephys.device.intf.ElectrodeInsulatorMaterial{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/ChemicalSubstance";

    @JsonIgnore
    public Reference<ChemicalSubstance> getReference() {
        return doGetReference();
    }

    public static Reference<ChemicalSubstance> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ChemicalSubstance() {
        this(null);
    }

    private ChemicalSubstance(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ChemicalSubstance>{
        public Builder additionalRemarks(String additionalRemarks) { ChemicalSubstance.this.additionalRemarks = additionalRemarks; return this; }
        public Builder lookupLabel(String lookupLabel) { ChemicalSubstance.this.lookupLabel = lookupLabel; return this; }
        public Builder molecularEntity(Reference<MolecularEntity> molecularEntity) { ChemicalSubstance.this.molecularEntity = molecularEntity; return this; }
        public Builder productSource(Reference<ProductSource> productSource) { ChemicalSubstance.this.productSource = productSource; return this; }
        public Builder purity(Function<ChemicalSubstancePurity.EmbeddedBuilder, ChemicalSubstancePurity> purity) { ChemicalSubstance.this.purity = purity.apply(ChemicalSubstancePurity.createEmbedded()); return this; }
        

        public ChemicalSubstance build(OpenMINDSContext context) {
            ChemicalSubstance.super.build(context);
            return ChemicalSubstance.this;
        }
    }

    public static ChemicalSubstance.Builder create(LocalId localId){
        return new ChemicalSubstance(localId).new Builder();
    }

    public ChemicalSubstance.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ChemicalSubstance.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.om-i.org/props/additionalRemarks")
    private String additionalRemarks;
    
    /**
    * Mention of what deserves additional attention or notice.
    */
    public String getAdditionalRemarks() {
       return this.additionalRemarks;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/molecularEntity")
    private Reference<MolecularEntity> molecularEntity;
    
    public Reference<MolecularEntity> getMolecularEntity() {
       return this.molecularEntity;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/productSource")
    private Reference<ProductSource> productSource;
    
    public Reference<ProductSource> getProductSource() {
       return this.productSource;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/purity")
    private ChemicalSubstancePurity purity;
    
    public ChemicalSubstancePurity getPurity() {
       return this.purity;
    }

 

}