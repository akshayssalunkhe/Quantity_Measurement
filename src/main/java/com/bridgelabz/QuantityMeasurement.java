package com.bridgelabz;

public class QuantityMeasurement {

    //METHOD TO RETURN FEET VALUE
    public double returnFeet(double feet) {
        return feet;
    }

    //METHOD TO RETURN INCH VALUE
    public double returnInches(double inch) {
        return inch;
    }

    //METHOD TO CONVERT FEET VALUE IN INCHES
    public double returnValueInInches(double feetValue) {
        double inches;
        return inches = (feetValue * 12);
    }

    //METHOD TO CONVERT INCH VALUE IN FEET
    public double returnValueInFeet(double inchValue) {
        double feet;
        return feet = (inchValue * 1 / 12);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return true;
        if (this.getClass() == obj.getClass())
            return true;
        if (obj == this)
            return true;
        return super.equals(obj);
    }
}