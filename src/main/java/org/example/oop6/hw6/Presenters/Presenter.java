package org.example.oop6.hw6.Presenters;

import org.example.oop6.hw6.Interfaces.IChoosingAction;
import org.example.oop6.hw6.Interfaces.ILogger;
import org.example.oop6.hw6.Interfaces.IView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Presenter {
    private final IView myView;
    private final IChoosingAction myModel;
    private final ILogger mylogger;


    public Presenter(IView myView, IChoosingAction myModel, ILogger mylogger) {
        this.myView = myView;
        this.myModel = myModel;
        this.mylogger = mylogger;
    }

    public void buttonClick() throws IOException {
        double a = myView.getValue("первое число");
        String sign = myView.getSign(" + - * / символ вычисления");
        double b = myView.getValue("второе число");
        List<Double> operandsList = new ArrayList<>();
        operandsList.add(a);
        operandsList.add(b);
        double result = myModel.chooseModel(sign, operandsList).result();
        String resString = String.format("%f %s %f = %f", a, sign, b, result);
        myView.showResult(resString);
        mylogger.log(Presenter.class.getSimpleName(), "buttonClick", resString);
    }
}