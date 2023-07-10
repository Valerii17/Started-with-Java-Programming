package org.example.oop4.classWork;

import java.util.List;

public class Calculator {
    /**
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     * @apiNote Написать класс калькулятор, принимающий List целочисленных значений,
     * * возвращающий сумму элементов коллекции (метод sum)
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }
}

