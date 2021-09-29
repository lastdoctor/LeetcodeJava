package com.company.string.DIStringMatch_942;

class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int start = 0, end = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') ans[i] = start++;
            else ans[i] = end--;
        }
        ans[s.length()] = end;
        return ans;
    }
}
