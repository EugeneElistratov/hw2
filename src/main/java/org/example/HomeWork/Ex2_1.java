package org.example.HomeWork;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, a1 = 0, n = 0;
        Boolean isSimple = true;
        System.out.println("Введите длинну последовательности ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Введите элемент последовательности номер %s: ", i);
            a1 = scanner.nextInt();

            for (int index = 2; index < a1 / 2 + 1; index++) {
                if (a1 % index == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple == true && a1 != 1) sum += a1;
            isSimple = true;
        }
        scanner.close();
        System.out.printf("Сумма простых чисел равна %s ", sum);
    }
}
