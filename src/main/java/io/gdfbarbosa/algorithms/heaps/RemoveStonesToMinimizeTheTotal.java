package io.gdfbarbosa.algorithms.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/">1962. Remove Stones to Minimize the Total</a>
 */
public class RemoveStonesToMinimizeTheTotal {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> queue = new PriorityQueue<>(piles.length, Comparator.reverseOrder());

        for (int pile : piles) queue.add(pile); // O(n)

        // O(k log n)
        while (k > 0) {
            int value = queue.remove(); // log n
            queue.add(value - value/2); // log n
            k--;
        }

        int sum = 0;
        // O(n)
        for (int num : queue) sum += num;

        return sum;
    }
}
