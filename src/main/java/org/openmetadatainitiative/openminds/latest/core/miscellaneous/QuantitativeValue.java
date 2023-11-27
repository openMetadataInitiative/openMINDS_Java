package org.openmetadatainitiative.openminds.latest.core.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.TypeOfUncertainty;
import org.openmetadatainitiative.openminds.latest.controlledTerms.UnitOfMeasurement;


import static org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue.SEMANTIC_NAME;
/**
 * Structured information on a quantitative value.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuantitativeValue extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationResourceUsage, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceRequiredTime, org.openmetadatainitiative.openminds.latest.chemicals.intf.ChemicalSubstancePurity, org.openmetadatainitiative.openminds.latest.chemicals.intf.ProductSourcePurity, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingBathTemperature, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayUsageContactResistances, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageContactResistance, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeIntrinsicResistance, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayIntrinsicResistance, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsagePipetteResistance, org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.QuantitativeRelationAssessmentQuantitativeOverlap, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectStateWeight, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateWeight, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateWeight, org.openmetadatainitiative.openminds.latest.core.research.intf.NumericalPropertyValue, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateWeight, org.openmetadatainitiative.openminds.latest.core.data.intf.MeasurementValue, org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingTemperature, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageSliceThickness, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageSlicingAngle{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/QuantitativeValue";

    @JsonIgnore
    public Reference<QuantitativeValue> getReference() {
        return doGetReference();
    }

    public static Reference<QuantitativeValue> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private QuantitativeValue(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<QuantitativeValue>{
        
        public Builder typeOfUncertainty(Reference<TypeOfUncertainty> typeOfUncertainty) { QuantitativeValue.this.typeOfUncertainty = typeOfUncertainty; return this; }
        
        public Builder uncertainty(Object uncertainty) { QuantitativeValue.this.uncertainty = uncertainty; return this; }
        
        public Builder unit(Reference<UnitOfMeasurement> unit) { QuantitativeValue.this.unit = unit; return this; }
        
        public Builder value(Object value) { QuantitativeValue.this.value = value; return this; }
        

        public QuantitativeValue build(OpenMINDSContext context) {
            if (QuantitativeValue.this.id == null) {
                QuantitativeValue.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            QuantitativeValue.this.atType = SEMANTIC_NAME;
            return QuantitativeValue.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/typeOfUncertainty")
    private Reference<TypeOfUncertainty> typeOfUncertainty;
    
    /**
    * Distinct technique used to quantify the uncertainty of a measurement.
    */
    public Reference<TypeOfUncertainty> getTypeOfUncertainty() {
       return this.typeOfUncertainty;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/uncertainty")
    private Object uncertainty;
    
    /**
    * Quantitative value range defining the uncertainty of a measurement.
    */
    public Object getUncertainty() {
       return this.uncertainty;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/unit")
    private Reference<UnitOfMeasurement> unit;
    
    /**
    * Determinate quantity adopted as a standard of measurement.
    */
    public Reference<UnitOfMeasurement> getUnit() {
       return this.unit;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/value")
    private Object value;
    
    /**
    * Entry for a property.
    */
    public Object getValue() {
       return this.value;
    }

 
    public static QuantitativeValue.Builder create(LocalId localId){
        return new QuantitativeValue(localId).new Builder();
    }

    public QuantitativeValue.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, QuantitativeValue.class).new Builder();
    }
}