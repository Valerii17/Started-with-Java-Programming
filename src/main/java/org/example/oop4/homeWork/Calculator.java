package org.example.oop4.homeWork;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double multiply(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double divide(Double num1, Double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Нельзя делить на ноль !");
        }
        return (double) Math.round((num1 / num2)*10)/10;
    }

    public String binaryConversion(String num) {
        int decimal = Integer.parseInt(num);
        return Integer.toBinaryString(decimal);
    }

    public String binaryConversion(int num) {
        return Integer.toBinaryString(num);
    }

    public String binaryConversion(double num) {
        int decimal = (int) Math.round(num);
        return Integer.toBinaryString(decimal);
    }
    public String binaryConversion(float num) {
        int decimal = (int) Math.round(num);
        return Integer.toBinaryString(decimal);
    }
}
