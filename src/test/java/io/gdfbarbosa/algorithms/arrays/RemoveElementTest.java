package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {
    @Test
    public void removeElement() {
        RemoveElement removeElement = new RemoveElement();
        assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3}, 3));
    }
}