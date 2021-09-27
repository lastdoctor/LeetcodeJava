package com.company.string.UniqueEmailAddresses_929;

import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);

                if (c == '.') {
                    continue;
                } else if (c == '+') {
                    while (email.charAt(i) != '@') i++;
                }

                temp.append(email.substring(i + 1));
            }
            set.add(temp.toString());

        }

        return set.size();
    }
}

