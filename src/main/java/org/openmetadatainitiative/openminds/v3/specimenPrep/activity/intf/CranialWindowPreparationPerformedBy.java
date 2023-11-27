package org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface CranialWindowPreparationPerformedBy extends Entity {
   Reference<? extends CranialWindowPreparationPerformedBy> getReference();

   class Deserializer extends ByTypeDeserializer<CranialWindowPreparationPerformedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.computation.SoftwareAgent.class, org.openmetadatainitiative.openminds.v3.core.actors.Person.class);
        }
    }
}