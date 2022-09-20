package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeBuySellStock3Test {
    @Test
    public void maxProfit1() {
        BestTimeBuySellStock3 bestTimeBuySellStock3 = new BestTimeBuySellStock3();
        assertEquals(6, bestTimeBuySellStock3.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    @Test
    public void maxProfit2() {
        BestTimeBuySellStock3 bestTimeBuySellStock3 = new BestTimeBuySellStock3();
        assertEquals(4, bestTimeBuySellStock3.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void maxProfit3() {
        BestTimeBuySellStock3 bestTimeBuySellStock3 = new BestTimeBuySellStock3();
        assertEquals(0, bestTimeBuySellStock3.maxProfit(new int[]{7,6,4,3,1}));
    }
}