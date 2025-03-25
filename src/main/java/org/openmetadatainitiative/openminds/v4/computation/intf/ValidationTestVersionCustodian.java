package org.openmetadatainitiative.openminds.v4.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ValidationTestVersionCustodian extends Entity {
   Reference<? extends ValidationTestVersionCustodian> getReference();

   class Deserializer extends ByTypeDeserializer<ValidationTestVersionCustodian> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.actors.Consortium.class, org.openmetadatainitiative.openminds.v4.core.actors.Organization.class, org.openmetadatainitiative.openminds.v4.core.actors.Person.class);
        }
    }
    
}