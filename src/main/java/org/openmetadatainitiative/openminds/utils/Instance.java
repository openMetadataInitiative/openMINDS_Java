package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Instance implements Entity{

    @JsonProperty("@id")
    protected InstanceId id;

    @JsonProperty("@type")
    protected List<String> types;

    @JsonIgnore
    private final LocalId localId;

    public Instance(LocalId localId) {
        this.localId = localId;
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
}
