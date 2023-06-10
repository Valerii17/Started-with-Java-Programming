package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Hw2 {
    /**
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param args Пользователь вводит положительные и отрицательные числа пока не введет 0
     * @return Выводим сумму чисел перед отрицательными числами
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int prevNumber = scanner.nextInt();
        int currentNumber = scanner.nextInt();
        while (currentNumber != 0) {
            if (prevNumber > 0 && currentNumber < 0) {
                sum += prevNumber;
            }
            prevNumber = currentNumber;
            currentNumber = scanner.nextInt();
        }

        System.out.println(sum);
    }
}

