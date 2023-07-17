package org.example.oop6.hw6.BaseComplex;

import org.example.oop6.hw6.Complex.Complex;
import org.example.oop6.hw6.Interfaces.IChoosingComplexFactory;
import org.example.oop6.hw6.Interfaces.IModelComplex;
import org.example.oop6.hw6.ModelsComplex.DifModelComplex;
import org.example.oop6.hw6.ModelsComplex.DivModelComplex;
import org.example.oop6.hw6.ModelsComplex.ProdModelComplex;
import org.example.oop6.hw6.ModelsComplex.SumModelComplex;

import java.util.List;

public class ChoseModelComplexFactory implements IChoosingComplexFactory {

    @Override
    public IModelComplex chooseModelComplex(String sign, List<Complex> operandList) {
        IModelComplex myAction = null;
        switch(sign) {
            case "*" -> myAction = new ProdModelComplex();
            case "/" -> myAction = new DivModelComplex();
            case "+" -> myAction = new SumModelComplex();
            case "-" -> myAction = new DifModelComplex();
        }

        myAction.setA(operandList.get(0));
        myAction.setB(operandList.get(1));
        return myAction;
    }

}