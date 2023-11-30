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

import org.openmetadatainitiative.openminds.latest.chemicals.intf.ProductSourceProvider;
import org.openmetadatainitiative.openminds.latest.chemicals.intf.ProductSourcePurity;
import org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.RRID;


import static org.openmetadatainitiative.openminds.latest.chemicals.ProductSource.SEMANTIC_NAME;
/**
 * Structured information about the source of a chemical substance or mixture.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ProductSource extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/chemicals/ProductSource";

    @JsonIgnore
    public Reference<ProductSource> getReference() {
        return doGetReference();
    }

    public static Reference<ProductSource> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ProductSource() {
        this(null);
    }

    private ProductSource(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ProductSource>{
        public Builder digitalIdentifier(Reference<RRID> digitalIdentifier) { ProductSource.this.digitalIdentifier = digitalIdentifier; return this; }
        public Builder identifier(String identifier) { ProductSource.this.identifier = identifier; return this; }
        public Builder productName(String productName) { ProductSource.this.productName = productName; return this; }
        public Builder provider(Reference<? extends ProductSourceProvider> provider) { ProductSource.this.provider = provider; return this; }
        public Builder purity(Function<ProductSourcePurity.EmbeddedBuilder, ProductSourcePurity> purity) { ProductSource.this.purity = purity.apply(ProductSourcePurity.createEmbedded()); return this; }
        

        public ProductSource build(OpenMINDSContext context) {
            ProductSource.super.build(context);
            return ProductSource.this;
        }
    }

    public static ProductSource.Builder create(LocalId localId){
        return new ProductSource(localId).new Builder();
    }

    public ProductSource.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ProductSource.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<RRID> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<RRID> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/productName")
    private String productName;
    
    public String getProductName() {
       return this.productName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/provider")
    private Reference<? extends ProductSourceProvider> provider;
    
    public Reference<? extends ProductSourceProvider> getProvider() {
       return this.provider;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/purity")
    private ProductSourcePurity purity;
    
    public ProductSourcePurity getPurity() {
       return this.purity;
    }

 

}