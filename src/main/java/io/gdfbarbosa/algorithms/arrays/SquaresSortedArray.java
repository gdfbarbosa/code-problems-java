package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/description/">977. Squares of a Sorted Array</a>
 */
public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n -1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right--];
            } else {
                square = nums[left++];
            }
            squares[i] = square * square;
        }
        return squares;
    }
}
