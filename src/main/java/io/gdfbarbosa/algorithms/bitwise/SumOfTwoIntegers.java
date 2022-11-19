package io.gdfbarbosa.algorithms.bitwise;

/**
 * <a href="https://leetcode.com/problems/sum-of-two-integers/description/">371. Sum of Two Integers</a>
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) { // b is the carry
            int carry = a & b;
            a = a ^ b; // XOR is the sum
            b = carry << 1; // carry out one digit to left
        }
        return a;
    }
}
