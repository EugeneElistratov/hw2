package org.example.HomeWork.hw3.Ex3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Соль", 32.0, 1);
        Item item2 = new Item("Сахар", 63.0, 1);
        Item item3 = new Item("Мука Высший помол", 58.0, 3);
        Item item4 = new Item("Сыр мраморный высший урожай", 449.0, 1);
        Item item5 = new Item("Соль высший помол йодированная", 52.0, 2);
        Item item6 = new Item("Сыр адыгейский высший урожай", 699.0, 2);
        Item item7 = new Item("Сыр королевский высший урожай", 859.0, 2);

        List<Item> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);

        String searchName = "высший";
        Double maxPrice = 0.0;
        String maxPriceSortedNames = "";

        for (Item items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName)
                    && (items.getSort() == 1 || items.getSort() == 2)) {
                if (maxPrice < items.getPrice()) {
                    maxPrice = items.getPrice();
                }
            }
        }

        for (Item items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName)
                    && (items.getSort() == 1 || items.getSort() == 2)) {
                if (Objects.equals(items.getPrice(), maxPrice)) {

                    maxPriceSortedNames += items.getName() + "\n";
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, " +
                "в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice);
    }
}
