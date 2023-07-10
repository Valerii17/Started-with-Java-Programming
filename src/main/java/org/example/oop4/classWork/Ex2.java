package org.example.oop4.classWork;

public class Ex2 {
    public static void main(String[] args) {
        /**
         * 2)	Создать коробку с числами(BoxWithNumber) и найти среднее значение(average
         * и сравнение средних(compareAverage).
         */
        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber(1, 2, 3, 4);//разные типы Integer
        System.out.println("boxWithNumber.avarage() = " + boxWithNumber.avarage());
        BoxWithNumber<Double> boxWithNumber2 = new BoxWithNumber(1, 2, 3);//разные типы Double
        System.out.println("boxWithNumber.compareAvarage(boxWithNumber2) = " + boxWithNumber.compareAvarage(boxWithNumber2));
    }
}
