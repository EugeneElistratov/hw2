package org.example.oop55.hw55.Core.Model;

public class Binary {
    public String toBinary(String num) {
        Integer result = Integer.valueOf(num);
        return Integer.toBinaryString(result);
    }
}
