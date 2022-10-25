package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/license-key-formatting">482. License Key Formatting</a>
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                continue;
            }
            if (sb.length() % (k+1) == k) {
                sb.append("-");
            }
            sb.append(s.charAt(i));
        }
        return sb.reverse().toString().toUpperCase();
    }
}
