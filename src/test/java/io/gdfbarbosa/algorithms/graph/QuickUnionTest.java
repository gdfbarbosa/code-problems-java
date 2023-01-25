package io.gdfbarbosa.algorithms.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickUnionTest {
    @Test
    public void quickUnionTest() {
        QuickUnion quickUnion = new QuickUnion(7);
        quickUnion.union(0, 1);
        quickUnion.union(1, 3);
        quickUnion.union(1, 4);

        quickUnion.union(2, 5);
        quickUnion.union(2, 6);

        assertTrue(quickUnion.connected(0, 3));
        assertTrue(quickUnion.connected(1, 4));

        assertFalse(quickUnion.connected(1, 2));
        assertFalse(quickUnion.connected(0, 6));
    }
}