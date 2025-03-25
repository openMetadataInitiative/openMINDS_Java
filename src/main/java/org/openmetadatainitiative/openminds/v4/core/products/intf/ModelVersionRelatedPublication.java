package org.openmetadatainitiative.openminds.v4.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ModelVersionRelatedPublication extends Entity {
   Reference<? extends ModelVersionRelatedPublication> getReference();

   class Deserializer extends ByTypeDeserializer<ModelVersionRelatedPublication> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.HANDLE.class, org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.ISBN.class, org.openmetadatainitiative.openminds.v4.core.digitalIdentifier.ISSN.class, org.openmetadatainitiative.openminds.v4.publications.Book.class, org.openmetadatainitiative.openminds.v4.publications.Chapter.class, org.openmetadatainitiative.openminds.v4.publications.ScholarlyArticle.class);
        }
    }
    
}