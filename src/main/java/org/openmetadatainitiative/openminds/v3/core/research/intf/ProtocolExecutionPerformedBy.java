package org.openmetadatainitiative.openminds.v3.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ProtocolExecutionPerformedBy extends Entity {
   Reference<? extends ProtocolExecutionPerformedBy> getReference();

   class Deserializer extends ByTypeDeserializer<ProtocolExecutionPerformedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.computation.SoftwareAgent.class, org.openmetadatainitiative.openminds.v3.core.actors.Person.class);
        }
    }
    
}