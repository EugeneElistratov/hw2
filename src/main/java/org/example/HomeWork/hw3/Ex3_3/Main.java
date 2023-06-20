package org.example.HomeWork.hw3.Ex3_3;

//import org.example.HomeWork.hw3.Ex3_3.Books;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Война и мир", "Толстой", 290.0, 1996, 1251);
        Books book2 = new Books("Зеленая миля", "Кинг", 209.0, 2014, 384);
        Books book3 = new Books("Граф Монте-Кристо", "Дюма", 190.0, 2017, 389);
        Books book4 = new Books("Метафизика", "Аристотель", 55.0, -400, 100);
        Books book5 = new Books("Десять негритят", "Агата Кристи", 99.0, 2021, 257);
        Books book6 = new Books("Записки юного врача", "Булгаков", 290.0, 2009, 239);
        Books book7 = new Books("Искра жизни", "Ремарк", 490.0,2023, 557);
        Books book8 = new Books("Отверженные", "Гюго", 890.0, 2017, 473);

        List<Books> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
