package org.openmetadatainitiative.openminds.v3.publications.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface ScholarlyArticleAuthor extends Entity {
   Reference<? extends ScholarlyArticleAuthor> getReference();

   class Deserializer extends ByTypeDeserializer<ScholarlyArticleAuthor> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.actors.Consortium.class, org.openmetadatainitiative.openminds.v3.core.actors.Organization.class, org.openmetadatainitiative.openminds.v3.core.actors.Person.class);
        }
    }
    
}