package com.bridgelabz;

public class QuantityMeasurement {

    //METHOD TO RETURN CONVERTED VALUE
    public double returnConversionValue(double valueToConvert, Unit unitToConvert) {
        if (unitToConvert.equals(Unit.CELSIUS)) {
            return ((unitToConvert.type * valueToConvert) + 32);
        }
        return (valueToConvert * unitToConvert.type);
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

    //METHOD TO ADD TWO DIFFERENT QUANTITY
    public double additionOfQuantity(double quantityOne, double quantityTwo) {
        return quantityOne + quantityTwo;
    }
}