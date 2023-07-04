package org.example.oop3.hw3;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            charList.add(Integer.toString(i));
        }
        return charList;
    }
}