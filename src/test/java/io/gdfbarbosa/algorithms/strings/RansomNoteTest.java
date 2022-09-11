package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {
    RansomNote ransomNote = new RansomNote();
    @Test
    public void test1() {
        Assert.assertFalse(ransomNote.canConstruct("a", "b"));
    }
    @Test
    public void test2() {
        Assert.assertTrue(ransomNote.canConstruct("aa", "aab"));
    }
}
