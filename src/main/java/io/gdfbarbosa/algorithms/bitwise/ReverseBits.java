package io.gdfbarbosa.algorithms.bitwise;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/description/">190. Reverse Bits</a>
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        for (int shift = 32; shift > 0; shift--) {
            // extract least bit
            ans += (n & 1);
            // shift to left
            ans <<= 1;
            // shift bits for next iteration
            n >>= 1;
        }
        return ans;
    }
}
