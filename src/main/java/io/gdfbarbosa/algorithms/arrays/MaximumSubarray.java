package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */
public class MaximumSubarray {
    // dynamic programming, kadane's algorithm
    public int maxSubArray(int[] nums) {
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        return maxSubarray;
    }
}
