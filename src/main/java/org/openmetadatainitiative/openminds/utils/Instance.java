package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Instance implements Entity{

    @JsonProperty("@id")
    private InstanceId id;

    @JsonProperty("@type")
    private final String atType;

    @JsonIgnore
    private final LocalId localId;

    public Instance(LocalId localId, String type) {
        this.localId = localId;
        this.atType = type;
    }


    @JsonIgnore
    public LocalId getLocalId() {
        return localId;
    }

    public InstanceId getId(){
        return id;
    }
    protected  <T extends Instance> Reference<T> doGetReference(){
        return new Reference<>(getId());
    }

    protected void build(OpenMINDSContext context){
        if (this.id == null) {
            this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
        }
    }

    public String getAtType() {
        return atType;
    }
}
