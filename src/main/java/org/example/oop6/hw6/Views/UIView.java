package org.example.oop6.hw6.Views;

import org.example.oop6.hw6.Base.ChoseModelFactory;
import org.example.oop6.hw6.BaseComplex.ChoseModelComplexFactory;
import org.example.oop6.hw6.Interfaces.ILogger;
import org.example.oop6.hw6.Logging.LogData.SimpleLogger;
import org.example.oop6.hw6.Presenters.Presenter;
import org.example.oop6.hw6.Presenters.PresenterComplex;

import java.io.IOException;
import java.util.Scanner;

public class UIView {
    public Scanner sc = new Scanner(System.in);

    public void consoleUICalc() throws IOException {
        ILogger logger = new SimpleLogger();
        logger.getLog();
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator starts");
        Presenter pres = new Presenter(new View(), new ChoseModelFactory(), logger);
        PresenterComplex presComplex = new PresenterComplex(new ViewComplex(), new ChoseModelComplexFactory(), logger);
        System.out.println("Menu:\n1 - Classic calc;\n2 - Complex calc;\n0 - exit.");
        boolean loop = true;
        while (loop) {
            System.out.println("Введите команду из меню 1 или 2, или 0 для выхода: ");
            int myChoice = sc.nextInt();
            switch (myChoice) {
                case 1 -> {
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a common regime is initialised");
                    pres.buttonClick();
                }
                case 2 -> {
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a complex regime is initialised");
                    presComplex.buttonClickComplex();
                }
                case 0 -> {
                    sc.close();
                    loop = false;
                }
            }
        }
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator finishes");
    }
}