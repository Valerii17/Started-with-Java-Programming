package org.example.oop7.homeWork;

public class SimpleComplexCalculator implements ComplexCalculator{
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new SimpleComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = (num1.getRealPart() * num2.getRealPart()) - (num1.getImaginaryPart() * num2.getImaginaryPart());
        double imaginaryPart = (num1.getRealPart() * num2.getImaginaryPart()) + (num1.getImaginaryPart() * num2.getRealPart());
        return new SimpleComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2);
        double realPart = ((num1.getRealPart() * num2.getRealPart()) + (num1.getImaginaryPart() * num2.getImaginaryPart())) / denominator;
        double imaginaryPart = ((num1.getImaginaryPart() * num2.getRealPart()) - (num1.getRealPart() * num2.getImaginaryPart())) / denominator;
        return new SimpleComplexNumber(realPart, imaginaryPart);
    }
}
