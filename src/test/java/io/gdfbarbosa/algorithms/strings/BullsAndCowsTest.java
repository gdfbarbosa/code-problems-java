package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class BullsAndCowsTest {
    @Test
    public void testAllDigitsDiffer() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        Assert.assertEquals("1A3B", bullsAndCows.getHint("1807", "7810"));
    }

    @Test
    public void testSomeDigitsTheSame() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        Assert.assertEquals("1A1B", bullsAndCows.getHint("1123  ", "0111"));
    }
}
