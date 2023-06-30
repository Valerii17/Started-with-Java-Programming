package org.example.lesson6.classWork;

import java.util.*;

public class Ex3 {
    //3) Найти пересечения слов в массивах и указать их общее количество.
    //Пример:
    //Mas1= [“qwe”,”asd”,”qwe”,”x”]
    //Mas2=[“qwe”,”v”]
    //Результат:
    //qwe=3
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Set<String> set = new HashSet<>(mas1);
        set.retainAll(mas2);
        System.out.println("set = " + set);
        //       int k = 0;-используем если без map
        Map<String, Integer> map = new HashMap<>();
        for (String s : set) {
            for (String s2 : mas1) {
                if (s2.equals(s) && map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + 1);
                } else if(s2.equals(s)){
                    map.put(s2, 1);
                }
            }
            for (String s2 : mas2) {
                if (s2.equals(s) && map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + 1);
                } else if(s2.equals(s)) {
                    map.put(s2, 1);
                }

            }
            System.out.println(s + " = " + map.get(s));

        }
//        for (String s : mas1) {
//            map.putIfAbsent(s, 0);
//            map.put(s, map.get(s) + 1);
//
//        }
//        for (String s : mas2) {
//            map.putIfAbsent(s, 0);
//            map.put(s, map.get(s) + 1);
//
//        }
//        for (String s : set) {
//            System.out.println(s + "= " + map.get(s));
//
//        }
//        for (String s : set) {
//            for (int i = 0; i < mas1.size(); i++) {
//                if (mas1.get(i).equals(s)) {
//                    k++;
//                }
//            }
//            for (int i = 0; i < mas2.size(); i++) {
//                if (mas2.get(i).equals(s)) {
//                    k++;
//                }
//
//            }
//            System.out.println(s + " = " + k);
//            k = 0;

    }
}



