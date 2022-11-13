package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OpenLockTest {
    @Test
    public void openLock() {
        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        assertEquals(6, new OpenLock().openLock(deadends, "0202"));
    }
}