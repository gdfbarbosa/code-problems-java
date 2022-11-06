package io.gdfbarbosa.algorithms.strings;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Calculator using addition and subtraction, with parenthesis.
 * <a href="https://leetcode.com/problems/basic-calculator/description/">224. Basic Calculator</a>
 */
public class Calculator {
    public int calculate(String s) {
        int operand = 0;
        int n = 0;
        Deque<Object> stack = new ArrayDeque<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                // compute operand - in reverse order
                operand = (int) Math.pow(10, n++) * (ch - '0') + operand;
            } else if (!Character.isWhitespace(ch)) {
                if (n != 0) {
                    stack.push(operand);
                    n = 0;
                    operand = 0;
                }
                if (ch == '(') {
                    stack.push(evaluateExpr(stack));
                } else {
                    stack.push(ch);
                }
            }
        }
        if (n != 0) {
            stack.push(operand);
        }
        return evaluateExpr(stack);
    }

    private int evaluateExpr(Deque<Object> stack) {
        // edge case: eg. (-2)
        if (stack.isEmpty() || !(stack.peek() instanceof Integer)) {
            stack.push(0);
        }
        int res = (int) stack.pop();
        while (!stack.isEmpty() && (char) stack.peek() != ')') {
            char sign = (char) stack.pop();
            if (sign == '+') {
                res += (int) stack.pop();
            } else {
                res -= (int) stack.pop();
            }
        }
        // remove char ')'
        if (!stack.isEmpty() && (char) stack.peek() == ')') {
            stack.pop();
        }
        return res;
    }
}