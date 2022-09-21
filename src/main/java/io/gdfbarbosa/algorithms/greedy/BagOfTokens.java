package io.gdfbarbosa.algorithms.greedy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/bag-of-tokens/">948. Bag of Tokens</a>
 */
public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int P) {
        // the array needs to be sorted
        Arrays.sort(tokens);
        // use two pointers, taking both bigger values and lower values
        int lo = 0, hi = tokens.length - 1;
        int points = 0, ans = 0;
        while (lo <= hi && (P >= tokens[lo] || points > 0)) {
            // If your current power is at least tokens[i],
            // you may play the ith token face up,
            // losing tokens[i] power and gaining 1 score.
            while (lo <= hi && P >= tokens[lo]) {
                P -= tokens[lo++];
                points++;
            }
            // you can avoid second condition on the last pass
            // as you would loose one more point
            ans = Math.max(ans, points);
            // If your current score is at least 1,
            // you may play the ith token face down,
            // gaining tokens[i] power and losing 1 score.
            if (lo <= hi && points > 0) {
                P += tokens[hi--];
                points--;
            }
        }
        return ans;
    }
}

