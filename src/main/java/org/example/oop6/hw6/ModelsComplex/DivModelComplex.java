package org.example.oop6.hw6.ModelsComplex;

import org.example.oop6.hw6.BaseComplex.CalcModelComplex;
import org.example.oop6.hw6.Complex.Complex;

public class DivModelComplex extends CalcModelComplex {
    protected Complex a;

    @Override
    public Complex result() {
        return new Complex((super.a.getX() * super.b.getX()) + (super.a.getY() * super.b.getY()) / (super.b.getX() * super.b.getX() + super.b.getY() * super.b.getY())
                + (super.a.getY() * super.b.getX()) + (super.a.getX() * super.b.getY()) / (super.b.getX() * super.b.getX() + super.b.getY() * super.b.getY()));
    }

    @Override
    public void setA(Complex a) {
        super.a = a;
    }

    @Override
    public void setB(Complex b) {
        super.b = b;
    }

}