package io.gdfbarbosa.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeBuySellStockTest {
    @Test
    public void test1() {
        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        Assert.assertEquals(5, bestTimeBuySellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2() {
        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        Assert.assertEquals(0, bestTimeBuySellStock.maxProfit(new int[]{7,6,4,3,1}));
    }
}
