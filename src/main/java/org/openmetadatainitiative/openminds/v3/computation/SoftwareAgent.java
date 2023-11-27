package org.openmetadatainitiative.openminds.v3.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.computation.Environment;
import org.openmetadatainitiative.openminds.v3.core.products.SoftwareVersion;


import static org.openmetadatainitiative.openminds.v3.computation.SoftwareAgent.SEMANTIC_NAME;
/**
 * Structured information about a piece of software or web service that can perform a task autonomously.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SoftwareAgent extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisStartedBy, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationPerformedBy, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationStartedBy, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.ElectrodePlacementPerformedBy, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingPerformedBy, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.RecordingActivityPerformedBy, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionPerformedBy, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.CranialWindowPreparationPerformedBy, org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityPerformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/SoftwareAgent";

    @JsonIgnore
    public Reference<SoftwareAgent> getReference() {
        return doGetReference();
    }

    public static Reference<SoftwareAgent> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private SoftwareAgent(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SoftwareAgent>{
        
        public Builder environment(Reference<Environment> environment) { SoftwareAgent.this.environment = environment; return this; }
        
        public Builder name(String name) { SoftwareAgent.this.name = name; return this; }
        
        public Builder software(Reference<SoftwareVersion> software) { SoftwareAgent.this.software = software; return this; }
        

        public SoftwareAgent build(OpenMINDSContext context) {
            if (SoftwareAgent.this.id == null) {
                SoftwareAgent.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), openMINDSContext.idPrefix());
            }
            SoftwareAgent.this.type = SEMANTIC_NAME;
            return SoftwareAgent.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/environment")
    private Reference<Environment> environment;
    
    public Reference<Environment> getEnvironment() {
       return this.environment;
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
    private Reference<SoftwareVersion> software;
    
    public Reference<SoftwareVersion> getSoftware() {
       return this.software;
    }

 
    public static SoftwareAgent.Builder create(LocalId localId){
        return new SoftwareAgent(localId).new Builder();
    }

    public SoftwareAgent.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SoftwareAgent.class).new Builder();
    }
}