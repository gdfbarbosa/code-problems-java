package io.gdfbarbosa.algorithms.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickFindTest {
    @Test
    public void test1() {
        QuickFind quickFind = new QuickFind(7);
        quickFind.union(0, 1);
        quickFind.union(1, 3);
        quickFind.union(1, 4);

        quickFind.union(2, 5);
        quickFind.union(2, 6);

        assertTrue(quickFind.connected(0, 3));
        assertTrue(quickFind.connected(1, 4));

        assertFalse(quickFind.connected(1, 2));
        assertFalse(quickFind.connected(0, 6));
    }
}