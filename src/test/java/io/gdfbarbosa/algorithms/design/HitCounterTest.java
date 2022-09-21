package io.gdfbarbosa.algorithms.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class HitCounterTest {
    @Test
    public void hit1() {
        HitCounter hitCounter = new HitCounter();
        hitCounter.hit(1);       // hit at timestamp 1.
        hitCounter.hit(2);       // hit at timestamp 2.
        hitCounter.hit(3);       // hit at timestamp 3.
        assertEquals(3, hitCounter.getHits(4));   // get hits at timestamp 4, return 3.
        hitCounter.hit(300);     // hit at timestamp 300.
        assertEquals(4, hitCounter.getHits(300)); // get hits at timestamp 300, return 4.
        assertEquals(3, hitCounter.getHits(301)); // get hits at timestamp 301, return 3.
    }
}