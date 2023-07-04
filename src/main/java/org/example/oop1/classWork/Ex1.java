package org.example.oop1.classWork;

public class Ex1 {
    public class Main {
        /**
         * @apiNote  1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
         * @param args
         */
        public static void main(String[] args) {

            Cat cat1 = new Cat("barsik", "orange", 21);
            // Cat cat2 = new Cat("barsik2", "orange2", 11);
            // System.out.println("Кот : " + cat1.getName()
            // + " с цветом шерсти: " + cat1.getColor() + " имеет " + cat1.getAge() + " лет"); } }
            cat1.animalInfo(); cat1.voice(); cat1.jump();
        }
    }
}