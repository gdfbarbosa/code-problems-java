package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/power-of-four/">342. Power of Four</a>
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n<0) return false;
        for(int i=0;i<32;i+=2)if(n==1<<i)return true;
        return false;
    }
}
