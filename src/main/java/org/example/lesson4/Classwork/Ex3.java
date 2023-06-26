package org.example.lesson4.Classwork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, -2, -1, 5, 9, -10));
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter a number: ");
//            myList.add(sc.nextInt());
 //       }
        oneDeletNegativeNumber(myList);
//       twoDeletNegativeNumber(myList);
        System.out.println("myList = " + myList);
    }

    private static void oneDeletNegativeNumber(LinkedList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < 0) {
                myList.remove(i);
                i--;// чтобы не сдвигался на след элемент
            }
        }
    }

    private static void twoDeletNegativeNumber(LinkedList<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            if (myList.get(i) < 0) {
                myList.remove(i);
            }
        }
    }
}