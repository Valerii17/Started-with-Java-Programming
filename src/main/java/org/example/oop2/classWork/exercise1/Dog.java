package org.example.oop2.classWork.exercise1;

public class Dog extends Animal {
    private String color;
    private int age;

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void klubok() {
        System.out.println(" пёс " + name + ", с возрастом-" + age + " , c цветом шерсти: " + color + " -- свернулся в клубок");
    }

    @Override
    public void animalInfo() {
        System.out.println("собака ");
    }

    @Override
    public void voice() {
        System.out.println(" gav - gav");
    }
}
