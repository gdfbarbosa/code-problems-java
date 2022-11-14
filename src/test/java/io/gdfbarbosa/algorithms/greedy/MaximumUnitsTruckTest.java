package io.gdfbarbosa.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumUnitsTruckTest {
    @Test
    public void maximumUnits1() {
        assertEquals(8, new MaximumUnitsTruck().maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4));
    }

    @Test
    public void maximumUnits2() {
        assertEquals(91, new MaximumUnitsTruck().maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10));
    }
}