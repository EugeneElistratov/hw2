package org.example.oop6.hw6.Complex;

public class ComplexCreater {

    public Complex createComplex(String str) {
        str = str.substring(0, str.length() - 1);
        if (str.contains("+")) {
            String[] arr = str.split("\\+");
            return new Complex(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]));
        } else {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                String[] arr = str.split("\\-");
                return new Complex(-Double.parseDouble(arr[0]), -Double.parseDouble(arr[1]));
            } else {
                String[] arr = str.split("\\-");
                return new Complex(Double.parseDouble(arr[0]), -Double.parseDouble(arr[1]));
            }
        }
    }
}