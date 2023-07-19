package org.example.lesson3.ex2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num < min) {
                min = max;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / list.size();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);

    }

}
