package org.openmetadatainitiative.openminds.utils;

import java.util.List;
import java.util.stream.Stream;

public interface PostProcessor {

    void process(Stream<? extends Instance> instances);

}
