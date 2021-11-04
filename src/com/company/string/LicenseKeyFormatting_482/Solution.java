package com.company.string.LicenseKeyFormatting_482;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (ans.length() % (k + 1) == k) {
                    ans.append('-');
                }
                ans.append(s.charAt(i));
            }
        }

        return ans.reverse().toString().toUpperCase();
    }
}
