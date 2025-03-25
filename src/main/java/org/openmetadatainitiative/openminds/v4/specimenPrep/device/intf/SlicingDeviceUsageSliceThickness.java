package org.openmetadatainitiative.openminds.v4.specimenPrep.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface SlicingDeviceUsageSliceThickness extends Entity {
   Reference<? extends SlicingDeviceUsageSliceThickness> getReference();

   class Deserializer extends ByTypeDeserializer<SlicingDeviceUsageSliceThickness> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
    
    static SlicingDeviceUsageSliceThickness.EmbeddedBuilder createEmbedded(){
        return new EmbeddedBuilder();
    }

    class EmbeddedBuilder {
        
        public org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValue.EmbeddedBuilder quantitativeValue(){
            return org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValue.createEmbedded();
        }
        
        public org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValueRange.EmbeddedBuilder quantitativeValueRange(){
            return org.openmetadatainitiative.openminds.v4.core.miscellaneous.QuantitativeValueRange.createEmbedded();
        }
        

    }
    
}