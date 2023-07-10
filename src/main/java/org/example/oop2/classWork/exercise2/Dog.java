package org.example.oop2.classWork.exercise2;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Пёс", maxRunDistance, maxSwimDistance);
        count++;
    }
}
