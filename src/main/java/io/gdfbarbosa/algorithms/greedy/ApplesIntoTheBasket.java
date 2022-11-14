package io.gdfbarbosa.algorithms.greedy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/how-many-apples-can-you-put-into-the-basket/description/"></a>
 */
public class ApplesIntoTheBasket {
    public int maxNumberOfApples(int[] weight) {
        int sum = 0;
        int count = 0;
        Arrays.sort(weight);
        for (int w : weight) {
            sum += w;
            if (sum <= 5000) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
