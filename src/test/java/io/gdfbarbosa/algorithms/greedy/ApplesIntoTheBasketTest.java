package io.gdfbarbosa.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesIntoTheBasketTest {
    @Test
    public void maxNumberOfApples1() {
        assertEquals(4, new ApplesIntoTheBasket().maxNumberOfApples(new int[]{100, 200, 150, 1000}));
    }

    @Test
    public void maxNumberOfApples2() {
        assertEquals(5, new ApplesIntoTheBasket().maxNumberOfApples(new int[]{900, 950, 800, 1000, 700, 800}));
    }
}