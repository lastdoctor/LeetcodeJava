package leetcode.string.NumberOfStringsThatAppearAsSubstringsInWord_1967;

// Space O(n2)
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (String str : patterns) {
            if (word.contains(str)) ans++;
        }
        return ans;
    }
}
