package io.gdfbarbosa.algorithms.math;

public class MultiplyTwoStrings {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length()+num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                result[i+j+1] += product;
                result[i+j] += result[i+j+1] / 10;
                result[i+j+1] %= 10;
            }
        }
        StringBuilder numberResult = new StringBuilder();
        for (Integer i : result) {
            numberResult.append(numberResult.length() == 0 && i == 0 ? "" : i.toString());
        }
        if (numberResult.length() == 0) {
            return "0";
        }
        return numberResult.toString();
    }
}
