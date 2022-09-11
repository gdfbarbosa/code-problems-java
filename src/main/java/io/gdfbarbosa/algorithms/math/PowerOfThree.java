package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/power-of-three/">326. Power of Three</a>
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
