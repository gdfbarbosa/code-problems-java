package io.gdfbarbosa.algorithms;

public class Base2conversion {
    public String convertToBase2(int n) {
        String base2 = "";
        int bit = -1;
        int quotient = -1;
        while (n > 0) {
            bit = n % 2;
            quotient = n / 2;
            base2 = bit + base2;
            n = quotient;
        }
        return base2;
    }
}
