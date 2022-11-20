package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/">1295. Find Numbers with Even Number of Digits</a>
 */
public class FindNumbersEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int totalEven = 0;
        for (int num : nums) {
            int digits = 0;
            if (num == 0) {
                digits = 1;
            }
            while (num > 0) {
                num /= 10;
                digits++;
            }
            if (digits % 2 == 0) totalEven++;
        }
        return totalEven;
    }
}
