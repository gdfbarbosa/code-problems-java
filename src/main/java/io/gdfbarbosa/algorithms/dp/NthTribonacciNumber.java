package io.gdfbarbosa.algorithms.dp;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number/">1137. N-th Tribonacci Number</a>
 */
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 1;
        int sum = a + b + c;
        for (int i = 3; i < n; i++) {
            a = b;
            b = c;
            c = sum;
            sum = a + b + c;
        }
        return sum;
    }
}
