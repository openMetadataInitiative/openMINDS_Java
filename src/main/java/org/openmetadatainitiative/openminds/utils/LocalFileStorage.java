package org.openmetadatainitiative.openminds.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class LocalFileStorage implements PostProcessor{

    private final String targetDirectory;

    public LocalFileStorage(String targetDirectory) {
        this.targetDirectory = targetDirectory;
    }

    @Override
    public void process(Stream<? extends Instance> instances) {
        File dir = new File(targetDirectory);
        if(!dir.exists()){
            dir.mkdirs();
        }
        instances.forEach(i -> {
            File f = new File(targetDirectory+File.separator+i.getLocalId().id()+".jsonld");
            try {
                ParsingUtils.OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValue(f, i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
