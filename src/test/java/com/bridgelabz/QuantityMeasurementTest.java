package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    //GLOBAL OBJECT
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        double value2 = quantityMeasurement.returnConversionValue(1, Unit.FEET);
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
        double value1 = quantityMeasurement.returnConversionValue(2.2, Unit.FEET);
        double value2 = quantityMeasurement.returnConversionValue(2.2, Unit.FEET);
        assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.returnConversionValue(0, Unit.INCH);
        double value2 = quantityMeasurement.returnConversionValue(0, Unit.INCH);
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
        double value1 = quantityMeasurement.returnConversionValue(2.2, Unit.INCH);
        double value2 = quantityMeasurement.returnConversionValue(2.2, Unit.INCH);
        assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenValueInFeet_ShouldReturnValueInInches() {
        double inchValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        Assert.assertEquals(12, inchValue, 0.0);
    }

    @Test
    public void givenValueInInch_IfEqualToValueInFeet_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.returnConversionValue(12, Unit.INCH);
        double feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        Assert.assertEquals(inchValue, feetValue, 0.0);
    }

    @Test
    public void givenValueInFeet_IfEqualToValueInYard_ShouldReturnTrue() {
        double feetValue = quantityMeasurement.returnConversionValue(3, Unit.FEET);
        double yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        Assert.assertEquals(feetValue, yardValue, 0.0);
    }

    @Test
    public void givenValueInOneFeet_NotEqualToOneYard_ShouldReturnFalse() {
        double feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        double yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        Assert.assertNotEquals(feetValue, yardValue);
    }

    @Test
    public void givenValueInInch_IfEqualsToValueInYard_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.returnConversionValue(36, Unit.INCH);
        double yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        Assert.assertEquals(inchValue, yardValue, 0.0);
    }

    @Test
    public void givenValueOneInch_IfNotEqualToOneYard_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.returnConversionValue(1, Unit.INCH);
        double yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        Assert.assertNotEquals(inchValue, yardValue);
    }

    @Test
    public void givenValueInYard_IfEqualToValueInInches_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.returnConversionValue(36, Unit.INCH);
        double yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        Assert.assertEquals(inchValue, yardValue, 0.0);
    }

    @Test
    public void givenValueInInch_IfEqualToValueInCentimeter_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.returnConversionValue(0.4, Unit.INCH);
        double centimeterValue = quantityMeasurement.returnConversionValue(1, Unit.CENTIMETER);
        Assert.assertEquals(inchValue, centimeterValue, 0.0);
    }

    @Test
    public void givenValueInCentimeter_IfEqualToValueInInch_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH);
        double centimeterValue = quantityMeasurement.returnConversionValue(5, Unit.CENTIMETER);
        Assert.assertEquals(inchValue, centimeterValue, 0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        double inchValueOne = quantityMeasurement.returnConversionValue(2, Unit.INCH);
        double inchValueTwo = quantityMeasurement.returnConversionValue(2, Unit.INCH);
        double additionResult = quantityMeasurement.additionOfQuantity(inchValueOne, inchValueTwo);
        Assert.assertEquals(4, additionResult, 0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        double feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH);
        double additionResult = quantityMeasurement.additionOfQuantity(feetValue, inchValue);
        Assert.assertEquals(14, additionResult, 0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        double feetValueOne = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        double feetValueTwo = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        double additionResult = quantityMeasurement.additionOfQuantity(feetValueOne, feetValueTwo);
        Assert.assertEquals(24, additionResult, 0);
    }

    @Test
    public void givenInchValueAndCentimeterValue_WhenAdded_ShouldReturnResultInInches() {
        double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH);
        double centimeterValue = quantityMeasurement.returnConversionValue(2.5, Unit.CENTIMETER);
        double additionResult = quantityMeasurement.additionOfQuantity(inchValue, centimeterValue);
        Assert.assertEquals(3, additionResult, 0);
    }
}