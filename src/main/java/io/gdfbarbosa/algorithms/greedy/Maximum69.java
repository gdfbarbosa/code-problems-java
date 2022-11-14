package io.gdfbarbosa.algorithms.greedy;

/**
 * <a href="https://leetcode.com/problems/maximum-69-number/description/">1323. Maximum 69 Number</a>
 */
public class Maximum69 {
    public int maximum69Number(int num) {
        int sixIndex = -1;
        int index = 0;
        int numCopy = num;
        while (numCopy > 0) {
            if (numCopy % 10 == 6) {
                sixIndex = index;
            }
            numCopy /= 10;
            index++;
        }
        return sixIndex != -1 ? num + (3 * (int) Math.pow(10, sixIndex)) : num;
    }
}
