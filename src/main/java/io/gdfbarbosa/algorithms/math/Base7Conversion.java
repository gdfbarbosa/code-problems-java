package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/base-7/">504. Base 7</a>
 */
public class Base7Conversion {
    public String convertToBase7(int num) {
        boolean negative = num < 0;
        if (negative) {
            num = Math.abs(num);
        }

        int ans = 0;
        int remainder;
        int i = 0;
        do {
            remainder = num % 7;
            num = num / 7;
            ans += (remainder * Math.pow(10, i++));
        } while (num > 0);
        return Integer.toString(negative ? (-1*ans) : ans);
    }
}
