package io.gdfbarbosa.algorithms.dp;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/target-sum/description/">494. Target Sum</a>
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int targetSum) {
        int total = Arrays.stream(nums).sum();
        int[][] dp = new int[nums.length][2 * total + 1];
        dp[0][nums[0] + total] = 1;
        dp[0][-nums[0] + total] += 1;

        for (int i = 1; i < nums.length; i++) {
            for (int sum = -total; sum <= total; sum++) {
                if (dp[i - 1][sum + total] > 0) {
                    dp[i][sum + nums[i] + total] += dp[i - 1][sum + total];
                    dp[i][sum - nums[i] + total] += dp[i - 1][sum + total];
                }
            }
        }

        return Math.abs(targetSum) > total ? 0 : dp[nums.length - 1][targetSum + total];
    }
}
