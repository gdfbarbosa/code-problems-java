package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/powx-n/">50. Pow(x, n)</a>
 */
public class PowXN {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
        }
        return ans;
    }
}
