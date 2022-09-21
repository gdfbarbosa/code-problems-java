package io.gdfbarbosa.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BagOfTokensTest {
    @Test
    public void bagOfTokensScore1() {
        BagOfTokens bagOfTokens = new BagOfTokens();
        assertEquals(0, bagOfTokens.bagOfTokensScore(new int[]{100}, 50));
    }

    @Test
    public void bagOfTokensScore2() {
        BagOfTokens bagOfTokens = new BagOfTokens();
        assertEquals(1, bagOfTokens.bagOfTokensScore(new int[]{100,200}, 150));
    }

    @Test
    public void bagOfTokensScore3() {
        BagOfTokens bagOfTokens = new BagOfTokens();
        assertEquals(2, bagOfTokens.bagOfTokensScore(new int[]{100,200,300,400}, 200));
    }
}