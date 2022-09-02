package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.strings.BackspaceStringCompare;
import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompareTest {
    @Test
    public void test() {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        Assert.assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void test2() {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        Assert.assertFalse(backspaceStringCompare.backspaceCompare("a#c", "ad#c"));
    }
}
