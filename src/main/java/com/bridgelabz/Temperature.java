package com.bridgelabz;

public class Temperature implements IConversionValue {
    //VARIABLES
    private static final double FAHRENHEIT = 1;
    private static final double CELSIUS = 1.8;

    @Override
    public double getConversion(Unit unit, double valueToConvert) {
        switch (unit) {
            case FAHRENHEIT:
                return valueToConvert * FAHRENHEIT;
            case CELSIUS:
                return valueToConvert * CELSIUS + 32;
        }
        return 0;
    }
}