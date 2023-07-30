package org.example.Exception.hw3;

public class DataException extends Exception {
    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}
