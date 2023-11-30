package org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface CustomAnnotationCoordinateSpace extends Entity {
   Reference<? extends CustomAnnotationCoordinateSpace> getReference();

   class Deserializer extends ByTypeDeserializer<CustomAnnotationCoordinateSpace> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpaceVersion.class, org.openmetadatainitiative.openminds.latest.SANDS.nonatlas.CustomCoordinateSpace.class);
        }
    }
    
}