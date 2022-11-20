package io.gdfbarbosa.algorithms.bitwise;

/**
 * <a href="https://leetcode.com/problems/counting-bits/description/">338. Counting Bits</a>
 */
public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i] = hammingWeight(i);
        }
        return ans;
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = n & (n - 1); // flip one bit
        }
        return count;
    }
}
