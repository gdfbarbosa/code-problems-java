package io.gdfbarbosa.algorithms;

/**
 * Find pivot index in array.
 *
 * <a href="http://www.codinghorror.com/blog/2007/12/sorting-for-humans-natural-sort-order.html">
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
