package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("zadanie1(n) = " + zadanie1(n));
    }

    /**
     * @param n входящее целочисленное число
     * @return результат выполнения задания
     * @apiNote Для заданного целого числа n верните разницу между произведением его цифр и суммой его цифр.
     */

    private static int zadanie1(int n) {
        int multi = 1, sum = 0;
        while (n != 0) {
            int m = n % 10;
            multi *= m;
            sum += m;
            n /= 10;
        }
        return multi - sum;
    }
}
