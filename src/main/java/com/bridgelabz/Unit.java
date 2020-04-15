package com.bridgelabz;

public enum Unit {
    //ENUM CONSTANTS
    FEET(Type.LENGTH), INCH(Type.LENGTH), YARD(Type.LENGTH), CENTIMETER(Type.LENGTH),
    GALLON(Type.VOLUME), LITRE(Type.VOLUME), MILLILITRE(Type.VOLUME),
    KILOGRAM(Type.WEIGHT), GRAMS(Type.WEIGHT), TONNE(Type.WEIGHT),
    FAHRENHEIT(Type.TEMPERATURE), CELSIUS(Type.TEMPERATURE);

    //FIELD
    Type quantityType;

    //CONSTRUCTOR
    Unit(Type quantityType) {
        this.quantityType = quantityType;
    }
}