package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    @Test()
    public void testString1() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("ababc"));
        Assert.assertEquals(1, longestSubstring.lengthOfLongestSubstring("aaaaa"));
        Assert.assertEquals(4, longestSubstring.lengthOfLongestSubstring("abcdabc"));
        Assert.assertEquals(2, longestSubstring.lengthOfLongestSubstring("abba"));
    }

    @Test()
    public void testString2() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(1, longestSubstring.lengthOfLongestSubstring("aaaaa"));
    }

    @Test()
    public void testString3() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(4, longestSubstring.lengthOfLongestSubstring("abcdabc"));
    }

    @Test()
    public void testString4() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(2, longestSubstring.lengthOfLongestSubstring("abba"));
    }
}
