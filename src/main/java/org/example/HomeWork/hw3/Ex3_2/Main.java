package org.example.HomeWork.hw3.Ex3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Бананы", "Эквадор", 119.0, 1000.0, 1);
        Item item2 = new Item("Молоко", "Баларусь", 50.0, 800.0, 2);
        Item item3 = new Item("Масло", "Россия", 190.0, 180.0, 2);
        Item item4 = new Item("Мука", "Баларусь", 54.0, 1000.0, 3);
        Item item5 = new Item("Хлеб", "Россия", 45.99, 400.0, 2);
        Item item6 = new Item("Айран", "Казахстан", 20.0, 500.0, 1);
        Item item7 = new Item("Сыр королевский высший урожай", "Беларусь", 859.0,
                1000.0, 1);
        Item item8 = new Item("Айран2", "Казахстан", 25.0, 500.0, 1);

        List<Item> itemsList2 = new ArrayList<>();

        itemsList2.add(item1);
        itemsList2.add(item2);
        itemsList2.add(item3);
        itemsList2.add(item4);
        itemsList2.add(item5);
        itemsList2.add(item6);
        itemsList2.add(item7);
        itemsList2.add(item8);

        System.out.println(itemsList2);
        int ourSort = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите номер сорта (1, 2, 3)");
            String sort = scanner.nextLine();
            try {
                if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sort);
                }
            } catch (Exception e) {
                System.out.println("Это не число 1, 2, 3. Попробуйте еще раз.");
            }
        }
        scanner.close();

        double minPrice = itemsList2.get(0).getPrice();
        for (Item items2 : itemsList2) {

            if (items2.getSort().equals(ourSort)) {
                if (items2.getPrice() < minPrice) {
                    minPrice = items2.getPrice();
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Item items2 : itemsList2) {

            if (items2.getSort().equals(ourSort) && (items2.getPrice() == minPrice)) {
                ourNames.append(items2.getName()).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + ourSort + ": \n" + ourNames);


    }

}
