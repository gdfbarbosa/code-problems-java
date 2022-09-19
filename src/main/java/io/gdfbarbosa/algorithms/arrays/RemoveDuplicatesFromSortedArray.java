package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        int n = nums.length;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
