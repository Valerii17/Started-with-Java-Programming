package org.example.lesson6.classWork;

import java.util.*;
//1) Дан массив чисел, посчитать процент уникальных чисел.
//*процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2));
        Set<Integer> set = new HashSet<>(array);
        // без array в скобках
 //       for (int i = 0; i < array.size(); i++) {
 //           set.add(array.get(i));

 //       } ,более простой способ но длинее
        Double persent = (double) (set.size() * 100 / array.size());
        System.out.println("persent = " + persent);

    }
}
