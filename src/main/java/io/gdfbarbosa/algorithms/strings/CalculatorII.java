package io.gdfbarbosa.algorithms.strings;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Basic calculator using stack.
 * <a href="https://leetcode.com/problems/basic-calculator-ii/">227. Basic Calculator II</a>
 */
public class CalculatorII {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int number = 0;
        int n = s.length();
        char operation = '+';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = (number * 10) + (c - '0');
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == n - 1) {
                if (operation == '+') {
                    stack.push(number);
                } else if (operation == '-') {
                    stack.push(-number);
                } else if (operation == '*') {
                    stack.push(stack.pop() * number);
                } else if (operation == '/' && number != 0) {
                    stack.push(stack.pop() / number);
                }
                operation = c;
                number = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
