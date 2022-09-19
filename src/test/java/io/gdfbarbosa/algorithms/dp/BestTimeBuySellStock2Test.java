package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeBuySellStock2Test {
    @Test
    public void maxProfit1() {
        BestTimeBuySellStock2 bestTimeBuySellStock2 = new BestTimeBuySellStock2();
        assertEquals(7, bestTimeBuySellStock2.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void maxProfit2() {
        BestTimeBuySellStock2 bestTimeBuySellStock2 = new BestTimeBuySellStock2();
        assertEquals(4, bestTimeBuySellStock2.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void maxProfit3() {
        BestTimeBuySellStock2 bestTimeBuySellStock2 = new BestTimeBuySellStock2();
        assertEquals(0, bestTimeBuySellStock2.maxProfit(new int[]{7,6,4,3,1}));
    }
}