package org.example.oop3.hw3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Answer {

    private String userInput;
    private Integer cow;
    private Integer bull;
    static int count = 1;

    public Answer(String userInput, Integer cow, Integer bull) {
        this.userInput = userInput;
        this.cow = cow;
        this.bull = bull;
        count++;
    }
}