package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.strings.UniqueMorseCodeWords;
import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTest {
    @Test
    public void test() {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        Assert.assertEquals(2, uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }
}
