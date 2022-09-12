package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindTheTownJudgeTest {
    @Test
    public void test1() {
        FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
        Assert.assertEquals(2, findTheTownJudge.findJudge(2, new int[][]{{1,2}}));
    }
}
