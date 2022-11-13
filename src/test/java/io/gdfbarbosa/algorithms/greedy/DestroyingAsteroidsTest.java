package io.gdfbarbosa.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DestroyingAsteroidsTest {
    @Test
    public void asteroidsDestroyedSuccessfully() {
        DestroyingAsteroids destroyingAsteroids = new DestroyingAsteroids();
        assertTrue(destroyingAsteroids.asteroidsDestroyed(10, new int[]{3, 9, 19, 5, 21}));
    }

    @Test
    public void asteroidsDestroyedFailed() {
        DestroyingAsteroids destroyingAsteroids = new DestroyingAsteroids();
        assertFalse(destroyingAsteroids.asteroidsDestroyed(5, new int[]{4, 9, 23, 4}));
    }
}