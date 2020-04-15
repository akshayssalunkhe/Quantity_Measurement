package com.bridgelabz;

public class QuantityMeasurementFactory {
    //METHOD TO GET OBJECT OF UNIT ENTITY
    public static double getConversionUnit(Type unitType, Unit unit, double unitValue) {
        if (unitType.equals(Type.LENGTH))
            return new Length().getConversion(unit, unitValue);
        if (unitType.equals(Type.VOLUME))
            return new Volume().getConversion(unit, unitValue);
        if (unitType.equals(Type.WEIGHT))
            return new Weight().getConversion(unit, unitValue);
        if (unitType.equals(Type.TEMPERATURE))
            return new Temperature().getConversion(unit, unitValue);
        return 0;
    }
}