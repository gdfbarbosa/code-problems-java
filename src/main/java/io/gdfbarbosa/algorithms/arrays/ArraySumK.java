package io.gdfbarbosa.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraySumK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mapDiff = new HashMap<>();
        int totalArrays = 0;
        int leftSum = 0;
        mapDiff.put(0,1);
        for (int num : nums) {
            leftSum += num;
            if (mapDiff.containsKey(leftSum-k)) {
                totalArrays += mapDiff.get(leftSum-k);
            }
            mapDiff.put(leftSum, mapDiff.getOrDefault(leftSum, 0) + 1);
        }
        return totalArrays;
    }
}
