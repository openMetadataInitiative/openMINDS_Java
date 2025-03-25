package org.openmetadatainitiative.openminds.v4.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface WorkflowExecutionConfiguration extends Entity {
   Reference<? extends WorkflowExecutionConfiguration> getReference();

   class Deserializer extends ByTypeDeserializer<WorkflowExecutionConfiguration> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.research.Configuration.class, org.openmetadatainitiative.openminds.v4.core.data.File.class);
        }
    }
    
}