package org.example.oop52.hw5;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.Scanner;

public class Calc_Function_Rational {

    public void rationalFunc() throws RuntimeException {
        double x;
        double y;
        String operation;

        Scanner readRational = new Scanner(System.in);

        System.out.println("Input first number: ");
        x = readRational.nextDouble();

        System.out.println("Input second number: ");
        y = readRational.nextDouble();

        System.out.println("Input operation (+, -, *, /): ");
        operation = readRational.next();

        readRational.close();

        double result = rationalResult(x, y, operation);

        File logFile = new File("Log.txt");

        try {
            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            ((Appendable) logFile).append(String.format("%s %s %s = %s + \n",
                    x, operation, y, result));

            ((Flushable) logFile).flush();

            ((Closeable) logFile).close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    double rationalResult(double x, double y, String operation) {
        double res = switch (operation) {
            case ("+") -> x + y;
            case ("-") -> x - y;
            case ("*") -> x * y;
            case ("/") -> x / y;
            default -> 0;
        };
        return res;
    }

}