package org.example.lesson5.homeWork;

import java.util.*;

public class Hw2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков","Анна Мусина",
                "Павел Чернов","Светлана Петрова",
                "Петр Чернышов",
                "Мария Федорова","Анна Мусина",
                "Марина Светлова",
                "Мария Савина","Петр Чернышов",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова","Светлана Петрова",
                "Иван Мечников","Анна Мусина",
                "Петр Петин",
                "Иван Ежов"
        );
        /**
         * @apiNote Написать программу, которая найдёт и выведет повторяющиеся имена
         * с количеством повторений. Отсортировать по убыванию популярности.
         */

        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String employee : employees) {
            nameCountMap.put(employee, nameCountMap.getOrDefault(employee, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCountMap.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        }
    }
}
