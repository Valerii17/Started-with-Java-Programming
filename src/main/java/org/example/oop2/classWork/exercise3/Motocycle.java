package org.example.oop2.classWork.exercise3;

public class Motocycle implements Transport{
    @Override
    public void start() {
        System.out.println(" Motocycle run");
    }

    public void stop() {
        System.out.println("Мотоцикл остановился");
    }
}
