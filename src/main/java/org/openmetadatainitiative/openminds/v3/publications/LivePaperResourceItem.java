package org.openmetadatainitiative.openminds.v3.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.actors.Organization;
import org.openmetadatainitiative.openminds.v3.publications.LivePaperSection;


import static org.openmetadatainitiative.openminds.v3.publications.LivePaperResourceItem.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LivePaperResourceItem extends Instance implements org.openmetadatainitiative.openminds.v3.core.data.intf.ServiceLinkDataLocation{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/LivePaperResourceItem";

    @JsonIgnore
    public Reference<LivePaperResourceItem> getReference() {
        return doGetReference();
    }

    public static Reference<LivePaperResourceItem> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private LivePaperResourceItem(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LivePaperResourceItem>{
        
        public Builder IRI(String IRI) { LivePaperResourceItem.this.IRI = IRI; return this; }
        
        public Builder hostedBy(Reference<Organization> hostedBy) { LivePaperResourceItem.this.hostedBy = hostedBy; return this; }
        
        public Builder isPartOf(Reference<LivePaperSection> isPartOf) { LivePaperResourceItem.this.isPartOf = isPartOf; return this; }
        
        public Builder name(String name) { LivePaperResourceItem.this.name = name; return this; }
        

        public LivePaperResourceItem build() {
            if (LivePaperResourceItem.this.id == null) {
                LivePaperResourceItem.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(LivePaperResourceItem.this.types == null || LivePaperResourceItem.this.types.isEmpty() || !LivePaperResourceItem.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = LivePaperResourceItem.this.types;
                LivePaperResourceItem.this.types = new ArrayList<>();
                LivePaperResourceItem.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    LivePaperResourceItem.this.types.addAll(oldValues);
                }
            }
            return LivePaperResourceItem.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/IRI")
    private String IRI;
    
    /**
    * Stands for Internationalized Resource Identifier which is an internet protocol standard that builds on the URI protocol, extending the set of permitted characters to include Unicode/ISO 10646.
    */
    public String getIRI() {
       return this.IRI;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hostedBy")
    private Reference<Organization> hostedBy;
    
    /**
    * Reference to an organization that provides facilities and services for something.
    */
    public Reference<Organization> getHostedBy() {
       return this.hostedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<LivePaperSection> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<LivePaperSection> getIsPartOf() {
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

 
    public static LivePaperResourceItem.Builder create(LocalId localId){
        return new LivePaperResourceItem(localId).new Builder();
    }

    public LivePaperResourceItem.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LivePaperResourceItem.class).new Builder();
    }
}