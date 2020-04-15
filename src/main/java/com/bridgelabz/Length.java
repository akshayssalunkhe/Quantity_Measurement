package com.bridgelabz;

public class Length implements IConversionValue {

    //VARIABLES
    private static final double FEET = 12;
    private static final double INCH = 1;
    private static final double YARD = 36;
    private static final double CENTIMETER = 0.4;

    @Override
    public double getConversion(Unit unit, double unitValue) {
        switch (unit) {
            case FEET:
                return unitValue * FEET;
            case INCH:
                return unitValue * INCH;
            case YARD:
                return unitValue * YARD;
            case CENTIMETER:
                return unitValue * CENTIMETER;
        }
        return 0;
    }
}