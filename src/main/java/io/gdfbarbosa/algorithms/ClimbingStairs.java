package io.gdfbarbosa.algorithms;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int fn_2 = 1; // f(0) = 0
        int fn_1 = 2; // f(1) = 1
        int fn = 0;
        for (int i = 2; i < n; i++) {
            fn = fn_1 + fn_2; // fibonacci sum
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        for (int i = 0; i <= 45; i++) {
            System.out.println("i = " + i + " totalWays = " + climbingStairs.climbStairs(i));
        }
    }
}
