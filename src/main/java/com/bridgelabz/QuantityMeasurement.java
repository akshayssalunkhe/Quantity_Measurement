package com.bridgelabz;

public class QuantityMeasurement {

    //METHOD TO RETURN FEET VALUE
    public double returnFeet(double feet) {
        return feet;
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