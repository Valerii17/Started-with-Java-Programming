package org.example.oop4.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Hw4 {
    public static void main(String[] args) {
        /**
         * @apiNote 1)расширить класс калькулятор на умножение
         * 2)расширить класс калькулятор на деление
         * 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг,
         * так и инт - тут необходимо подумать как наилучшим образом реализовать,
         * что будет если будут приниматься округляемые Double/Float
         * (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
         */
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            doubleList.add((double) i);

        }
        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
        System.out.println("calc.mu(doubleList) = " + calc.multiply(doubleList));
         System.out.println("calc.mu(doubleList) = " + calc.divide((double) 10.0, 6.0));
        System.out.println("calc.mu(doubleList) = " + calc.binaryConversion("10"));
        System.out.println("calc.mu(doubleList) = " + calc.binaryConversion(10));
        System.out.println("calc.mu(doubleList) = " + calc.binaryConversion(10.4));
        System.out.println("calc.mu(doubleList) = " + calc.binaryConversion(10.0));

    }
}

