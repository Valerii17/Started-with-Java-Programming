package org.example.lesson2.classwork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNumbers(n, sc));
    }

    /**
     * @apiNote 2)Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
     * перед которыми идет четное число.
     * * @param number кол-во чисел
     * * @param in сканнер
     * * @return smNum резельтат вычислений
     */
    public static int sumNumbers(int number, Scanner in) {
        int smNum = 0;
        int firstNum = in.nextInt();
        for (int i = 0; i < number - 1; i++) {
            int num = in.nextInt();
            if (firstNum % 2 == 0 && num % 10 == 5) {
                smNum += num;
            }
            firstNum = num;
        }
        return smNum;
    }
}
