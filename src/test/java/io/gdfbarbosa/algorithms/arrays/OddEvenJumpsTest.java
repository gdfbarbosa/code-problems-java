package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenJumpsTest {

    @Test
    public void oddEvenJumps() {
        OddEvenJumps oddEvenJumps = new OddEvenJumps();
        assertEquals(3, oddEvenJumps.oddEvenJumps(new int[]{5,1,3,4,2}));
    }
}