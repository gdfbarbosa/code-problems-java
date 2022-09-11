package io.gdfbarbosa.algorithms.math;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/reordered-power-of-2/">869. Reordered Power of 2</a>
 */
public class ReorderedPowerOfTwo {
    public int reorderedPowerOf2(int N) {
        int[] A = count(N);
        for (int i = 0; i < 31; ++i) {
            int powerOfTwo = 1 << i;
            if (Arrays.equals(A, count(powerOfTwo)))
                return powerOfTwo;
        }
        return -1;
    }

    // Returns the count of digits of N
    // Eg. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }
}
