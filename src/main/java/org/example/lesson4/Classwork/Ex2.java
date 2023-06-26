package org.example.lesson4.Classwork;

import java.util.LinkedList;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Random random = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println("myList = " + myList);
        int sumPositive = getSumPositive(myList);
        System.out.println("sumPositive = " + sumPositive);
    }

    /**
     * @apiNote  . Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
     * @param myList
     * @return
     */
    private static int getSumPositive(LinkedList<Integer> myList) {
        int sumPositive = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                sumPositive += myList.get(i);
            }
        }
        return sumPositive;
    }
}
