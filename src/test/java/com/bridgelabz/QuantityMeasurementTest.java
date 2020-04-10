package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementTest {

    //GLOBAL OBJECT
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnFeet(0);
        double value2 = quantityMeasurement.returnFeet(0);
        assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        boolean value1 = quantityMeasurement.equals(null);
        boolean value2 = quantityMeasurement.equals(null);
        assertEquals(value1, value2);
    }

    @Test
    public void givenTypeForFeet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementOne = new QuantityMeasurement();
        QuantityMeasurement quantityMeasurementTwo = new QuantityMeasurement();
        boolean equals = quantityMeasurementOne.equals(quantityMeasurementTwo);
        assertTrue(equals);
    }

    @Test
    public void givenReferenceForFeet_IfEqual_ShouldReturnTrue() {
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        assertTrue(equals);
    }

    @Test
    public void givenValueCheck_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnFeet(2.2);
        double value2 = quantityMeasurement.returnFeet(2.2);
        assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnInches(0);
        double value2 = quantityMeasurement.returnInches(0);
        assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullValueForInch_IfEqual_ShouldReturnFalse() {
        boolean value1 = quantityMeasurement.equals(null);
        boolean value2 = quantityMeasurement.equals(null);
        assertEquals(value1, value2);
    }

    @Test
    public void givenTypeForInch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurementOne = new QuantityMeasurement();
        QuantityMeasurement quantityMeasurementTwo = new QuantityMeasurement();
        boolean equals = quantityMeasurementOne.equals(quantityMeasurementTwo);
        assertTrue(equals);
    }

    @Test
    public void givenReferenceForInch_IfEqual_ShouldReturnTrue() {
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        assertTrue(equals);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnInches(2.2);
        double value2 = quantityMeasurement.returnInches(2.2);
        assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenValueInFeet_ShouldReturnValueInInches() {
        double inchValue = quantityMeasurement.returnValueInInches(1);
        Assert.assertEquals(12, inchValue, 0.0);
    }

    @Test
    public void givenValueInInch_ShouldReturnValeInFeet() {
        double feetValue = quantityMeasurement.returnValueInFeet(24);
        Assert.assertEquals(2, feetValue, 0.0);
    }
}