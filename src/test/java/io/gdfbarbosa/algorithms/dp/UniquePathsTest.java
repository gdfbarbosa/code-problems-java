package io.gdfbarbosa.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {
    UniquePaths uniquePaths = new UniquePaths();
    @Test
    public void test1() {
        Assert.assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }

    @Test
    public void test2() {
        Assert.assertEquals(3, uniquePaths.uniquePaths(3, 2));
    }
}
