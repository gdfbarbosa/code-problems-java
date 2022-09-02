package io.gdfbarbosa.algorithms.arrays;

import io.gdfbarbosa.algorithms.arrays.FindPIvotIndex;
import org.junit.Assert;
import org.junit.Test;

public class FindPivotIndexTest {
    @Test
    public void test() {
        FindPIvotIndex pivotIndex = new FindPIvotIndex();
        Assert.assertEquals(3, pivotIndex.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
