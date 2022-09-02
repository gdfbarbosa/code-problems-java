package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test()
    public void test() {
        String[] array = new String[]{"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(array));
    }
}
