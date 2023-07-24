package org.example.oop7.homeWork;

public class LoggingComplexCalculator implements ComplexCalculator{
    private final ComplexCalculator calculator;
    private final ComplexCalculatorLogger logger;

    public LoggingComplexCalculator(ComplexCalculator calculator, ComplexCalculatorLogger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = calculator.add(num1, num2);
        logger.log("Addition: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = calculator.multiply(num1, num2);
        logger.log("Multiplication: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = calculator.divide(num1, num2);
        logger.log("Division: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
