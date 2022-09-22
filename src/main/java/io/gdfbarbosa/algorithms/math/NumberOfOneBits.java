package io.gdfbarbosa.algorithms.math;

/**
 * Calculates number of 1 bits, using the bit manipulation technique
 * to flip the least significant 1 bit several times.
 * <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a>
 */
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int bits = 0;
        while (n != 0) {
            bits++;
            n = n & (n - 1);
        }
        return bits;
    }
}
