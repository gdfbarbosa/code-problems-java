package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/solution/">88. Merge Sorted Array</a>
 */
public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        int j = 0, y = 0;
        for (int i = 0; i < m + n; i++) {
            if (y >= n || j < m && nums1Copy[j] < nums2[y]) {
                nums1[i] = nums1Copy[j++];
            } else {
                nums1[i] = nums2[y++];
            }
        }
        return nums1;
    }
}
