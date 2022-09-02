package io.gdfbarbosa.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Rod Cutting algorithm as seen in "Introduction to Algorithms", 3rd edition (CLRS).
 * Alternative with memoization for optimized performance.
 */
public class RodCutting {
    Map<Integer, Integer> mapResults = new HashMap<>();
    public int cutRod(int[] prices, int n) {
        if (n == 0) { // base case
            return 0;
        }
        if (mapResults.containsKey(n)) {
            return mapResults.get(n);
        }
        int income = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            income = Math.max(income, prices[i] + cutRod(prices, n - i));
        }
        mapResults.putIfAbsent(n, income);
        return income;
    }
}
