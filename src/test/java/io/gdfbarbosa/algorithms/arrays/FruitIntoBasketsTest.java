package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitIntoBasketsTest {

    @Test
    public void totalFruit() {
        FruitIntoBaskets fruitIntoBaskets = new FruitIntoBaskets();
        assertEquals(5, fruitIntoBaskets.totalFruit(new int[]{1,2,3,4,3,4,3,6,7}));
    }
}