package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BombEnemyTest {
    @Test
    public void maxKilledEnemies() {
        assertEquals(3, new BombEnemy().maxKilledEnemies(new char[][]
                {{'0','E','0','0'}, {'E','0','W','E'}, {'0','E','0','0'}}));
    }
}