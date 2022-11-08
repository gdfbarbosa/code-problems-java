package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/richest-customer-wealth/">1672. Richest Customer Wealth</a>
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] cust : accounts) {
            int total = 0;
            for (int val : cust) {
                total += val;
            }
            max = Math.max(max, total);
        }
        return max;
    }
}
