package org.example.oop2.classWork.exercise3;

public class Ex3 {
    public static void main(String[] args) {
        /**
         * 6) Создать класс человек с возможностью ездить и останавливаться на: машине, скейтборде,
         * велосипеде(что будет если расширить список ?).
         */

        Human human = new Human();
        Bysicle bysicle = new Bysicle();
        human.stop();
        human.drive(bysicle);
        human.stop();
        Motocycle motocycle = new Motocycle();
        human.drive(motocycle);
        human.stop();
    }
}
