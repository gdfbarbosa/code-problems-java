package io.gdfbarbosa.algorithms.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/unique-email-addresses/">929. Unique Email Addresses</a>
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> list = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            for (char c : email.toCharArray()) {
                if (c == '+' || c == '@') break;
                if (c != '.') sb.append(c);
            }

            StringBuilder domainName = new StringBuilder();
            for (int i = email.length() - 1; i > 0; i--) {
                if (email.charAt(i) == '@') break;
                domainName.append(email.charAt(i));
            }
            domainName.reverse();
            sb.append('@').append(domainName);

            list.add(sb.toString());
        }
        return list.size();
    }
}
