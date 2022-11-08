package io.gdfbarbosa.algorithms.sorting;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/minimum-cost-to-connect-sticks/description/">1167. Minimum Cost to Connect Sticks</a>
 */
public class MinimumCostConnectSticks {
    public int connectSticks(int[] sticks) {
        int totalCost = 0;

        // edge case
        if (sticks.length <= 1) return 0;

        // min-heap
        Queue<Integer> heap = new PriorityQueue<>();

        for (int num : sticks) heap.add(num);

        while (heap.size() > 1) {
            int a = heap.poll();
            int b = heap.poll();
            int cost = a + b;
            totalCost += cost;
            heap.add(cost);
        }
        return totalCost;
    }
}
