package org.example.HomeWork.hw5.Ex5_1;

//Подсчитать количество искомого слова,
//через map (наполнением значение, где искомое слово будет являться ключом)

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String findWord = "Россия";

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText){
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())){
                continue;
            }

            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.printf("Количество искомого слова: "+ findWord + " - "
                + map.getOrDefault(findWord.toLowerCase(), 0));

    }

}
