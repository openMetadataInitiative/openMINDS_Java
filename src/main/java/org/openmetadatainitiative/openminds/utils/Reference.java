package org.openmetadatainitiative.openminds.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Reference<T extends Instance>(@JsonProperty("@id") InstanceId id){

    public static <T extends Instance> Reference<T> create(T instance){
        return instance != null ? new Reference<T>(instance.getId()) : null;
    }

}
