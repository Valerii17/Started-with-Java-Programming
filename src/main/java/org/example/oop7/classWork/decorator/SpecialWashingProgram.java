package org.example.oop7.classWork.decorator;

public abstract class SpecialWashingProgram implements WashingProgram {

    protected WashingProgram washingProgram;

    public SpecialWashingProgram(WashingProgram washingProgram) {
        this.washingProgram = washingProgram;
    }

    public void warmerSetTemperature(int temperature) {
        System.out.println("Подогреваем воду до " + temperature + " градусов");
    }
}
