package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISBN.SEMANTIC_NAME;
/**
 * An International Standard Book Number of the International ISBN Agency.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class ISBN extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.ChapterCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.BookCitedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.BookDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionDigitalIdentifier, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionRelatedPublication{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ISBN";

    @JsonIgnore
    public Reference<ISBN> getReference() {
        return doGetReference();
    }

    public static Reference<ISBN> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private ISBN() {
        this(null);
    }

    private ISBN(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ISBN>{
        public Builder identifier(String identifier) { ISBN.this.identifier = identifier; return this; }
        

        public ISBN build(OpenMINDSContext context) {
            ISBN.super.build(context);
            return ISBN.this;
        }
    }

    public static ISBN.Builder create(LocalId localId){
        return new ISBN(localId).new Builder();
    }

    public ISBN.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ISBN.class).new Builder();
    }
    

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

 

}