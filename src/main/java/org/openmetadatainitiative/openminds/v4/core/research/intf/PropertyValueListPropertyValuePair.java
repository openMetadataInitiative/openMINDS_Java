package org.openmetadatainitiative.openminds.v4.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface PropertyValueListPropertyValuePair extends Entity {
   Reference<? extends PropertyValueListPropertyValuePair> getReference();

   class Deserializer extends ByTypeDeserializer<PropertyValueListPropertyValuePair> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.research.NumericalProperty.class, org.openmetadatainitiative.openminds.v4.core.research.StringProperty.class);
        }
    }
    
    static PropertyValueListPropertyValuePair.EmbeddedBuilder createEmbedded(){
        return new EmbeddedBuilder();
    }

    class EmbeddedBuilder {
        
        public org.openmetadatainitiative.openminds.v4.core.research.NumericalProperty.EmbeddedBuilder numericalProperty(){
            return org.openmetadatainitiative.openminds.v4.core.research.NumericalProperty.createEmbedded();
        }
        
        public org.openmetadatainitiative.openminds.v4.core.research.StringProperty.EmbeddedBuilder stringProperty(){
            return org.openmetadatainitiative.openminds.v4.core.research.StringProperty.createEmbedded();
        }
        

    }
    
}