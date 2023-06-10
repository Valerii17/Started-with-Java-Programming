package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("reversWorld = " + reverseWords(s));
    }

    /**
     * @param s входная строка
     * @return reversed изменённая в обратном порядке строка
     * @apiNote Учитывая входную строку s, измените порядок слов на противоположный
     */
    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}