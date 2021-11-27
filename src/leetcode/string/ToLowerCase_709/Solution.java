package leetcode.string.ToLowerCase_709;

class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (IsUpper(c)) {
                ans.append(Character.toChars( + 32));
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    boolean IsUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
