package com.bridgelabz;

public enum Unit {
    //ENUM CONSTANTS
    FEET(12.0), INCH(1.0), YARD(36.0);

    //FIELD
    public double type;

    //CONSTRUCTOR
    Unit(double type) {
        this.type = type;
    }
}