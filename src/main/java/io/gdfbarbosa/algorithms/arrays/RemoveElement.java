package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // ignore array item with val
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j; // return new length
    }
}
