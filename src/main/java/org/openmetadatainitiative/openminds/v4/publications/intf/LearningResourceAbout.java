package org.openmetadatainitiative.openminds.v4.publications.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface LearningResourceAbout extends Entity {
   Reference<? extends LearningResourceAbout> getReference();

   class Deserializer extends ByTypeDeserializer<LearningResourceAbout> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.computation.ValidationTest.class, org.openmetadatainitiative.openminds.v4.computation.ValidationTestVersion.class, org.openmetadatainitiative.openminds.v4.computation.WorkflowRecipe.class, org.openmetadatainitiative.openminds.v4.computation.WorkflowRecipeVersion.class, org.openmetadatainitiative.openminds.v4.core.products.Dataset.class, org.openmetadatainitiative.openminds.v4.core.products.DatasetVersion.class, org.openmetadatainitiative.openminds.v4.core.products.MetaDataModel.class, org.openmetadatainitiative.openminds.v4.core.products.MetaDataModelVersion.class, org.openmetadatainitiative.openminds.v4.core.products.Model.class, org.openmetadatainitiative.openminds.v4.core.products.ModelVersion.class, org.openmetadatainitiative.openminds.v4.core.products.Software.class, org.openmetadatainitiative.openminds.v4.core.products.SoftwareVersion.class, org.openmetadatainitiative.openminds.v4.core.products.WebService.class, org.openmetadatainitiative.openminds.v4.core.products.WebServiceVersion.class, org.openmetadatainitiative.openminds.v4.publications.LivePaper.class, org.openmetadatainitiative.openminds.v4.publications.LivePaperVersion.class, org.openmetadatainitiative.openminds.v4.SANDS.atlas.BrainAtlas.class, org.openmetadatainitiative.openminds.v4.SANDS.atlas.BrainAtlasVersion.class, org.openmetadatainitiative.openminds.v4.SANDS.atlas.CommonCoordinateSpace.class, org.openmetadatainitiative.openminds.v4.SANDS.atlas.CommonCoordinateSpaceVersion.class);
        }
    }
    
}