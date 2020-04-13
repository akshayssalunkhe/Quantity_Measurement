package com.bridgelabz;

public enum Unit {
    //ENUM CONSTANTS
    FEET(12.0, Type.LENGTH), INCH(1.0, Type.LENGTH), YARD(36.0, Type.LENGTH), CENTIMETER(0.4, Type.LENGTH),
    GALLON(3.78, Type.VOLUME), LITRE(1, Type.VOLUME), MILLILITRE(0.001, Type.VOLUME),
    GRAM(0.001, Type.WEIGHT), TONNE(1000, Type.WEIGHT), KILOGRAM(1, Type.WEIGHT),
    CELSIUS(1.8, Type.TEMPERATURE), FAHRENHEIT(1, Type.TEMPERATURE);


    //FIELD
    public double type;
    Type quantityType;

    //CONSTRUCTOR
    Unit(double type, Type quantityType) {
        this.type = type;
        this.quantityType = quantityType;
    }
}