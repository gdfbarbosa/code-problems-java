package io.gdfbarbosa.algorithms.arrays;

/**
 * Find pivot index in array.
 *
 * <a href="https://leetcode.com/problems/find-pivot-index/">724. Find Pivot Index</a>
 */
public class FindPIvotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum - leftSum - nums[i] == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
