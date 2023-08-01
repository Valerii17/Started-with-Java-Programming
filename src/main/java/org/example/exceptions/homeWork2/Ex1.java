package org.example.exceptions.homeWork2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    /**
     * @apiNote Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
     * введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
     * необходимо повторно запросить у пользователя ввод данных.
     * @return
     */

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }
        }
    }
}
