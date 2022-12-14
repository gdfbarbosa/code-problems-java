package io.gdfbarbosa.algorithms.dp;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>
 */
public class FibonacciIterative {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // keep f(n-1) and f(n-2) values
        int a = 0, b = 1;
        int sum = 0;
        while (n-- > 1) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
