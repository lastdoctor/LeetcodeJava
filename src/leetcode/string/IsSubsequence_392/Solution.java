package leetcode.string.IsSubsequence_392;

// Space complexity O(1) Space complexity On
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

class Solution1 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        if (t.length() == 0 && s.length() == 0) return true;

        int sp = 0, tp = 0;
        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            if (sp >= s.length()) {
                return true;
            }

            tp++;
        }


        return false;
    }
}
