package io.gdfbarbosa.algorithms.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/maximum-units-on-a-truck/description/">1710. Maximum Units on a Truck</a>
 */
public class MaximumUnitsTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        queue.addAll(Arrays.asList(boxTypes)); // O (n log n)
        int unitCount = 0;
        while (!queue.isEmpty()) {
            int[] top = queue.poll(); // 0 (log n)
            int boxCount = Math.min(truckSize, top[0]);
            unitCount += boxCount * top[1];
            truckSize -= boxCount;
            if (truckSize == 0)
                break;
        }
        return unitCount;
    }
}

// Time: O (n log n)
// Space: O (n)