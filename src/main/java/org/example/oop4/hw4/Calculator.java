package org.example.oop4.hw4;
import java.util.List;

public class Calculator<N> {

    public double sum(List<? extends Number> numbers) { // любой тип, наследуемый от Number.
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double div(List<? extends Number> numbers) {
        double div = 1.0;
        for (Number number : numbers) {
            div /= number.doubleValue();
        }
        return div;
    }

    public double multiply(List<? extends Number> numbers) {
        double multi = 1.0;
        for (Number number : numbers) {
            multi *= number.doubleValue();
        }
        return multi;
    }

}

