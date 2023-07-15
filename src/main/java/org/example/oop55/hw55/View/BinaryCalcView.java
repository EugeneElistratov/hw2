package org.example.oop55.hw55.View;

import org.example.oop55.hw55.Core.Controller.Status;
import org.example.oop55.hw55.Core.Model.Binary;

import java.util.Scanner;

public class BinaryCalcView {
    public void start() {
        Status status = Status.BINARY;
        while (status.equals(Status.BINARY)) {
            System.out.println("************************************************");
            System.out.println("Калькулятор перевода в двоичное предсталение");
            System.out.println("Введите натуральное число для перевода:");
            Scanner scanner = new Scanner(System.in);
            Binary binary = new Binary();
            String inputExpr = scanner.nextLine();
            System.out.println("Ответ: " + binary.toBinary(inputExpr));

            System.out.println("Продолжить работу в калькуляторе? (y/n)");
            String answer = scanner.next();
            if (!(answer.equals("y") || answer.equals("Y"))) {
                status = Status.WORK;
            }
        }

    }
}