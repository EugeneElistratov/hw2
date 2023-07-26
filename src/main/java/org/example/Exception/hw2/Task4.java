package org.example.Exception.hw2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        emptyString();
    }

    private static void emptyString() {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.equals("")) {
            throw new RuntimeException("Пустые строки вводить нельзя!");

        }
        System.out.println("Вы ввели: " + string);
        scanner.close();
    }

}
