package org.example.oop55.hw55.View;

import org.example.oop55.hw55.Core.Controller.Status;
import org.example.oop55.hw55.Core.Model.Complex;
import org.example.oop55.hw55.Core.Model.ComplexCalc;
import org.example.oop55.hw55.Core.Model.Parser;

import java.util.Scanner;
import java.util.logging.Logger;

public class ComplexCalcView {
    Complex first;
    Complex second;
    Complex result;
    public void start(Logger logger) {
        Status status = Status.COMPLEX;
        String mathAction;
        Scanner scanner = new Scanner(System.in);
        Parser parser = new Parser();
        while (status.equals(Status.COMPLEX)) {
            ComplexCalc complexCalc = new ComplexCalc();
            System.out.println("************************************************");
            System.out.println("Калькулятор комплексных чисел");

            System.out.println("Введите первое комплексное число в формате: -1+2i");
            String firstInput = scanner.next();
            first = new Complex(Double.valueOf(parser.parseInputStr(firstInput).get(0)), Double.valueOf(parser.parseInputStr(firstInput).get(1)));

            System.out.println("Введите второе комплексное число в формате: -1+2i");
            String secondInput = scanner.next();
            second = new Complex(Double.valueOf(parser.parseInputStr(secondInput).get(0)), Double.valueOf(parser.parseInputStr(secondInput).get(1)));

            System.out.println("Введите математическую операцию:");
            mathAction = scanner.next();
            switch (mathAction) {
                case "+":
                    result = complexCalc.sum(first, second);
                    break;
                case "-":
                    result = complexCalc.diff(first, second);
                    break;
                case "*":
                    result = complexCalc.multiply(first, second);
                    break;
                case "/":
                    result = complexCalc.devide(first, second);
                    break;
                default:
                    break;
            }

            System.out.println(
                    "Ответ: " + first.toString() + " " + mathAction +  " "
                            +  second.toString() + " = " + result.toString()
            );
            logger.info("Сделаны расчеты: " + first.toString() + " "
                    + mathAction +  " " +  second.toString() + " = " + result.toString());


            System.out.println("Продолжить работу в калькуляторе? (y/n)");
            String answer = scanner.next();
            if (!(answer.equals("y") || answer.equals("Y"))) {
                status = Status.WORK;
            }
        }

    }
}