package io.gdfbarbosa.algorithms.dp;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>
 */
public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lastPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            int profit = price - lastPrice;
            lastPrice = Math.min(lastPrice, price);
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
