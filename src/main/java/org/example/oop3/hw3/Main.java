package org.example.oop3.hw3;

import java.util.Scanner;

public class Main {
    // todo: ввод пользователя
    // todo: логирование пользовательских попыток
    // todo: реализовать рестарт игры
    // todo: реализовать английскую версию
    public static void main(String[] args) {
        Application app = new Application();
        Scanner scanner = new Scanner(System.in);
        String restart;
        do {
            Answer.count = 1;
            app.startGame();
            System.out.println("Хотите перезапустить игру?");
            System.out.println("Введите: y - да, n - нет");
            restart = scanner.nextLine();
        } while (restart.equals("y"));

    }
}