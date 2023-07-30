package org.example.Exception.hw3;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ " +
                    "(строка должна содержать Ф.И.О латинскими буквами, " +
                    "дату рождения - dd.mm.yyyy, " +
                    "номер телефона - цифры, " +
                    "пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы не ввели все данные, пожалуйста повторите.");
            } else System.out.println("Вы ввели лишние данные, пожалуйста повторите.");
        }

    }

}

/*
 Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О латинскими буквами,
 дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) :
 Ivanov Ivan Ivanovich 12.01.1985 123450007 m
 {firstName=Ivan, lastName=Ivanov, пол(m/f)=m, patronymic=Ivanovich, телефон=123450007, дата рождения=12.01.1985}
 Ivanov.txt
 Ivanov.txt
 String

 Process finished with exit code 0
 */