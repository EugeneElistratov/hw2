package org.example.oop5.hw5.Base;

import org.example.oop5.hw5.Interfaces.IChoosingAction;
import org.example.oop5.hw5.Interfaces.IModel;
import org.example.oop5.hw5.Models.DifModel;
import org.example.oop5.hw5.Models.DivModel;
import org.example.oop5.hw5.Models.ProdModel;
import org.example.oop5.hw5.Models.SumModel;

import java.util.List;

public class ChoseModelFactory implements IChoosingAction {

    @Override
    public IModel chooseModel(String sign, List<Double> operandList) {
        IModel myAction = null;
        switch (sign) {
            case "*" -> myAction = new ProdModel();
            case "/" -> myAction = new DivModel();
            case "+" -> myAction = new SumModel();
            case "-" -> myAction = new DifModel();
        }
        myAction.setX(operandList.get(0));
        myAction.setY(operandList.get(1));
        return myAction;
    }

}