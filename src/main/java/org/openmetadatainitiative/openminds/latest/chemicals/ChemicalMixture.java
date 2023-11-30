package org.openmetadatainitiative.openminds.latest.chemicals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.chemicals.AmountOfChemical;
import org.openmetadatainitiative.openminds.latest.chemicals.ProductSource;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ChemicalMixtureType;


import static org.openmetadatainitiative.openminds.latest.chemicals.ChemicalMixture.SEMANTIC_NAME;
/**
 * Structured information about a mixture of chemical substances.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ChemicalMixture extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.chemicals.intf.AmountOfChemicalChemicalProduct, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeConductorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeInsulatorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayConductorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayInsulatorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageLabelingCompound, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteMaterial{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/chemicals/ChemicalMixture";

    @JsonIgnore
    public Reference<ChemicalMixture> getReference() {
        return doGetReference();
    }

    public static Reference<ChemicalMixture> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ChemicalMixture() {
        this(null);
    }

    private ChemicalMixture(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ChemicalMixture>{
        public Builder additionalRemarks(String additionalRemarks) { ChemicalMixture.this.additionalRemarks = additionalRemarks; return this; }
        public Builder hasPart(List<Function<AmountOfChemical.EmbeddedBuilder, AmountOfChemical>> hasPart) { ChemicalMixture.this.hasPart = hasPart.stream().map(b -> b.apply(AmountOfChemical.createEmbedded())).toList(); return this; }
        public Builder name(String name) { ChemicalMixture.this.name = name; return this; }
        public Builder productSource(Reference<ProductSource> productSource) { ChemicalMixture.this.productSource = productSource; return this; }
        public Builder type(Reference<ChemicalMixtureType> type) { ChemicalMixture.this.type = type; return this; }
        

        public ChemicalMixture build(OpenMINDSContext context) {
            ChemicalMixture.super.build(context);
            return ChemicalMixture.this;
        }
    }

    public static ChemicalMixture.Builder create(LocalId localId){
        return new ChemicalMixture(localId).new Builder();
    }

    public ChemicalMixture.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ChemicalMixture.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/additionalRemarks")
    private String additionalRemarks;
    
    /**
    * Mention of what deserves additional attention or notice.
    */
    public String getAdditionalRemarks() {
       return this.additionalRemarks;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasPart")
    private List<AmountOfChemical> hasPart;
    
    public List<AmountOfChemical> getHasPart() {
       return this.hasPart;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/productSource")
    private Reference<ProductSource> productSource;
    
    public Reference<ProductSource> getProductSource() {
       return this.productSource;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<ChemicalMixtureType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<ChemicalMixtureType> getType() {
       return this.type;
    }

 

}