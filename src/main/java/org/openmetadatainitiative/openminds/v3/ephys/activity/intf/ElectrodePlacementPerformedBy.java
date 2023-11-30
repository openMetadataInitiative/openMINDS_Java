package org.openmetadatainitiative.openminds.v3.ephys.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ElectrodePlacementPerformedBy extends Entity {
   Reference<? extends ElectrodePlacementPerformedBy> getReference();

   class Deserializer extends ByTypeDeserializer<ElectrodePlacementPerformedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.computation.SoftwareAgent.class, org.openmetadatainitiative.openminds.v3.core.actors.Person.class);
        }
    }
    
}