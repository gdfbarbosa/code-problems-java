package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovingAverageFromDataStreamTest {
    @Test
    public void nextTest1() {
        MovingAverageFromDataStream movingAverage = new MovingAverageFromDataStream(3);
        double delta = 0.00001;
        assertEquals(1.0, movingAverage.next(1), delta); // return 1.0 = 1 / 1
        assertEquals(5.5, movingAverage.next(10), delta); // return 5.5 = (1 + 10) / 2
        assertEquals(4.66667, movingAverage.next(3), delta); // return 4.66667 = (1 + 10 + 3) / 3
        assertEquals(6.0, movingAverage.next(5), delta); // return 6.0 = (10 + 3 + 5) / 3
    }
}