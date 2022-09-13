package io.gdfbarbosa.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
