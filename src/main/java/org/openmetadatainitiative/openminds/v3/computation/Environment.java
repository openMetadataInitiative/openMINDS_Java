package org.openmetadatainitiative.openminds.v3.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.computation.HardwareSystem;
import org.openmetadatainitiative.openminds.v3.core.products.SoftwareVersion;
import org.openmetadatainitiative.openminds.v3.core.research.Configuration;


import static org.openmetadatainitiative.openminds.v3.computation.Environment.SEMANTIC_NAME;
/**
 * Structured information on the computer system or set of systems in which a computation is deployed and executed.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Environment extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationEnvironment, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationEnvironment, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyEnvironment, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationEnvironment, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationEnvironment, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisEnvironment, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationEnvironment{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/Environment";

    @JsonIgnore
    public Reference<Environment> getReference() {
        return doGetReference();
    }

    public static Reference<Environment> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Environment(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Environment>{
        
        public Builder configuration(Reference<Configuration> configuration) { Environment.this.configuration = configuration; return this; }
        
        public Builder description(String description) { Environment.this.description = description; return this; }
        
        public Builder hardware(Reference<HardwareSystem> hardware) { Environment.this.hardware = hardware; return this; }
        
        public Builder name(String name) { Environment.this.name = name; return this; }
        
        public Builder software(List<Reference<SoftwareVersion>> software) { Environment.this.software = software; return this; }
        

        public Environment build() {
            if (Environment.this.id == null) {
                Environment.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Environment.this.types == null || Environment.this.types.isEmpty() || !Environment.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Environment.this.types;
                Environment.this.types = new ArrayList<>();
                Environment.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Environment.this.types.addAll(oldValues);
                }
            }
            return Environment.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/configuration")
    private Reference<Configuration> configuration;
    
    public Reference<Configuration> getConfiguration() {
       return this.configuration;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hardware")
    private Reference<HardwareSystem> hardware;
    
    public Reference<HardwareSystem> getHardware() {
       return this.hardware;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/software")
    private List<Reference<SoftwareVersion>> software;
    
    public List<Reference<SoftwareVersion>> getSoftware() {
       return this.software;
    }

 
    public static Environment.Builder create(LocalId localId){
        return new Environment(localId).new Builder();
    }

    public Environment.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Environment.class).new Builder();
    }
}