package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class CountOddNumbersInRangeTest {
    @Test
    public void testRange1() {
        CountOddNumbersInRange countOddNumbersInRange = new CountOddNumbersInRange();
        Assert.assertEquals(3, countOddNumbersInRange.countOdds(3,7));
    }

    @Test
    public void testRange2() {
        CountOddNumbersInRange countOddNumbersInRange = new CountOddNumbersInRange();
        Assert.assertEquals(3, countOddNumbersInRange.countOdds(3,8));
    }

    @Test
    public void testRange3() {
        CountOddNumbersInRange countOddNumbersInRange = new CountOddNumbersInRange();
        Assert.assertEquals(2, countOddNumbersInRange.countOdds(4,8));
    }
}
