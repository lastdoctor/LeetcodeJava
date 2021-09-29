package com.company.string.UniqueEmailAddresses_929;

import java.util.*;

// Space complexity O(n^2)
// Time complexity O(n^2)
// Method Brute force
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

// Space O(n^2)
// Time O(n^2)
class Solution1 {
    public int numUniqueEmails(String[] emails) {
        // hash set to store all the unique emails
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            // split into two parts local and domain
            String[] parts = email.split("@");

            // split local by '+'
            String[] local = parts[0].split("\\+");

            // remove all '.', and concatenate '@' and append domain
            uniqueEmails.add(local[0].replace(".", "") + "@" + parts[1]);
        }

        return uniqueEmails.size();
    }
}