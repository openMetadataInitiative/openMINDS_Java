package org.openmetadatainitiative.openminds.v4.core.actors.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface AffiliationMemberOf extends Entity {
   Reference<? extends AffiliationMemberOf> getReference();

   class Deserializer extends ByTypeDeserializer<AffiliationMemberOf> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.actors.Consortium.class, org.openmetadatainitiative.openminds.v4.core.actors.Organization.class);
        }
    }
    
}