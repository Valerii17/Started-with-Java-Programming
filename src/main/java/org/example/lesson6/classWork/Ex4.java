package org.example.lesson6.classWork;

public class Ex4 {
    public static void main(String[] args) {
        //4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
        //Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
        // для валидного перевода величин. Метод для конвертации назовите "convertValue".
        double temp = 0.0;
        System.out.println("temp C= " + new Celsii().convertValue(temp));
        System.out.println("temp Kelvn= " + new Kelvin().convertValue(temp));
        System.out.println("temp Forngheit= " + new Farengheit().convertValue(temp));

    }
}
