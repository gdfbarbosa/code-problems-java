package io.gdfbarbosa.algorithms.math;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">150. Evaluate Reverse Polish Notation</>
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> operands = new ArrayDeque<>();
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        for (String token : tokens) {
            if (operators.contains(token)) {
                int y = operands.pop();
                int x = operands.pop();
                switch (token) {
                    case "+": operands.push(x + y); break;
                    case "-": operands.push(x - y); break;
                    case "*": operands.push(x * y); break;
                    case "/": operands.push(x / y); break;
                }
            } else {
                operands.push(Integer.parseInt(token));
            }
        }
        return operands.pop();
    }
}
