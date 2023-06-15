package org.example.lesson2.homework;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {
        sumIndices();
    }
    /**
     * @apiNote  Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */
    private static void sumIndices() {
        int[] arr = {10, -5, 20, -15, 30, -25};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 != 0) sum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
