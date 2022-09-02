package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class StampingTheSequenceTest {
    @Test()
    public void test() {
        StampingTheSequence stampingTheSequence = new StampingTheSequence();
        Assert.assertArrayEquals(new int[]{0,2}, stampingTheSequence.movesToStamp("abc", "ababc"));
    }

    @Test()
    public void test2() {
        StampingTheSequence stampingTheSequence = new StampingTheSequence();
        Assert.assertArrayEquals(new int[]{0,4,2}, stampingTheSequence.movesToStamp("abc", "ababcbc"));
    }
}
