package org.openmetadatainitiative.openminds.latest.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ElectrodeOwner extends Entity {
   Reference<? extends ElectrodeOwner> getReference();

   class Deserializer extends ByTypeDeserializer<ElectrodeOwner> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.actors.Consortium.class, org.openmetadatainitiative.openminds.latest.core.actors.Organization.class, org.openmetadatainitiative.openminds.latest.core.actors.Person.class);
        }
    }
    
}