package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {
    @Test()
    public void test() {
        CountingValleys countingValleys = new CountingValleys();
        Assert.assertEquals(1, countingValleys.countingValleys(8, "UDDDUDUU"));
    }
}
