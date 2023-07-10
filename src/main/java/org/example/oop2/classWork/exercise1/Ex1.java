package org.example.oop2.classWork.exercise1;

public class Ex1 {
    public static void main(String[] args) {
        /**
         * @apiNote Переделать общие методы класса Animal - в абстрактные, используя код с предыдущего урока
         * (посмотреть поведение программы и исправить недочеты)
         * Создать метод свернуться в клубок у кота.
         */
        Animal[] catAndDog = {new Cat("qwe", "asd", 21), new Dog("pe", "zx", 16)};
        for (Animal o : catAndDog) {
            if (o instanceof Cat) {
                ((Cat) o).klubok();
            } else {
                System.out.println("не кот!");
            }
            o.voice();
        }

    }
}
