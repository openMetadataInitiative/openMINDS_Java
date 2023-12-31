package org.openmetadatainitiative.openminds.latest.chemicals.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ProductSourcePurity extends Entity {
   Reference<? extends ProductSourcePurity> getReference();

   class Deserializer extends ByTypeDeserializer<ProductSourcePurity> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
    
    static ProductSourcePurity.EmbeddedBuilder createEmbedded(){
        return new EmbeddedBuilder();
    }

    class EmbeddedBuilder {
        
        public org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue.EmbeddedBuilder quantitativeValue(){
            return org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue.createEmbedded();
        }
        
        public org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValueRange.EmbeddedBuilder quantitativeValueRange(){
            return org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValueRange.createEmbedded();
        }
        

    }
    
}