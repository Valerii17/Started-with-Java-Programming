package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Hw4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);

        /**
         * @apiNote  Задан целочисленный список ArrayList. Найти минимальное, максимальное и
         * среднее из этого списка.
         * Для нахождения среднего значения использовал потоковую операцию (stream) и
         * метод mapToInt(), чтобы преобразовать каждый элемент списка в примитивный тип int,
         * а затем вызвал метод average() для вычисления среднего значения. Если список пустой,
         *  вернется значение 0.0 с помощью метода orElse().
         */

        int min = Collections.min(list);
        int max = Collections.max(list);
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}


