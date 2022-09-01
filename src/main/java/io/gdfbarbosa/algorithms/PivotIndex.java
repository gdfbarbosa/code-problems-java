package io.gdfbarbosa.algorithms;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i =0; i < nums.length; i++) {
            sum += nums[i];
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
