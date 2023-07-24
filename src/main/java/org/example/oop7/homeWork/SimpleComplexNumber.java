package org.example.oop7.homeWork;

public class SimpleComplexNumber implements ComplexNumber{
    private final double realPart;
    private final double imaginaryPart;

    public SimpleComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
