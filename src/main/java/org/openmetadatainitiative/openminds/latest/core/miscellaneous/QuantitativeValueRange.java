package org.openmetadatainitiative.openminds.latest.core.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.UnitOfMeasurement;


import static org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValueRange.SEMANTIC_NAME;
/**
 * A representation of a range of quantitative values.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuantitativeValueRange extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisResourceUsage, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationResourceUsage, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceRequiredTime, org.openmetadatainitiative.openminds.latest.chemicals.intf.ChemicalSubstancePurity, org.openmetadatainitiative.openminds.latest.chemicals.intf.ProductSourcePurity, org.openmetadatainitiative.openminds.latest.ephys.activity.intf.CellPatchingBathTemperature, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayUsageContactResistances, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeUsageContactResistance, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeIntrinsicResistance, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayIntrinsicResistance, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsagePipetteResistance, org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.QuantitativeRelationAssessmentQuantitativeOverlap, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectStateWeight, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateWeight, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateWeight, org.openmetadatainitiative.openminds.latest.core.research.intf.NumericalPropertyValue, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateAge, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateRelativeTimeIndication, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateWeight, org.openmetadatainitiative.openminds.latest.core.data.intf.MeasurementValue, org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueSampleSlicingTemperature, org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceUsageSliceThickness{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/QuantitativeValueRange";

    @JsonIgnore
    public Reference<QuantitativeValueRange> getReference() {
        return doGetReference();
    }

    public static Reference<QuantitativeValueRange> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private QuantitativeValueRange(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<QuantitativeValueRange>{
        
        public Builder maxValue(Object maxValue) { QuantitativeValueRange.this.maxValue = maxValue; return this; }
        
        public Builder maxValueUnit(Reference<UnitOfMeasurement> maxValueUnit) { QuantitativeValueRange.this.maxValueUnit = maxValueUnit; return this; }
        
        public Builder minValue(Object minValue) { QuantitativeValueRange.this.minValue = minValue; return this; }
        
        public Builder minValueUnit(Reference<UnitOfMeasurement> minValueUnit) { QuantitativeValueRange.this.minValueUnit = minValueUnit; return this; }
        

        public QuantitativeValueRange build() {
            if (QuantitativeValueRange.this.id == null) {
                QuantitativeValueRange.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(QuantitativeValueRange.this.types == null || QuantitativeValueRange.this.types.isEmpty() || !QuantitativeValueRange.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = QuantitativeValueRange.this.types;
                QuantitativeValueRange.this.types = new ArrayList<>();
                QuantitativeValueRange.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    QuantitativeValueRange.this.types.addAll(oldValues);
                }
            }
            return QuantitativeValueRange.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/maxValue")
    private Object maxValue;
    
    /**
    * Greatest quantity attained or allowed.
    */
    public Object getMaxValue() {
       return this.maxValue;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/maxValueUnit")
    private Reference<UnitOfMeasurement> maxValueUnit;
    
    public Reference<UnitOfMeasurement> getMaxValueUnit() {
       return this.maxValueUnit;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/minValue")
    private Object minValue;
    
    /**
    * Smallest quantity attained or allowed.
    */
    public Object getMinValue() {
       return this.minValue;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/minValueUnit")
    private Reference<UnitOfMeasurement> minValueUnit;
    
    public Reference<UnitOfMeasurement> getMinValueUnit() {
       return this.minValueUnit;
    }

 
    public static QuantitativeValueRange.Builder create(LocalId localId){
        return new QuantitativeValueRange(localId).new Builder();
    }

    public QuantitativeValueRange.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, QuantitativeValueRange.class).new Builder();
    }
}