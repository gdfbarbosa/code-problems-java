package io.gdfbarbosa.algorithms.arrays;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4. Median of Two Sorted Arrays</a>
 */
public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length;
        int j = nums2.length;

        int[] arr3 = new int[i + j];

        // Merge two array into one array
        System.arraycopy(nums1, 0, arr3, 0, i);
        System.arraycopy(nums2, 0, arr3, i, j);

        // Sort the merged array
        Arrays.sort(arr3);

        int n = arr3.length;

        // If length of array is even
        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = arr3[z];
            int q = arr3[z - 1];

            return (e + q) / 2.0;
        }
        // If length if array is odd
        else {
            return arr3[n / 2];
        }
    }
    public double findMedianSortedArraysBinarySearch(int[] nums1, int[] nums2) {
        // Check if num1 is smaller than num2
        // If not, then we will swap num1 with num2
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        // Lengths of two arrays
        int m = nums1.length;
        int n = nums2.length;
        // Pointers for binary search
        int start = 0;
        int end = m;
        // Binary search starts from here
        while (start <= end) {
            // Partitions of both the array
            int partitionNums1 = (start + end) / 2; // start where we want, better to start at the middle of the smaller array
            int partitionNums2 = (m + n + 1) / 2 - partitionNums1; // must satisfy this condition
            // Edge cases
            // If there are no elements left on the left side after partition
            int maxLeftNums1 = partitionNums1 == 0 ? Integer.MIN_VALUE : nums1[partitionNums1 - 1];
            // If there are no elements left on the right side after partition
            int minRightNums1 = partitionNums1 == m ? Integer.MAX_VALUE : nums1[partitionNums1];
            // Similarly for nums2
            int maxLeftNums2 = partitionNums2 == 0 ? Integer.MIN_VALUE : nums2[partitionNums2 - 1];
            int minRightNums2 = partitionNums2 == n ? Integer.MAX_VALUE : nums2[partitionNums2];
            // Check if we have found the match
            if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
                // Check if the combined array is of even/odd length
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
                } else {
                    return Math.max(maxLeftNums1, maxLeftNums2);
                }
            }
            // If we are too far on the right, we need to go to left side
            else if (maxLeftNums1 > minRightNums2) {
                end = partitionNums1 - 1;
            }
            // If we are too far on the left, we need to go to right side
            else {
                start = partitionNums1 + 1;
            }
        }
        // If we reach here, it means the arrays are not sorted
        throw new IllegalArgumentException();
    }
}
