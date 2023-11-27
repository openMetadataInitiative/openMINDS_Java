package org.openmetadatainitiative.openminds.utils;

public record OpenMINDSContext(String idPrefix, boolean autoAssignIdPrefix) {

    public static OpenMINDSContext defaultContext(){
        return local(true);
    }

    public static OpenMINDSContext local(boolean autoAssignIdPrefix){
        return new OpenMINDSContext("_:", autoAssignIdPrefix);
    }
}
