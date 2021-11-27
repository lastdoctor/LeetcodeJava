package leetcode.string.DecryptStringFromAlphabetToIntegerMapping_1309;

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int firstDigit = Character.getNumericValue(s.charAt(i));

            if(i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int secondDigit = Character.getNumericValue(s.charAt(i + 1));
                ans.append((char)('j' + firstDigit * 10 + secondDigit - 10));
                i += 2;
            } else {
                ans.append((char)('a' +firstDigit - 1));
            }
        }

        return ans.toString();
    }
}
