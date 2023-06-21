package org.example.lesson3.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> itemList = createList(n);
        System.out.println("itemList = " + itemList);
        scanner.nextLine();
        String searchName = scanner.nextLine();
        Integer sumVolume = 0;
        List<String> counryList = new ArrayList<>();
        zad1(sumVolume, counryList, itemList, searchName);


    }

    /**
     * @apiNote sumVolume  Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
     * @param counryList
     * @param itemList
     * @param searchName
     */
    private static void zad1(Integer sumVolume, List<String> counryList, List<Item> itemList, String searchName) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolume += itemList.get(i).getValume();
                counryList.add(itemList.get(i).getCountry());
            }
        }
        System.out.println("counryList = " + counryList);
        System.out.println("sumVolume = " + sumVolume);
    }

    /**
     * @param n
     * @return
     * @apiNote Формирование ArrayList
     */

    private static ArrayList<Item> createList(int n) {
        ArrayList<Item> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Item item1 = new Item("qwe1", "asd1", random.nextInt(100));
            Item item2 = new Item("qwe2", "asd2", random.nextInt(100));
            Item item3 = new Item("qwe3", "asd3", random.nextInt(100));
            Item item4 = new Item("qwe1", "asd4", random.nextInt(100));
            resultList.add(item1);
            resultList.add(item2);
            resultList.add(item3);
            resultList.add(item4);

        }
        return resultList;
    }
}
