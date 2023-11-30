package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface DataAnalysisEnvironment extends Entity {
   Reference<? extends DataAnalysisEnvironment> getReference();

   class Deserializer extends ByTypeDeserializer<DataAnalysisEnvironment> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.computation.Environment.class, org.openmetadatainitiative.openminds.latest.core.products.WebServiceVersion.class);
        }
    }
    
}