package org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface CranialWindowPreparationDimension extends Entity {
   Reference<? extends CranialWindowPreparationDimension> getReference();

   class Deserializer extends ByTypeDeserializer<CranialWindowPreparationDimension> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Circle.class, org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Ellipse.class, org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Rectangle.class);
        }
    }
    
    static CranialWindowPreparationDimension.EmbeddedBuilder createEmbedded(){
        return new EmbeddedBuilder();
    }

    class EmbeddedBuilder {
        
        public org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Circle.EmbeddedBuilder circle(){
            return org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Circle.createEmbedded();
        }
        
        public org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Ellipse.EmbeddedBuilder ellipse(){
            return org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Ellipse.createEmbedded();
        }
        
        public org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Rectangle.EmbeddedBuilder rectangle(){
            return org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Rectangle.createEmbedded();
        }
        

    }
    
}