package org.example.lesson5.classWork;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        /**
         * @apiNote 1) Посчитать количество вхождений каждого символа в текст
         */
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "kjbih hjbhjb, oj kjn kjnjnojnon";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i), 0);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            char currentChar = str.charAt(i);
//            if(!mapCh.containsKey(currentChar)){
//                mapCh.put(currentChar,1);
//            }else {
//                mapCh.put(str.charAt(i),mapCh.get(currentChar)+1);
//            }
        }
        for (Map.Entry<Character, Integer> entity : mapCh.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте  : " + entity.getValue() + "раз(а)");

        }
    }
}
