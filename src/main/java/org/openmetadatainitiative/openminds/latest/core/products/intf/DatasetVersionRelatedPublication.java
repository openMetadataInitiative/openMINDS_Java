package org.openmetadatainitiative.openminds.latest.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface DatasetVersionRelatedPublication extends Entity {
   Reference<? extends DatasetVersionRelatedPublication> getReference();

   class Deserializer extends ByTypeDeserializer<DatasetVersionRelatedPublication> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.HANDLE.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISBN.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISSN.class, org.openmetadatainitiative.openminds.latest.publications.Book.class, org.openmetadatainitiative.openminds.latest.publications.Chapter.class, org.openmetadatainitiative.openminds.latest.publications.ScholarlyArticle.class);
        }
    }
    
}