package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[head++] = ')';
            } else if (c == '{') {
                stack[head++] = '}';
            } else if (c == '[') {
                stack[head++] = ']';
            } else if (head == 0 || stack[--head] != c) {
                return false;
            }
        }
        return head == 0;
    }
}
