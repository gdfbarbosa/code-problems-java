package io.gdfbarbosa.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Sliding window using a map and two pointers technique.
 * <a href="https://leetcode.com/problems/fruit-into-baskets">904. Fruit Into Baskets</a>
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;
        int i = 0;
        for (int j = 0; j < tree.length; ++j) {
            count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
            while (count.size() > 2) { // move slide window until max elements is 2
                count.put(tree[i], count.get(tree[i]) - 1);
                if (count.get(tree[i]) == 0) count.remove(tree[i]);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
