package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface DataAnalysisWasInformedBy extends Entity {
   Reference<? extends DataAnalysisWasInformedBy> getReference();

   class Deserializer extends ByTypeDeserializer<DataAnalysisWasInformedBy> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.computation.DataAnalysis.class, org.openmetadatainitiative.openminds.latest.computation.DataCopy.class, org.openmetadatainitiative.openminds.latest.computation.GenericComputation.class, org.openmetadatainitiative.openminds.latest.computation.ModelValidation.class, org.openmetadatainitiative.openminds.latest.computation.Optimization.class, org.openmetadatainitiative.openminds.latest.computation.Simulation.class, org.openmetadatainitiative.openminds.latest.computation.Visualization.class);
        }
    }
    
}