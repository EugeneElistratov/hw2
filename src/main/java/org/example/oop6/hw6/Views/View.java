package org.example.oop6.hw6.Views;

import org.example.oop6.hw6.Interfaces.IView;

import java.util.Scanner;

public class View implements IView {
    Scanner sc = new Scanner(System.in);

    public double getValue (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.nextDouble();
    }

    public String getSign (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }


    public void showResult(String stringName ) {
        System.out.printf("%s\n", stringName);
    }

}