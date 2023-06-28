package org.example.lesson5.homeWork;

import java.util.HashMap;
import java.util.Map;

public class Hw1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String word = "Россия";
        /**
         * @apiNote Подсчитать количество искомого слова, через map (наполнением значение,
         * где искомое слово будет являться ключом), вносить все слова не нужно
         */

        Map<String, Integer> wordCountMap = new HashMap<>();

        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "");

        String[] words = text.toLowerCase().split(" ");

        for (String w : words) {
            if (w.equals(word.toLowerCase())) {
                wordCountMap.put(w, wordCountMap.getOrDefault(w, 0) + 1);
            }
        }

        // Вывод результата
        System.out.println(word + " - " + wordCountMap.getOrDefault(word.toLowerCase(), 0));
    }
}

