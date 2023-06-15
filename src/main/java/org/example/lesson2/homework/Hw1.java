package org.example.lesson2.homework;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("Введите число n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Сумма простых чисел : "+primeNambers(n));
    }

    /**
     * @apiNote  Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n Водится пользователем с клавиатуры
     * @return Сумма простых чисел
     */

    public static int primeNambers(int n) {
        boolean flag;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                sum += i;
            }
        }
        return sum;
    }


}
