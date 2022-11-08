package io.gdfbarbosa.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumCostConnectSticksTest {
    @Test
    public void connectSticks1() {
        MinimumCostConnectSticks minimumCostConnectSticks = new MinimumCostConnectSticks();
        assertEquals(14, minimumCostConnectSticks.connectSticks(new int[]{2,4,3}));
    }

    @Test
    public void connectSticks2() {
        MinimumCostConnectSticks minimumCostConnectSticks = new MinimumCostConnectSticks();
        assertEquals(30, minimumCostConnectSticks.connectSticks(new int[]{1,8,3,5}));
    }

    @Test
    public void connectSticks3() {
        MinimumCostConnectSticks minimumCostConnectSticks = new MinimumCostConnectSticks();
        assertEquals(0, minimumCostConnectSticks.connectSticks(new int[]{5}));
    }
}