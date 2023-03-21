package org.example.hw5;

import java.util.*;

public class Ex1 {
    /**
     * 1) Подсчитать количество вхождения каждого слова
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * toLoverCase().
     * (Усложнение - игнорировать пунктуацию)*
     */
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String res = removePunctuations(str);
        String[] result = res.toLowerCase().split(" ");
        for (int i = 0; i < result.length; i++) {
            if (!result[i].isEmpty()) {
                if (!myMap.containsKey(result[i])) myMap.put(result[i], 1);
                else myMap.put(result[i], myMap.get(result[i]) + 1);
            }
        }
        for (var entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " встретилось - " + entry.getValue() + " раз");
        }
    }
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
}
