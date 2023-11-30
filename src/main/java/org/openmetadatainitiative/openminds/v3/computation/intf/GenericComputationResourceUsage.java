package org.openmetadatainitiative.openminds.v3.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface GenericComputationResourceUsage extends Entity {
   Reference<? extends GenericComputationResourceUsage> getReference();

   class Deserializer extends ByTypeDeserializer<GenericComputationResourceUsage> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
    
    static GenericComputationResourceUsage.EmbeddedBuilder createEmbedded(){
        return new EmbeddedBuilder();
    }

    class EmbeddedBuilder {
        
        public org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue.EmbeddedBuilder quantitativeValue(){
            return org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue.createEmbedded();
        }
        
        public org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValueRange.EmbeddedBuilder quantitativeValueRange(){
            return org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValueRange.createEmbedded();
        }
        

    }
    
}