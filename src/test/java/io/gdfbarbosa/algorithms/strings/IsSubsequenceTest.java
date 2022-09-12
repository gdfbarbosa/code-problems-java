package io.gdfbarbosa.algorithms.strings;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class IsSubsequenceTest {
    @Test
    public void test1() {
        IsSubsequence isSubsequence = new IsSubsequence();
        Assert.assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void test2() {
        IsSubsequence isSubsequence = new IsSubsequence();
        Assert.assertFalse(isSubsequence.isSubsequence("ftgd", "ahbgdc"));
    }
}
