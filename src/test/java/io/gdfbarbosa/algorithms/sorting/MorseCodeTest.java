package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.strings.MorseCode;
import org.junit.Assert;
import org.junit.Test;

public class MorseCodeTest {
    @Test
    public void test() {
        MorseCode morseCode = new MorseCode();
        Assert.assertEquals(2, morseCode.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }
}
