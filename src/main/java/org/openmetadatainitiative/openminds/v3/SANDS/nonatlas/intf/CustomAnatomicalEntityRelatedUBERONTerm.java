package org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface CustomAnatomicalEntityRelatedUBERONTerm extends Entity {
   Reference<? extends CustomAnatomicalEntityRelatedUBERONTerm> getReference();

   class Deserializer extends ByTypeDeserializer<CustomAnatomicalEntityRelatedUBERONTerm> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.v3.controlledTerms.UBERONParcellation.class);
        }
    }
    
}