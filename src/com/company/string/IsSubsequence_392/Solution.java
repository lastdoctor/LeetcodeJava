package com.company.string.IsSubsequence_392;

// Space complexity O(1) Space complexity On^2
// Input: s = "abc", t = "ahbgdc"
// Output: true
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }

        int si = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(si) == t.charAt(i)) {
                si++;
            }
            if (si >= s.length()) {
                return true;
            }
        }
        return false;
    }
}


