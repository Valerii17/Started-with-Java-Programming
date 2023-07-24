package org.example.oop7.homeWork;

public class Hw7 {
    public static void main(String[] args) {
        /**
         * @apiNote Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
         * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора. Соблюдать
         * принципы SOLID, паттерны проектирования
         */
        ComplexCalculatorLogger logger = new SimpleComplexCalculatorLogger();
        ComplexCalculator calculator = new SimpleComplexCalculator();
        ComplexCalculator loggingCalculator = new LoggingComplexCalculator(calculator, logger);

        ComplexNumber num1 = new SimpleComplexNumber(2, 3);
        ComplexNumber num2 = new SimpleComplexNumber(4, 5);

        ComplexNumber sum = loggingCalculator.add(num1, num2);
        ComplexNumber product = loggingCalculator.multiply(num1, num2);
        ComplexNumber quotient = loggingCalculator.divide(num1, num2);
        logger.log("Sum: " + sum);
        logger.log("Product: " + product);
        logger.log("Quotient: " + quotient);
    }
}
