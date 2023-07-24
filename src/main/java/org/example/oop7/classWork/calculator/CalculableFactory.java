package org.example.oop7.classWork.calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
