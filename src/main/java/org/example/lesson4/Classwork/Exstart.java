package org.example.lesson4.Classwork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exstart {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(random.nextInt(10));
        }
        System.out.println("integerLinkedList = " + integerLinkedList);
        sc.close();
        System.out.println("integerLinkedList.peek() = " + integerLinkedList.peek());
        System.out.println("integerLinkedList.pop() = " + integerLinkedList.pop());
        integerLinkedList.addFirst(3);
        integerLinkedList.addLast(6);
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.remove(3); //удаляем элемент по индексу 3
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.remove((Integer) 3);//удаляем значение элемента 3
        System.out.println("integerLinkedList = " + integerLinkedList);
    }
}
