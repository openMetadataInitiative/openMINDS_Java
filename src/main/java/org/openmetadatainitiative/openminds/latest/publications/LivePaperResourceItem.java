package org.openmetadatainitiative.openminds.latest.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openmetadatainitiative.openminds.utils.*;
import java.util.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.publications.LivePaperSection;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperResourceItemHostedBy;


import static org.openmetadatainitiative.openminds.latest.publications.LivePaperResourceItem.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class LivePaperResourceItem extends Instance implements org.openmetadatainitiative.openminds.OpenMINDS.Latest.Entity, org.openmetadatainitiative.openminds.latest.core.data.intf.ServiceLinkDataLocation{
    public static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/LivePaperResourceItem";

    @JsonIgnore
    public Reference<LivePaperResourceItem> getReference() {
        return doGetReference();
    }

    public static Reference<LivePaperResourceItem> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    /** For deserialization **/
    private LivePaperResourceItem() {
        this(null);
    }

    private LivePaperResourceItem(LocalId localId ) {
        super(localId, SEMANTIC_NAME);
    }

    

    
    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LivePaperResourceItem>{
        public Builder IRI(String IRI) { LivePaperResourceItem.this.IRI = IRI; return this; }
        public Builder hostedBy(Reference<? extends LivePaperResourceItemHostedBy> hostedBy) { LivePaperResourceItem.this.hostedBy = hostedBy; return this; }
        public Builder isPartOf(Reference<LivePaperSection> isPartOf) { LivePaperResourceItem.this.isPartOf = isPartOf; return this; }
        public Builder name(String name) { LivePaperResourceItem.this.name = name; return this; }
        

        public LivePaperResourceItem build(OpenMINDSContext context) {
            LivePaperResourceItem.super.build(context);
            return LivePaperResourceItem.this;
        }
    }

    public static LivePaperResourceItem.Builder create(LocalId localId){
        return new LivePaperResourceItem(localId).new Builder();
    }

    public LivePaperResourceItem.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LivePaperResourceItem.class).new Builder();
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
    private Reference<? extends LivePaperResourceItemHostedBy> hostedBy;
    
    /**
    * Reference to an organization that provides facilities and services for something.
    */
    public Reference<? extends LivePaperResourceItemHostedBy> getHostedBy() {
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

 

}