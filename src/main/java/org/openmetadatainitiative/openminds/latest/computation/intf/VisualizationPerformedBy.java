package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface VisualizationPerformedBy extends Entity {
   Reference<? extends VisualizationPerformedBy> getReference();

   class Deserializer extends ByTypeDeserializer<VisualizationPerformedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.computation.SoftwareAgent.class, org.openmetadatainitiative.openminds.latest.core.actors.Person.class);
        }
    }
}