package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    //GLOBAL OBJECT
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(Unit.FEET, 0);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(Unit.FEET, 0);
        Assert.assertEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void givenFeetValueConvertToInch_ShouldReturnEqual() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(Unit.INCH, 12);
        Assert.assertEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void givenLengthAndVolume_WhenAdd_ThenThrowException() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement secQuantity = new QuantityMeasurement(Unit.LITRE, 1);
        boolean equalityCheck = firstQuantity.equals(secQuantity);
        Assert.assertFalse(equalityCheck);
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
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        boolean equalityCheck = firstFeetQuantity.equals(secondFeetQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(Unit.INCH, 0);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(Unit.INCH, 0);
        boolean equalityCheck = firstInchQuantity.equals(secondInchQuantity);
        assertTrue(equalityCheck);
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
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(Unit.FEET, 1);
        boolean equalityCheck = firstInchQuantity.equals(secondInchQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInFeet_whenEqualToEquivalentInch_ShouldReturnTrue() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 12);
        boolean equalityCheck = feetQuantity.equals(inchQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInInch_IfEqualToValueInFeet_ShouldReturnTrue() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 12);
        QuantityMeasurement feetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        boolean equalityCheck = inchQuantity.equals(feetQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInFeet_IfEqualToValueInYard_ShouldReturnTrue() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(Unit.YARD, 1);
        boolean equalityCheck = feetQuantity.equals(yardQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInOneFeet_NotEqualToOneYard_ShouldReturnFalse() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(Unit.YARD, 1);
        boolean equalityCheck = feetQuantity.equals(yardQuantity);
        assertFalse(equalityCheck);
    }

    @Test
    public void givenValueInInch_IfEqualsToValueInYard_ShouldReturnTrue() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 36);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(Unit.YARD, 1);
        boolean equalityCheck = inchQuantity.equals(yardQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueOneInch_IfNotEqualToOneYard_ShouldReturnTrue() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(Unit.YARD, 1);
        boolean equalityCheck = inchQuantity.equals(yardQuantity);
        assertFalse(equalityCheck);
    }

    @Test
    public void givenValueInYard_IfEqualToValueInInches_ShouldReturnTrue() {
        QuantityMeasurement yardQuantity = new QuantityMeasurement(Unit.YARD, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 36);
        boolean equalityCheck = yardQuantity.equals(inchQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInInch_IfEqualToValueInCentimeter_ShouldReturnTrue() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement centimeterQuantity = new QuantityMeasurement(Unit.CENTIMETER, 2.5);
        boolean euqals = inchQuantity.equals(centimeterQuantity);
        assertTrue(euqals);
    }

    @Test
    public void givenValueInCentimeter_IfEqualToValueInInch_ShouldReturnTrue() {
        QuantityMeasurement centimeterQuantity = new QuantityMeasurement(Unit.CENTIMETER, 5);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 2);
        boolean euqals = centimeterQuantity.equals(inchQuantity);
        assertTrue(euqals);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement inchQuantityOne = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement inchQuantityTwo = new QuantityMeasurement(Unit.INCH, 2);
        try {
            double quantityAddition = inchQuantityOne.addQuantity(inchQuantityOne, inchQuantityTwo);
            Assert.assertEquals(4, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 2);
        try {
            double quantityAddition = inchQuantity.addQuantity(feetQuantity, inchQuantity);
            Assert.assertEquals(14, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement feetQuantityOne = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement feetQuantityTwo = new QuantityMeasurement(Unit.FEET, 1);
        try {
            double quantityAddition = feetQuantityOne.addQuantity(feetQuantityOne, feetQuantityTwo);
            Assert.assertEquals(24, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchValueAndCentimeterValue_WhenAdded_ShouldReturnResultInInches() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement centimeterQuantity = new QuantityMeasurement(Unit.CENTIMETER, 2.5);
        try {
            double quantityAddition = inchQuantity.addQuantity(inchQuantity, centimeterQuantity);
            Assert.assertEquals(3, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValueOneGallon_whenEqualToEquivalentLitreValue_ShouldReturnTrue() {
        QuantityMeasurement gallonQuantity = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(Unit.LITRE, 3.78);
        boolean equalityCheck = gallonQuantity.equals(litreQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueOneLitre_ShouldReturnEquivalentLitreValue() {
        QuantityMeasurement litreQuantityOne = new QuantityMeasurement(Unit.LITRE, 1);
        QuantityMeasurement litreQuantityTwo = new QuantityMeasurement(Unit.LITRE, 1);
        boolean equalityCheck = litreQuantityOne.equals(litreQuantityTwo);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueOneMillilitre_ShouldReturnEquivalentLitreValue() {
        QuantityMeasurement millilitreQuantity = new QuantityMeasurement(Unit.MILLILITRE, 1000);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(Unit.LITRE, 1);
        boolean equalityCheck = litreQuantity.equals(millilitreQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueMillilitre_whenEqualToEquivalentLitreValue_ShouldReturnTrue() {
        QuantityMeasurement millilitreQuantity = new QuantityMeasurement(Unit.MILLILITRE, 5000);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(Unit.LITRE, 5);
        boolean equalityCheck = litreQuantity.equals(millilitreQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInGallonAndLitre_WhenAdded_ShouldReturnValueInLitre() {
        QuantityMeasurement gallonQuantity = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(Unit.LITRE, 1);
        try {
            double quantityAddition = gallonQuantity.addQuantity(gallonQuantity, litreQuantity);
            Assert.assertEquals(4.779999999999999, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValueInLitreAndMillilitre_WhenAdded_ShouldReturnValueInLitre() {
        QuantityMeasurement millilitreQuantity = new QuantityMeasurement(Unit.MILLILITRE, 1000);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(Unit.LITRE, 1);
        try {
            double quantityAddition = millilitreQuantity.addQuantity(millilitreQuantity, litreQuantity);
            Assert.assertEquals(2, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValue1000Grams_IfEqualToEquivalentKilogramValue_ShouldReturnTrue() {
        QuantityMeasurement gramQuantity = new QuantityMeasurement(Unit.GRAMS, 1000);
        QuantityMeasurement kilogramQuantity = new QuantityMeasurement(Unit.KILOGRAM, 1);
        try {
            double quantityAddition = gramQuantity.addQuantity(gramQuantity, kilogramQuantity);
            Assert.assertEquals(2, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValue1Kilograms_ShouldReturnEquivalentKilogramValue() {
        QuantityMeasurement kilogramQuantityOne = new QuantityMeasurement(Unit.KILOGRAM, 1);
        QuantityMeasurement kilogramQuantityTwo = new QuantityMeasurement(Unit.KILOGRAM, 1);
        boolean equalityCheck = kilogramQuantityOne.equals(kilogramQuantityTwo);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValue1Tonne_ShouldReturnEquivalentKilogramValue() {
        QuantityMeasurement tonneQuantityOne = new QuantityMeasurement(Unit.TONNE, 1);
        QuantityMeasurement kilogramQuantity = new QuantityMeasurement(Unit.KILOGRAM, 1000);
        boolean equalityCheck = tonneQuantityOne.equals(kilogramQuantity);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueInTonneAndGram_WhenAdded_ShouldReturnEquivalentKilogramValue() {
        QuantityMeasurement tonneQuantity = new QuantityMeasurement(Unit.TONNE, 1);
        QuantityMeasurement gramQuantity = new QuantityMeasurement(Unit.GRAMS, 1000);
        try {
            double quantityAddition = tonneQuantity.addQuantity(tonneQuantity, gramQuantity);
            Assert.assertEquals(1001, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValueTemperature0_WhenCompare_ShouldReturnEqual() {
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.CELSIUS, 0);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.CELSIUS, 0);
        boolean equalityCheck = temperatureOne.equals(temperatureTwo);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenTemperature_WhenCompare_ShouldReturnEqual() {
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.CELSIUS, 35);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.CELSIUS, 35);
        boolean equalityCheck = temperatureOne.equals(temperatureTwo);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenTemperature0CelsiusAnd0Fahrenheit_whenEquate_ShouldReturnFalse() {
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.CELSIUS, 0);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.FAHRENHEIT, 0);
        boolean equalityCheck = temperatureOne.equals(temperatureTwo);
        assertFalse(equalityCheck);
    }

    @Test
    public void givenTemperatureInFahrenheit_ShouldReturnEquivalentTemperatureInFahrenheit() {
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.FAHRENHEIT, 10);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.FAHRENHEIT, 10);
        boolean equalityCheck = temperatureOne.equals(temperatureTwo);
        assertTrue(equalityCheck);
    }

    @Test
    public void givenValueTwoDifferentUnits_ToCompare_ShouldReturnFalse() {
        QuantityMeasurement quantityOne = new QuantityMeasurement(Unit.LITRE, 10);
        QuantityMeasurement quantityTwo = new QuantityMeasurement(Unit.FAHRENHEIT, 10);
        boolean equalityCheck = quantityOne.equals(quantityTwo);
        assertFalse(equalityCheck);
    }

    @Test
    public void givenTemperature0CelsiusAnd0Fahrenheit_whenAdded_ShouldReturnResult() {
        double quantityAddition = 0;
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.CELSIUS, 0);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.FAHRENHEIT, 0);
        try {
            quantityAddition = temperatureOne.addQuantity(temperatureOne, temperatureTwo);
            Assert.assertEquals(1001, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTemperature0CelsiusAnd0Celsius_whenAdded_ShouldThrowCustomException() {
        double quantityAddition = 0;
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.CELSIUS, 0);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.CELSIUS, 0);
        try {
            quantityAddition = temperatureOne.addQuantity(temperatureOne, temperatureTwo);
            Assert.assertEquals(0, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTemperatureInFahrenheit_whenAdded_ShouldThrowException() {
        double quantityAddition = 0;
        QuantityMeasurement temperatureOne = new QuantityMeasurement(Unit.FAHRENHEIT, 34);
        QuantityMeasurement temperatureTwo = new QuantityMeasurement(Unit.FAHRENHEIT, 55);
        try {
            quantityAddition = temperatureOne.addQuantity(temperatureOne, temperatureTwo);
            Assert.assertEquals(1001, quantityAddition, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }
}