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

import org.openmetadatainitiative.openminds.latest.chemicals.intf.AmountOfChemicalChemicalProduct;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.chemicals.AmountOfChemical.SEMANTIC_NAME;
/**
 * Structured information about the amount of a given chemical that was used.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class AmountOfChemical extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.om-i.org/types/AmountOfChemical";

    @JsonIgnore
    public Reference<AmountOfChemical> getReference() {
        return doGetReference();
    }

    public static Reference<AmountOfChemical> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private AmountOfChemical() {
        this(null);
    }

    private AmountOfChemical(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    
    public class EmbeddedBuilder {

        public EmbeddedBuilder amount(Function<QuantitativeValue.EmbeddedBuilder, QuantitativeValue> amount) { AmountOfChemical.this.amount = amount.apply(QuantitativeValue.createEmbedded()); return this; }
        public EmbeddedBuilder chemicalProduct(Reference<? extends AmountOfChemicalChemicalProduct> chemicalProduct) { AmountOfChemical.this.chemicalProduct = chemicalProduct; return this; }
        

        public AmountOfChemical build(){
            return AmountOfChemical.this;
        }
    }

    public static AmountOfChemical.EmbeddedBuilder createEmbedded(){
        return new AmountOfChemical(null).new EmbeddedBuilder();
    }
    

    

   @JsonProperty(value = "https://openminds.om-i.org/props/amount")
    private QuantitativeValue amount;
    
    public QuantitativeValue getAmount() {
       return this.amount;
    }

    @JsonProperty(value = "https://openminds.om-i.org/props/chemicalProduct")
    private Reference<? extends AmountOfChemicalChemicalProduct> chemicalProduct;
    
    public Reference<? extends AmountOfChemicalChemicalProduct> getChemicalProduct() {
       return this.chemicalProduct;
    }

 

}