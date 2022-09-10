package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class AverageSalaryExcludeMinMaxTest {
    @Test
    public void test1() {
        AverageSalaryExcludeMinMax averageSalaryExcludeMinMax = new AverageSalaryExcludeMinMax();
        Assert.assertEquals(2500.00, averageSalaryExcludeMinMax.average(new int[]{4000,3000,1000,2000}), 0.0);
    }
}
