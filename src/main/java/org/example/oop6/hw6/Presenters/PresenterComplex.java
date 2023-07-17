package org.example.oop6.hw6.Presenters;

import org.example.oop6.hw6.Complex.Complex;
import org.example.oop6.hw6.Complex.ComplexCreater;
import org.example.oop6.hw6.Interfaces.IChoosingComplexFactory;
import org.example.oop6.hw6.Interfaces.ILogger;
import org.example.oop6.hw6.Interfaces.IViewComplex;

import java.util.ArrayList;
import java.util.List;

public class PresenterComplex {
    private final IViewComplex viewComplex;
    private final IChoosingComplexFactory modelComplex;
    private final ILogger loggerComplex;

    public PresenterComplex(IViewComplex viewComplex, IChoosingComplexFactory modelComplex, ILogger loggerComplex) {
        this.viewComplex = viewComplex;
        this.modelComplex = modelComplex;
        this.loggerComplex = loggerComplex;
    }

    public void buttonClickComplex() {
        ComplexCreater myComplex = new ComplexCreater();
        Complex a = myComplex.createComplex(viewComplex.getValue("первое число в формате: '0.0+0.0i'"));
        String sign = viewComplex.getSign("Введите символ вычисления: *  /  +  -  ");
        Complex b = myComplex.createComplex(viewComplex.getValue("второе число в формате: '0.0+0.0i'"));
        List<Complex> operandList = new ArrayList<>();
        operandList.add(a);
        operandList.add(b);
        Complex result = modelComplex.chooseModelComplex(sign, operandList).result();
        String resString = String.format("%s %s %s = %s", a.toString(), sign, b.toString(), result.toString());
        resString = viewComplex.showResult(resString);
        loggerComplex.log(PresenterComplex.class.getSimpleName(), "buttonClickComplex", resString);
    }

}