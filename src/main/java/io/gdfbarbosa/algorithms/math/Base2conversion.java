package io.gdfbarbosa.algorithms.math;

public class Base2conversion {
    public String convertToBase2(int n) {
        StringBuilder base2 = new StringBuilder();
        int bit;
        int quotient;
        while (n > 0) {
            bit = n % 2;
            quotient = n / 2;
            base2.insert(0, bit);
            n = quotient;
        }
        return base2.toString();
    }
}
