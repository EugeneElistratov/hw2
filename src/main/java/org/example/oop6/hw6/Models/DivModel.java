package org.example.oop6.hw6.Models;

import org.example.oop6.hw6.Base.CalcModel;

public class DivModel extends CalcModel {

    @Override
    public double result() {
        return x / y;
    }

    @Override
    public void setX (double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }


}