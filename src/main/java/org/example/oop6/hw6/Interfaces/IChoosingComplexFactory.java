package org.example.oop6.hw6.Interfaces;

import org.example.oop6.hw6.Complex.Complex;

import java.util.List;

public interface IChoosingComplexFactory {
    IModelComplex chooseModelComplex(String sign, List<Complex> operandList);
}