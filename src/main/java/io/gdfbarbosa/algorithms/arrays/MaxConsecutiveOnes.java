package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/max-consecutive-ones/description/">485. Max Consecutive Ones</a>
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
