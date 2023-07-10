package org.example.oop3.classWork;

import org.example.oop3.homeWork.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        /**
         * @apiNote Дописать игру быки-коровы
         * - на русском и английском алфавите
         * - сделать логирование действий и по запросу пользователя посмотреть всю историю игры
         * - реализовать перезапуск игры
         */
        List<String> log = new ArrayList<>();
        System.out.println("Введите номер игры :1 -числа  , 2 - руский алфавит, 3 -английский алфавит ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();
        log.add("Выбранна игра :" + gameNumber);
        scanner.nextLine();
        switch (gameNumber) {
            case 1:
                NumberGame numberGame = new NumberGame();
                System.out.println("Введите количество загаданных чисел:");
                int numberCount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите количество попыток :");
                numberGame.start(numberCount, scanner.nextInt());
                scanner.nextLine();
                do {
                    while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                        String value = scanner.nextLine();
                        Answer answer = numberGame.inputValue(value);
                        if (answer != null) {
                            log.add("answer = " + answer);
                            System.out.println("answer = " + answer);
                        }
                    }

                    System.out.println("Хотите сыграть еще раз? (да/нет)");
                    String playAgain = scanner.nextLine();
                    if (playAgain.equalsIgnoreCase("да")) {
                        numberGame.reset();
                        System.out.println("Введите количество загаданных чисел:");
                        numberCount = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите количество попыток :");
                        numberGame.start(numberCount, scanner.nextInt());
                        scanner.nextLine();
                    } else {
                        break;
                    }
                } while (true);
                break;

            case 2:
                RussianLetterGame russianLetterGame = new RussianLetterGame();
                System.out.println("Введите количество загаданных символов:");
                int letterCount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите количество попыток :");
                russianLetterGame.start(letterCount, scanner.nextInt());
                scanner.nextLine();
                do {
                    while (!russianLetterGame.getGameStatus().equals(GameStatus.FINISH)) {
                        String value = scanner.nextLine();
                        Answer answer = russianLetterGame.inputValue(value);
                        if (answer != null) {
                            log.add("answer = " + answer);
                            System.out.println("answer = " + answer);
                        }
                    }

                    System.out.println("Хотите сыграть еще раз? (да/нет)");
                    String playAgain = scanner.nextLine();
                    if (playAgain.equalsIgnoreCase("да")) {
                        russianLetterGame.reset();
                        System.out.println("Введите количество загаданных чисел:");
                        numberCount = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите количество попыток :");
                        russianLetterGame.start(numberCount, scanner.nextInt());
                        scanner.nextLine();
                    } else {
                        break;
                    }
                } while (true);
                break;

            case 3:
                EnglishLetterGame englishLetterGame = new EnglishLetterGame();
                System.out.println("Введите количество загаданных символов:");
                int englishLetterCount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите количество попыток :");
                englishLetterGame.start(englishLetterCount, scanner.nextInt());
                scanner.nextLine();
                do {
                    while (!englishLetterGame.getGameStatus().equals(GameStatus.FINISH)) {
                        String value = scanner.nextLine();
                        Answer answer = englishLetterGame.inputValue(value);
                        if (answer != null) {
                            log.add("answer = " + answer);
                            System.out.println("answer = " + answer);
                        }
                    }

                    System.out.println("Хотите сыграть еще раз? (да/нет)");
                    String playAgain = scanner.nextLine();
                    if (playAgain.equalsIgnoreCase("да")) {
                        englishLetterGame.reset();
                        System.out.println("Введите количество загаданных чисел:");
                        numberCount = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите количество попыток :");
                        englishLetterGame.start(numberCount, scanner.nextInt());
                        scanner.nextLine();
                    } else {
                        break;
                    }
                } while (true);
                break;

            default:
                log.add("Неверный номер игры");
                System.out.println("Неверный номер игры");
        }
        System.out.println("Лог:");
        for (String message : log) {
            System.out.println(message);
        }
    }
}



