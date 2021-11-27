package leetcode.string.ValidPalindrome_125;

class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 <= p2) {
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p1))) p1++;
            while(p1 < p2 && !Character.isLetterOrDigit(s.charAt(p2))) p2--;
            if(Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                return false;
            }

            p1++;
            p2--;
        }
        return true;
    }
}

class Solution1 {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        char c1, c2;
        while (p1 <= p2) {
            c1 = s.charAt(p1);
            c2 = s.charAt(p2);
            if (!Character.isLetterOrDigit(c1)) p1++;
            else if (!Character.isLetterOrDigit(c2)) p2--;
            else {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) return false;
                p1++;
                p2--;
            }
        }
        return true;
    }
}