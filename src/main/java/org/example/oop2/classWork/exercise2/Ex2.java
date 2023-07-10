package org.example.oop2.classWork.exercise2;

public class Ex2 {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat("barsik", "Cat", 100, 23),
                new Dog("Bobik", "qwe", 10000, 20000),
                new Tiger("Tigra", "qwe", 0, 15),
                new Cat("Просто кот", "asdasdasdaad", 10, 10)};
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(20);
        }
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Cat.count = " + Cat.count);
        System.out.println("Tiger.count = " + Tiger.count);
        System.out.println("Dog.count = " + Dog.count);
        System.out.println("HomeCat.count = " + HomeCat.count);
    }
    /**
     * 	Создать классы Собака, Кот,Домашний Кот, Тигр, Животное
     * 	Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
     * 	У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
     * плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
     * 	 Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
     * 	Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
     * 	 Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
     */

}

