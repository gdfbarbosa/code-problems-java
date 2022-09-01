package io.gdfbarbosa.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CutRod {
    Map<Integer, Integer> mapResults = new HashMap<>();
    public int cutRod(Integer[] prices, int n) {
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
