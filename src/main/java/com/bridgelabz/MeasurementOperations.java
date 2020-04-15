package com.bridgelabz;

public class MeasurementOperations {
    //METHOD TO ADD TWO DIFFERENT QUANTITY
    public static double addQuantity(QuantityMeasurement firstQuantity, QuantityMeasurement secondQuantity) throws QuantityMeasurementException {
        if (firstQuantity == null || secondQuantity == null)
            throw new QuantityMeasurementException("Null Value");
        if (firstQuantity.unitType != secondQuantity.unitType)
            throw new QuantityMeasurementException("Unit Type Are Different");
        if (firstQuantity.unitType == Type.TEMPERATURE)
            throw new QuantityMeasurementException("Addition Not Possible");
        return firstQuantity.conversionUnitValue + secondQuantity.conversionUnitValue;
    }
}