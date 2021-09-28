package com.company.string.UniqueEmailAddresses_929;

import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            StringBuilder cleanMail = new StringBuilder();
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);

                if (c == '+' || c == '@') break;

                if (c != '.') cleanMail.append(c);
            }

            StringBuilder domainName = new StringBuilder();
            for (int i = email.length() - 1; i >= 0; i--) {
                char c = email.charAt(i);
                domainName.append(c);
                if (c == '@') break;
            }

            domainName.reverse();
            cleanMail.append(domainName);
            set.add(cleanMail.toString());

        }

        return set.size();
    }
}