package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeBuySellStock4Test {

    @Test
    public void maxProfit1() {
        BestTimeBuySellStock4 bestTimeBuySellStock4 = new BestTimeBuySellStock4();
        assertEquals(2, bestTimeBuySellStock4.maxProfit(2, new int[]{2,4,1}));
    }

    @Test
    public void maxProfit2() {
        BestTimeBuySellStock4 bestTimeBuySellStock4 = new BestTimeBuySellStock4();
        assertEquals(7, bestTimeBuySellStock4.maxProfit(2, new int[]{3,2,6,5,0,3}));
    }
}