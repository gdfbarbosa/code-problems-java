package io.gdfbarbosa.algorithms.strings;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/basic-calculator-iii/description/">772. Basic Calculator III</a>
 */
public class CalculatorIII {
    public int calculate(String s) {
        Queue<Character> queue = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch != ' ') queue.offer(ch);
        }
        queue.offer('+');
        return calc(queue);
    }

    public int calc(Queue<Character> queue) {
        char operation = '+';
        int num = 0;
        int res = 0;
        int lastNum = 0;
        while (!queue.isEmpty()) {
            char ch = queue.poll();
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '(') {
                num = calc(queue);
            } else {
                switch (operation) {
                    case '+' -> {
                        res += lastNum;
                        lastNum = num;
                    }
                    case '-' -> {
                        res += lastNum;
                        lastNum = -num;
                    }
                    case '*' -> {
                        if (num != 0) {
                            lastNum *= num;
                        }
                    }
                    case '/' -> {
                        if (num != 0) {
                            lastNum /= num;
                        }
                    }
                }
                if (ch == ')') break;

                operation = ch;
                num = 0;
            }
        }
        return res + lastNum;
    }
}
