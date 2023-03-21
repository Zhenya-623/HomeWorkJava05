package org.example.hw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Ex2 {
    /*
    2) Подсчитать количество искомого слова, через map (наполнением значение, где искомое
    слово будет являться ключом), вносить все слова не нужно
     */
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        System.out.println("Введите слово у которого необходимо подсчитать количество вхождений: ");
        Scanner sc = new Scanner(System.in);
        String searchWord = sc.nextLine().toLowerCase();
        System.out.println(searchWord);
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String res = removePunctuations(str);
        String[] result = res.toLowerCase().split(" ");
        int count = 1;
        for (int i = 0; i < result.length; i++) {
            if (Objects.equals(result[i], searchWord)) myMap.put(result[i], count++);

        }
        for (var entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " встретилось - " + entry.getValue() + " раз");
        }
    }

    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }
}