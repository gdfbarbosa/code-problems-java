package io.gdfbarbosa.algorithms.math;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">150. Evaluate Reverse Polish Notation</>
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        for (String token : tokens) {
            if (operators.contains(token)) {
                int y = operands.pop();
                int x = operands.pop();
                switch (token) {
                    case "+" -> operands.push(x + y);
                    case "-" -> operands.push(x - y);
                    case "*" -> operands.push(x * y);
                    case "/" -> operands.push(x / y);
                }
            } else {
                operands.push(Integer.valueOf(token));
            }
        }
        return operands.pop();
    }
}
