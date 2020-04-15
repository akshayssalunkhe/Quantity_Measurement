package com.bridgelabz;

public class Volume implements IConversionValue {

    private static final double GALLON = 3.78;
    private static final double LITRE = 1;
    private static final double MILLILITRE = 0.001;

    @Override
    public double getConversion(Unit unit, double valueToConvert) {
        switch (unit) {
            case GALLON:
                return valueToConvert * GALLON;
            case LITRE:
                return valueToConvert * LITRE;
            case MILLILITRE:
                return valueToConvert * MILLILITRE;
        }
        return 0;
    }
}