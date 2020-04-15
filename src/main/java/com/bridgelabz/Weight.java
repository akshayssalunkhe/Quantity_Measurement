package com.bridgelabz;

public class Weight implements IConversionValue {

    //VARIABLES
    private static final double KILOGRAM = 1;
    private static final double GRAMS = 0.001;
    private static final double TONNE = 1000;

    @Override
    public double getConversion(Unit unit, double valueToConvert) {
        switch (unit) {
            case KILOGRAM:
                return valueToConvert * KILOGRAM;
            case GRAMS:
                return valueToConvert * GRAMS;
            case TONNE:
                return valueToConvert * TONNE;
        }
        return 0;
    }
}