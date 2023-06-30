package org.example.lesson6.classWork;

public class Farengheit implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
}
