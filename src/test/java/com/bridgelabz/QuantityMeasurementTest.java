package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    //GLOBAL OBJECT
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        double valueOne = 0;
        double valueTwo = 0;
        try {
            valueOne = quantityMeasurement.returnConversionValue(1, Unit.FEET);
            valueTwo = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        assertEquals(valueOne, valueTwo, 0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        boolean valueOne = quantityMeasurement.equals(null);
        boolean valueTwo = quantityMeasurement.equals(null);
        assertEquals(valueOne, valueTwo);
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
        double valueOne = 0;
        double valueTwo = 0;
        try {
            valueOne = quantityMeasurement.returnConversionValue(2.2, Unit.FEET);
            valueTwo = quantityMeasurement.returnConversionValue(2.2, Unit.FEET);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        assertEquals(valueOne, valueTwo, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        double valueOne = 0;
        double valueTwo = 0;
        try {
            valueOne = quantityMeasurement.returnConversionValue(0, Unit.INCH);
            valueTwo = quantityMeasurement.returnConversionValue(0, Unit.INCH);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        assertEquals(valueOne, valueTwo, 0.0);
    }

    @Test
    public void givenNullValueForInch_IfEqual_ShouldReturnFalse() {
        boolean valueOne = quantityMeasurement.equals(null);
        boolean valueTwo = quantityMeasurement.equals(null);
        assertEquals(valueOne, valueTwo);
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
        double valueOne = 0;
        double valueTwo = 0;
        try {
            valueOne = quantityMeasurement.returnConversionValue(2.2, Unit.INCH);
            valueTwo = quantityMeasurement.returnConversionValue(2.2, Unit.INCH);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        assertEquals(valueOne, valueTwo, 0.0);
    }

    @Test
    public void givenValueInFeet_ShouldReturnValueInInches() {
        double inchValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(12, inchValue, 0.0);
    }

    @Test
    public void givenValueInInch_IfEqualToValueInFeet_ShouldReturnTrue() {
        double inchValue = 0;
        double feetValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(12, Unit.INCH);
            feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(inchValue, feetValue, 0.0);
    }

    @Test
    public void givenValueInFeet_IfEqualToValueInYard_ShouldReturnTrue() {
        double feetValue = 0;
        double yardValue = 0;
        try {
            feetValue = quantityMeasurement.returnConversionValue(3, Unit.FEET);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(feetValue, yardValue, 0.0);
    }

    @Test
    public void givenValueInOneFeet_NotEqualToOneYard_ShouldReturnFalse() {
        double feetValue = 0;
        double yardValue = 0;
        try {
            feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals(feetValue, yardValue);
    }

    @Test
    public void givenValueInInch_IfEqualsToValueInYard_ShouldReturnTrue() {
        double inchValue = 0;
        double yardValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(36, Unit.INCH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(inchValue, yardValue, 0.0);
    }

    @Test
    public void givenValueOneInch_IfNotEqualToOneYard_ShouldReturnTrue() {
        double inchValue = 0;
        double yardValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(1, Unit.INCH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals(inchValue, yardValue);
    }

    @Test
    public void givenValueInYard_IfEqualToValueInInches_ShouldReturnTrue() {
        double inchValue = 0;
        double yardValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(36, Unit.INCH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(inchValue, yardValue, 0.0);
    }

    @Test
    public void givenValueInInch_IfEqualToValueInCentimeter_ShouldReturnTrue() {
        double inchValue = 0;
        double centimeterValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(0.4, Unit.INCH);
            centimeterValue = quantityMeasurement.returnConversionValue(1, Unit.CENTIMETER);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(inchValue, centimeterValue, 0.0);
    }

    @Test
    public void givenValueInCentimeter_IfEqualToValueInInch_ShouldReturnTrue() {
        double inchValue = 0;
        double centimeterValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH);
            centimeterValue = quantityMeasurement.returnConversionValue(5, Unit.CENTIMETER);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(inchValue, centimeterValue, 0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        double additionResult = 0;
        try {
            double inchValueOne = quantityMeasurement.returnConversionValue(2, Unit.INCH);
            double inchValueTwo = quantityMeasurement.returnConversionValue(2, Unit.INCH);
            additionResult = quantityMeasurement.additionOfQuantity(inchValueOne, inchValueTwo);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(4, additionResult, 0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        double additionResult = 0;
        try {
            double feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET);
            double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH);
            additionResult = quantityMeasurement.additionOfQuantity(feetValue, inchValue);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(14, additionResult, 0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        double additionResult = 0;
        try {
            double feetValueOne = quantityMeasurement.returnConversionValue(1, Unit.FEET);
            double feetValueTwo = quantityMeasurement.returnConversionValue(1, Unit.FEET);
            additionResult = quantityMeasurement.additionOfQuantity(feetValueOne, feetValueTwo);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(24, additionResult, 0);
    }

    @Test
    public void givenInchValueAndCentimeterValue_WhenAdded_ShouldReturnResultInInches() {
        double additionResult = 0;
        try {
            double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH);
            double centimeterValue = quantityMeasurement.returnConversionValue(2.5, Unit.CENTIMETER);
            additionResult = quantityMeasurement.additionOfQuantity(inchValue, centimeterValue);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(3, additionResult, 0);
    }

    @Test
    public void givenValueOneGallon_ShouldReturnEquivalentLitreValue() {
        double litreValue = 0;
        try {
            litreValue = quantityMeasurement.returnConversionValue(1, Unit.GALLON);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(3.78, litreValue, 0.0);
    }

    @Test
    public void givenValueOneLitre_ShouldReturnEquivalentLitreValue() {
        double litreValue = 0;
        try {
            litreValue = quantityMeasurement.returnConversionValue(1, Unit.LITRE);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, litreValue, 0.0);
    }

    @Test
    public void givenValueOneMillilitre_ShouldReturnEquivalentLitreValue() {
        double litreValue = 0;
        try {
            litreValue = quantityMeasurement.returnConversionValue(1000, Unit.MILLILITRE);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, litreValue, 0.0);
    }

    @Test
    public void givenValueMillilitre_ShouldReturnEquivalentLitreValue() {
        double LitreValue = 0;
        try {
            LitreValue = quantityMeasurement.returnConversionValue(2000, Unit.MILLILITRE);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(2, LitreValue, 0.0);
    }

    @Test
    public void givenValueInGallonAndLitre_WhenAdded_ShouldReturnValueInLitre() {
        double additionResult = 0;
        try {
            double gallonValue = quantityMeasurement.returnConversionValue(1, Unit.GALLON);
            double litreValue = quantityMeasurement.returnConversionValue(3.78, Unit.LITRE);
            additionResult = quantityMeasurement.additionOfQuantity(gallonValue, litreValue);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(7.56, additionResult, 0);
    }

    @Test
    public void givenValueInLitreAndMillilitre_WhenAdded_ShouldReturnValueInLitre() {

        double additionResult = 0;
        try {
            double millilitreValue = quantityMeasurement.returnConversionValue(1000, Unit.MILLILITRE);
            double litreValue = quantityMeasurement.returnConversionValue(1, Unit.LITRE);
            additionResult = quantityMeasurement.additionOfQuantity(millilitreValue, litreValue);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(2, additionResult, 0);
    }

    @Test
    public void givenValue1000Grams_ShouldReturnEquivalentKilogramValue() {
        double kilogramValue = 0;
        try {
            kilogramValue = quantityMeasurement.returnConversionValue(1000, Unit.GRAM);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, kilogramValue, 0.0);
    }

    @Test
    public void givenValue1Tonne_ShouldReturnEquivalentKilogramValue() {
        double kilogramValue = 0;
        try {
            kilogramValue = quantityMeasurement.returnConversionValue(1, Unit.TONNE);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1000, kilogramValue, 0.0);
    }

    @Test
    public void givenValueInTonneAndGram_WhenAdded_ShouldReturnEquivalentKilogramValue() {
        double additionResult = 0;
        try {
            double tonneValue = quantityMeasurement.returnConversionValue(1, Unit.TONNE);
            double gramValue = quantityMeasurement.returnConversionValue(1000, Unit.GRAM);
            additionResult = quantityMeasurement.additionOfQuantity(tonneValue, gramValue);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1001, additionResult, 0);
    }

    @Test
    public void givenValueTemperature0_WhenCompare_ShouldReturnEqual() {
        double temperatureOne = 0;
        double temperatureTwo = 0;
        try {
            temperatureOne = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS);
            temperatureTwo = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS);

        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(temperatureOne, temperatureTwo, 0);
    }

    @Test
    public void givenTemperature_WhenCompare_ShouldReturnEqual() {
        double temperatureOne = 0;
        double temperatureTwo = 0;
        try {
            temperatureOne = quantityMeasurement.returnConversionValue(212, Unit.FAHRENHEIT);
            temperatureTwo = quantityMeasurement.returnConversionValue(100, Unit.CELSIUS);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(temperatureOne, temperatureTwo, 0);
    }

    @Test
    public void givenTemperature0CelsiusAnd0Fahrenheit_whenEquate_ShouldReturnNotEqual() {
        double temperatureValueOne = 0;
        double temperatureValueTwo = 0;
        try {
            temperatureValueOne = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS);
            temperatureValueTwo = quantityMeasurement.returnConversionValue(0, Unit.FAHRENHEIT);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals(temperatureValueTwo, temperatureValueOne, 0);
    }

    @Test
    public void givenTemperatureInFahrenheit_ShouldReturnEquivalentTemperatureInFahrenheit() {
        double temperatureValue = 0;
        try {
            temperatureValue = quantityMeasurement.returnConversionValue(35, Unit.FAHRENHEIT);
        } catch (QuantityMeasurementException e) {

        }
        Assert.assertEquals(35, temperatureValue, 0);
    }

    @Test
    public void givenTemperatureInFahrenheitq_ShouldReturnEquivalentTemperatureInFahrenheit() {
        double temperatureValue = 0;
        try {
            temperatureValue = quantityMeasurement.returnConversionValue(35, null);
            Assert.assertEquals(35, temperatureValue, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }

    }
}