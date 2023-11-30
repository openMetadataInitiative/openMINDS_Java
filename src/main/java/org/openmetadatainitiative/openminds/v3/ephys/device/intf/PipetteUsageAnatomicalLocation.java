package org.openmetadatainitiative.openminds.v3.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@SuppressWarnings("unused")
public interface PipetteUsageAnatomicalLocation extends Entity {
   Reference<? extends PipetteUsageAnatomicalLocation> getReference();

   class Deserializer extends ByTypeDeserializer<PipetteUsageAnatomicalLocation> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OrganismSubstance.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SubcellularEntity.class, org.openmetadatainitiative.openminds.v3.controlledTerms.UBERONParcellation.class, org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.CustomAnatomicalEntity.class, org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntity.class, org.openmetadatainitiative.openminds.v3.SANDS.atlas.ParcellationEntityVersion.class);
        }
    }
    
}