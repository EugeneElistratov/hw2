package org.example.HomeWork;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */
public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0, n = 0, min = 0;
        Boolean wichOf = true;
        System.out.println("Введите длинну последовательности ");
        n = scanner.nextInt();
        System.out.print("Введите элемент последовательности номер 1: ");
        min = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.printf("Введите элемент последовательности номер %s: ", i);
            temp = scanner.nextInt();
            if (min < temp) min = temp;
            else wichOf = false;
        }
        scanner.close();
        if (wichOf) System.out.println("Последовательность возрастающая. ");
        else System.out.println("Последовательность не является возрастающей ");
    }
}
