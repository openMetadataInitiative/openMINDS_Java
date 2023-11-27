package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISSN.SEMANTIC_NAME;
/**
 * An International Standard Serial Number of the ISSN International Centre.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISSN extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionRelatedPublication{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ISSN";

    @JsonIgnore
    public Reference<ISSN> getReference() {
        return doGetReference();
    }

    public static Reference<ISSN> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ISSN(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ISSN>{
        
        public Builder identifier(String identifier) { ISSN.this.identifier = identifier; return this; }
        

        public ISSN build(OpenMINDSContext context) {
            if (ISSN.this.id == null) {
                ISSN.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            ISSN.this.atType = SEMANTIC_NAME;
            return ISSN.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

 
    public static ISSN.Builder create(LocalId localId){
        return new ISSN(localId).new Builder();
    }

    public ISSN.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ISSN.class).new Builder();
    }
}