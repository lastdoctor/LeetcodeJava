package leetcode.string.DetectCapital_520;

class Solution {
    private boolean isCap(char c ) {
        return  'A' <= c && c <= 'Z';
    }
    public boolean detectCapitalUse(String word) {
        int capCount = 0;
        for (char c : word.toCharArray()) if (isCap(c)) capCount++;

        if (capCount == 0) return true;
        else if (capCount == word.length()) return true;
        else if (capCount == 1 && isCap(word.charAt(0))) return true;
        return false;
    }
}
