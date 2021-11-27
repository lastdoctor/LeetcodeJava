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
        if (s.equals("")) return true;
        int sindex = 0, tindex = 0;
        while(sindex < s.length() && tindex < t.length()){
            if(s.charAt(sindex) == t.charAt(tindex)){
                sindex++;
            }
            if(sindex >= s.length()){
                return true;
            }
            tindex++;
        }
        return false;
    }
}
