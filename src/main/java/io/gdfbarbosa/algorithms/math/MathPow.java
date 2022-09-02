package io.gdfbarbosa.algorithms.math;

public class MathPow {
    public double myPow(double x, int n) {
        double res = x;
        while (n-- > 1) {
            res *= x;
        }
        return res;
    }
}
