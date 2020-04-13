package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    //GLOBAL OBJECT
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        double valueOne = 0;
        double valueTwo = 0;
        try {
            valueOne = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
            valueTwo = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
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
            valueOne = quantityMeasurement.returnConversionValue(2.2, Unit.FEET, Type.VOLUME);
            valueTwo = quantityMeasurement.returnConversionValue(2.2, Unit.FEET, Type.VOLUME);
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
            valueOne = quantityMeasurement.returnConversionValue(0, Unit.INCH, Type.LENGTH);
            valueTwo = quantityMeasurement.returnConversionValue(0, Unit.INCH, Type.LENGTH);
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
            valueOne = quantityMeasurement.returnConversionValue(2.2, Unit.INCH, Type.LENGTH);
            valueTwo = quantityMeasurement.returnConversionValue(2.2, Unit.INCH, Type.LENGTH);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        assertEquals(valueOne, valueTwo, 0.0);
    }

    @Test
    public void givenValueInFeet_ShouldReturnValueInInches() {
        double inchValue = 0;
        try {
            inchValue = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
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
            inchValue = quantityMeasurement.returnConversionValue(12, Unit.INCH, Type.LENGTH);
            feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
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
            feetValue = quantityMeasurement.returnConversionValue(3, Unit.FEET, Type.LENGTH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD, Type.LENGTH);
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
            feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD, Type.LENGTH);
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
            inchValue = quantityMeasurement.returnConversionValue(36, Unit.INCH, Type.LENGTH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD, Type.LENGTH);
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
            inchValue = quantityMeasurement.returnConversionValue(1, Unit.INCH, Type.LENGTH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD, Type.LENGTH);
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
            inchValue = quantityMeasurement.returnConversionValue(36, Unit.INCH, Type.LENGTH);
            yardValue = quantityMeasurement.returnConversionValue(1, Unit.YARD, Type.LENGTH);
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
            inchValue = quantityMeasurement.returnConversionValue(0.4, Unit.INCH, Type.LENGTH);
            centimeterValue = quantityMeasurement.returnConversionValue(1, Unit.CENTIMETER, Type.LENGTH);
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
            inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH, Type.LENGTH);
            centimeterValue = quantityMeasurement.returnConversionValue(5, Unit.CENTIMETER, Type.LENGTH);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(inchValue, centimeterValue, 0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        double additionResult = 0;
        try {
            double inchValueOne = quantityMeasurement.returnConversionValue(2, Unit.INCH, Type.LENGTH);
            double inchValueTwo = quantityMeasurement.returnConversionValue(2, Unit.INCH, Type.LENGTH);
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
            double feetValue = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
            double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH, Type.LENGTH);
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
            double feetValueOne = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
            double feetValueTwo = quantityMeasurement.returnConversionValue(1, Unit.FEET, Type.LENGTH);
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
            double inchValue = quantityMeasurement.returnConversionValue(2, Unit.INCH, Type.LENGTH);
            double centimeterValue = quantityMeasurement.returnConversionValue(2.5, Unit.CENTIMETER, Type.LENGTH);
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
            litreValue = quantityMeasurement.returnConversionValue(1, Unit.GALLON, Type.VOLUME);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(3.78, litreValue, 0.0);
    }

    @Test
    public void givenValueOneLitre_ShouldReturnEquivalentLitreValue() {
        double litreValue = 0;
        try {
            litreValue = quantityMeasurement.returnConversionValue(1, Unit.LITRE, Type.VOLUME);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, litreValue, 0.0);
    }

    @Test
    public void givenValueOneMillilitre_ShouldReturnEquivalentLitreValue() {
        double litreValue = 0;
        try {
            litreValue = quantityMeasurement.returnConversionValue(1000, Unit.MILLILITRE, Type.VOLUME);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, litreValue, 0.0);
    }

    @Test
    public void givenValueMillilitre_ShouldReturnEquivalentLitreValue() {
        double LitreValue = 0;
        try {
            LitreValue = quantityMeasurement.returnConversionValue(2000, Unit.MILLILITRE, Type.VOLUME);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(2, LitreValue, 0.0);
    }

    @Test
    public void givenValueInGallonAndLitre_WhenAdded_ShouldReturnValueInLitre() {
        double additionResult = 0;
        try {
            double gallonValue = quantityMeasurement.returnConversionValue(1, Unit.GALLON, Type.VOLUME);
            double litreValue = quantityMeasurement.returnConversionValue(3.78, Unit.LITRE, Type.VOLUME);
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
            double millilitreValue = quantityMeasurement.returnConversionValue(1000, Unit.MILLILITRE, Type.VOLUME);
            double litreValue = quantityMeasurement.returnConversionValue(1, Unit.LITRE, Type.VOLUME);
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
            kilogramValue = quantityMeasurement.returnConversionValue(1000, Unit.GRAM, Type.WEIGHT);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, kilogramValue, 0.0);
    }

    @Test
    public void givenValue1Kilograms_ShouldReturnEquivalentKilogramValue() {
        double kilogramValue = 0;
        try {
            kilogramValue = quantityMeasurement.returnConversionValue(1, Unit.KILOGRAM, Type.WEIGHT);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, kilogramValue, 0.0);
    }

    @Test
    public void givenValue1Tonne_ShouldReturnEquivalentKilogramValue() {
        double kilogramValue = 0;
        try {
            kilogramValue = quantityMeasurement.returnConversionValue(1, Unit.TONNE, Type.WEIGHT);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1000, kilogramValue, 0.0);
    }

    @Test
    public void givenValueInTonneAndGram_WhenAdded_ShouldReturnEquivalentKilogramValue() {
        double additionResult = 0;
        try {
            double tonneValue = quantityMeasurement.returnConversionValue(1, Unit.TONNE, Type.WEIGHT);
            double gramValue = quantityMeasurement.returnConversionValue(1000, Unit.GRAM, Type.WEIGHT);
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
            temperatureOne = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS, Type.TEMPERATURE);
            temperatureTwo = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS, Type.TEMPERATURE);

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
            temperatureOne = quantityMeasurement.returnConversionValue(212, Unit.FAHRENHEIT, Type.TEMPERATURE);
            temperatureTwo = quantityMeasurement.returnConversionValue(100, Unit.CELSIUS, Type.TEMPERATURE);
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
            temperatureValueOne = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS, Type.TEMPERATURE);
            temperatureValueTwo = quantityMeasurement.returnConversionValue(0, Unit.FAHRENHEIT, Type.TEMPERATURE);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals(temperatureValueTwo, temperatureValueOne, 0);
    }

    @Test
    public void givenTemperatureInFahrenheit_ShouldReturnEquivalentTemperatureInFahrenheit() {
        double temperatureValue = 0;
        try {
            temperatureValue = quantityMeasurement.returnConversionValue(35, Unit.FAHRENHEIT, Type.TEMPERATURE);
            Assert.assertEquals(35, temperatureValue, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTemperatureInFahrenheitButWithDifferentType_ShouldThrowCustomException() {
        double temperatureValue = 0;
        try {
            temperatureValue = quantityMeasurement.returnConversionValue(35, Unit.FAHRENHEIT, Type.VOLUME);
            Assert.assertEquals(35, temperatureValue, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValueTwoDifferentUnits_ToCompare_ShouldReturnFalse() {
        double valueOne = 0;
        double valueTwo = 0;
        try {
            valueOne = quantityMeasurement.returnConversionValue(2, Unit.FEET, Type.LENGTH);
            valueTwo = quantityMeasurement.returnConversionValue(2.2, Unit.LITRE, Type.VOLUME);
            boolean result = Objects.equals(valueOne, valueTwo);
            assertFalse(result);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoDifferentUnits_ToCompare_ShouldReturnCustomException() {
        try {
            double result = quantityMeasurement.returnConversionValue(35, Unit.FAHRENHEIT, Type.LENGTH);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTemperature0CelsiusAnd0Fahrenheit_whenAdded_ShouldReturnResult() {
        double temperatureValueOne = 0;
        double temperatureValueTwo = 0;
        double additionResult = 0;
        try {
            temperatureValueOne = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS, Type.TEMPERATURE);
            temperatureValueTwo = quantityMeasurement.returnConversionValue(0, Unit.FAHRENHEIT, Type.TEMPERATURE);
            additionResult = quantityMeasurement.additionOfQuantity(temperatureValueOne, temperatureValueTwo);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(32, additionResult, 0);
    }

    @Test
    public void givenTemperature0CelsiusAnd0Celsius_whenAdded_ShouldReturnResult()  {
        double temperatureValueOne = 0;
        double temperatureValueTwo = 0;
        double additionResult = 0;
        try {
            temperatureValueOne = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS, Type.TEMPERATURE);
            temperatureValueTwo = quantityMeasurement.returnConversionValue(0, Unit.CELSIUS, Type.TEMPERATURE);
            additionResult = quantityMeasurement.additionOfQuantity(temperatureValueOne, temperatureValueTwo);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        try {
            if (additionResult > 0)
                throw new QuantityMeasurementException("0 Celsius Can Not Be Added");
            Assert.assertEquals(0, additionResult, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTemperatureCelsiusAndCelsius_whenAdded_ShouldReturnFalse() {
        double temperatureValueOne = 0;
        double temperatureValueTwo = 0;
        double additionResult = 0;
        boolean result = true;
        try {
            temperatureValueOne = quantityMeasurement.returnConversionValue(35, Unit.CELSIUS, Type.TEMPERATURE);
            temperatureValueTwo = quantityMeasurement.returnConversionValue(35, Unit.CELSIUS, Type.TEMPERATURE);
            additionResult = quantityMeasurement.additionOfQuantity(temperatureValueOne, temperatureValueTwo);
            result = Objects.equals(70, additionResult);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }

    @Test
    public void givenTemperatureInFahrenheit_whenAdded_ShouldReturnResult() {
        double temperatureValueOne = 0;
        double temperatureValueTwo = 0;
        double additionResult = 0;
        try {
            temperatureValueOne = quantityMeasurement.returnConversionValue(40, Unit.FAHRENHEIT, Type.TEMPERATURE);
            temperatureValueTwo = quantityMeasurement.returnConversionValue(35, Unit.FAHRENHEIT, Type.TEMPERATURE);
            additionResult = quantityMeasurement.additionOfQuantity(temperatureValueOne, temperatureValueTwo);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(75, additionResult, 0);
    }
}