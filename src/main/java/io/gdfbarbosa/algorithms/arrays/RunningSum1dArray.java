package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/">1480. Running Sum of 1d Array</a>
 */
public class RunningSum1dArray {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int leftSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            leftSum = leftSum + nums[i];
            runningSum[i] = leftSum;
        }
        return runningSum;
    }
}
