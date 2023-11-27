package org.openmetadatainitiative.openminds.latest.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.publications.LivePaperVersion;


import static org.openmetadatainitiative.openminds.latest.publications.LivePaperSection.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LivePaperSection extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/LivePaperSection";

    @JsonIgnore
    public Reference<LivePaperSection> getReference() {
        return doGetReference();
    }

    public static Reference<LivePaperSection> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private LivePaperSection(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LivePaperSection>{
        
        public Builder description(String description) { LivePaperSection.this.description = description; return this; }
        
        public Builder isPartOf(Reference<LivePaperVersion> isPartOf) { LivePaperSection.this.isPartOf = isPartOf; return this; }
        
        public Builder name(String name) { LivePaperSection.this.name = name; return this; }
        
        public Builder order(Object order) { LivePaperSection.this.order = order; return this; }
        
        public Builder type(String type) { LivePaperSection.this.type = type; return this; }
        

        public LivePaperSection build(OpenMINDSContext context) {
            if (LivePaperSection.this.id == null) {
                LivePaperSection.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            LivePaperSection.this.type = SEMANTIC_NAME;
            return LivePaperSection.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<LivePaperVersion> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<LivePaperVersion> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/order")
    private Object order;
    
    public Object getOrder() {
       return this.order;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private String type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public String getType() {
       return this.type;
    }

 
    public static LivePaperSection.Builder create(LocalId localId){
        return new LivePaperSection(localId).new Builder();
    }

    public LivePaperSection.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LivePaperSection.class).new Builder();
    }
}