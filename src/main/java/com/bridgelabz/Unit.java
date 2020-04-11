package com.bridgelabz;

public enum Unit {
    //ENUM CONSTANTS
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4),
    GALLON(3.78), LITRE(1), MILLILITRE(0.001),
    GRAM(0.001), TONNE(1000),
    CELSIUS(1.8), FAHRENHEIT(1);

    //FIELD
    public double type;

    //CONSTRUCTOR
    Unit(double type) {
        this.type = type;
    }
}