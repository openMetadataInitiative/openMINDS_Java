package org.openmetadatainitiative.openminds.latest.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.Service;
import org.openmetadatainitiative.openminds.latest.core.data.File;
import org.openmetadatainitiative.openminds.latest.core.data.intf.ServiceLinkDataLocation;


import static org.openmetadatainitiative.openminds.latest.core.data.ServiceLink.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceLink extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ServiceLink";

    @JsonIgnore
    public Reference<ServiceLink> getReference() {
        return doGetReference();
    }

    public static Reference<ServiceLink> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ServiceLink(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ServiceLink>{
        
        public Builder dataLocation(Reference<? extends ServiceLinkDataLocation> dataLocation) { ServiceLink.this.dataLocation = dataLocation; return this; }
        
        public Builder displayLabel(String displayLabel) { ServiceLink.this.displayLabel = displayLabel; return this; }
        
        public Builder openDataIn(String openDataIn) { ServiceLink.this.openDataIn = openDataIn; return this; }
        
        public Builder previewImage(Reference<File> previewImage) { ServiceLink.this.previewImage = previewImage; return this; }
        
        public Builder service(Reference<Service> service) { ServiceLink.this.service = service; return this; }
        

        public ServiceLink build() {
            if (ServiceLink.this.id == null) {
                ServiceLink.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ServiceLink.this.types == null || ServiceLink.this.types.isEmpty() || !ServiceLink.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ServiceLink.this.types;
                ServiceLink.this.types = new ArrayList<>();
                ServiceLink.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ServiceLink.this.types.addAll(oldValues);
                }
            }
            return ServiceLink.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataLocation")
    private Reference<? extends ServiceLinkDataLocation> dataLocation;
    
    public Reference<? extends ServiceLinkDataLocation> getDataLocation() {
       return this.dataLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/displayLabel")
    private String displayLabel;
    
    public String getDisplayLabel() {
       return this.displayLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/openDataIn")
    private String openDataIn;
    
    public String getOpenDataIn() {
       return this.openDataIn;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/previewImage")
    private Reference<File> previewImage;
    
    public Reference<File> getPreviewImage() {
       return this.previewImage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/service")
    private Reference<Service> service;
    
    public Reference<Service> getService() {
       return this.service;
    }

 
    public static ServiceLink.Builder create(LocalId localId){
        return new ServiceLink(localId).new Builder();
    }

    public ServiceLink.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ServiceLink.class).new Builder();
    }
}