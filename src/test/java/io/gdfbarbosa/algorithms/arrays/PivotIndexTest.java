package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndexTest {
    @Test()
    public void pivotTest1() {
        int[] array = new int[] {1,7,3,6,5,6};
        FindPIvotIndex pivotIndex = new FindPIvotIndex();
        Assert.assertEquals(3, pivotIndex.pivotIndex(array));
    }

    @Test()
    public void pivotTest2() {
        int[] array = new int[] {1,2,3};
        FindPIvotIndex pivotIndex = new FindPIvotIndex();
        Assert.assertEquals(-1, pivotIndex.pivotIndex(array));
    }
}
