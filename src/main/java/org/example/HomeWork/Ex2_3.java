package org.example.HomeWork;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Дан массив целых чисел.
 * Заменить отрицательные элементы на сумму индексов двузначных
 * элементов массива.
 */
public class Ex2_3 {
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        int [] ar = {1, 5, 45, 7, -5, 21, -8, 64};
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0 && (ar[i] > 9 && ar[i] < 100)) sum += i;
        }
        for (int i : ar) {
            if (i > 0) {
                array.add(i);
            }
            else array.add(sum);

        }
        System.out.println(array);
        }
}
