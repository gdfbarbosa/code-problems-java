package io.gdfbarbosa.algorithms.stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {
    @Test
    public void dailyTemperatures1() {
        assertArrayEquals(new int[]{3,2,1,0}, new DailyTemperatures().dailyTemperatures(new int[]{30,25,14,45}));
    }

    @Test
    public void dailyTemperatures2() {
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, new DailyTemperatures().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }
}