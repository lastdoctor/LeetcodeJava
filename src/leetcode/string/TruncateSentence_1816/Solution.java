package leetcode.string.TruncateSentence_1816;

// Time O(n)
// Space O(n)
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (k == 0) break;
            if (c == ' ') k--;
            ans.append(c);
        }
        return ans.toString().trim();
    }
}
