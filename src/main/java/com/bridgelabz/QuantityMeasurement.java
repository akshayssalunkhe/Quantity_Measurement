package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {
    //FIELDS
    String arg;
    Unit unit;
    Type unitType;
    double conversionUnitValue;

    //PARAMETRISED CONSTRUCTOR
    public QuantityMeasurement(Unit unitToConvert, double unitValue) {
        this.unit = unitToConvert;
        this.unitType = unitToConvert.quantityType;
        this.conversionUnitValue = getConversionValue(unitValue);
    }

    //DEFAULT CONSTRUCTOR
    public QuantityMeasurement() {
    }

    //METHOD TO GET CONVERSION VALUE
    private double getConversionValue(double unitValue) {
        return QuantityMeasurementFactory.getConversionUnit(unitType, unit, unitValue);
    }

    @Override
    public boolean equals(Object objectToEquate) {
        if (this == objectToEquate)
            return true;
        if (objectToEquate == null || getClass() != objectToEquate.getClass())
            return false;
        QuantityMeasurement that = (QuantityMeasurement) objectToEquate;
        return Double.compare(that.conversionUnitValue, conversionUnitValue) == 0 && unitType == that.unitType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(arg);
    }

    //METHOD TO ADD QUANTITIES
    public double addQuantity(QuantityMeasurement firstQuantity, QuantityMeasurement secondQuantity) throws QuantityMeasurementException {
        return MeasurementOperations.addQuantity(firstQuantity, secondQuantity);
    }
}