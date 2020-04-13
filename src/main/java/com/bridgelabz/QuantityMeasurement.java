package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    //FIELD
    String arg;

    @Override
    public boolean equals(Object objectToEquate) {
        if (this == objectToEquate)
            return true;
        if (objectToEquate == null || getClass() != objectToEquate.getClass())
            return false;
        QuantityMeasurement that = (QuantityMeasurement) objectToEquate;
        return Objects.equals(arg, that.arg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arg);
    }

    //METHOD TO RETURN CONVERTED VALUE
    public double returnConversionValue(double valueToConvert, Unit unitToConvert, Type quantity) throws QuantityMeasurementException {
        if (!Objects.equals(unitToConvert.quantityType, quantity))
            throw new QuantityMeasurementException("Unit Type Mismatch");
        if (Objects.equals(unitToConvert, null))
            throw new QuantityMeasurementException("Unit Type Can't Be Null");
        if (unitToConvert.equals(Unit.CELSIUS))
            return ((unitToConvert.type * valueToConvert) + 32);
        return (valueToConvert * unitToConvert.type);
    }

    //METHOD TO ADD TWO DIFFERENT QUANTITY
    public double additionOfQuantity(double quantityOne, double quantityTwo) {
        return quantityOne + quantityTwo;
    }
}