package io.gdfbarbosa.algorithms.bitwise;

/**
 * Approach using bitwise operations.
 * Credits to <a href="https://leetcode.com/problems/single-number/solutions/43201/easy-java-solution-tell-you-why-using-bitwise-xor/?orderBy=most_votes">Nkeys</>
 * <a href="https://leetcode.com/problems/single-number/description/">136. Single Number</a>
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
