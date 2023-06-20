package org.example.HomeWork.hw4.Ex4_2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
* https://leetcode.com/problems/valid-parentheses/
* 20. Valid Parentheses
* Given a string s containing just the characters '(', ')',
* '{', '}', '[' and ']', determine if the input string is valid.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки");
        String text1 = sc.nextLine();
        sc.close();
        System.out.println(check(text1));
    }

    public static boolean check(String s) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                    s.charAt(i) == '{' ||
                    s.charAt(i) == '[')
                list.add(s.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (s.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (s.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else if (s.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
