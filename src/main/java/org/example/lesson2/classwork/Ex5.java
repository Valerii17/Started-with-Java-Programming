package org.example.lesson2.classwork;

public class Ex5 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2,3);

        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        Vector vector2 = new Vector(1, 1, 1);
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.vectorMulti(vector2) = " + vector.vectorMulti(vector2));
        System.out.println("vector.kosVector(vector2) = " + vector.kosVector(vector2));
        System.out.println(vector);
        System.out.println(vector2);
    }

}