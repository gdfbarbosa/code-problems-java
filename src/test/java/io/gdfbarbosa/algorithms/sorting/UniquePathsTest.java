package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.dp.UniquePaths;
import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {
    @Test
    public void test() {
        UniquePaths uniquePaths = new UniquePaths();
        Assert.assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }
}
