package leetcode.two_pointers._1358;

class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1;
        int b = -1;
        int c = -1;

        int countSubs = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') a = i;
            else if (ch == 'b') b = i;
            else if (ch == 'c') c = i;
            if (a == -1 || b == -1 || c == -1) continue;
            int minSubs = Math.min(a, Math.min(b, c));

            countSubs += minSubs + 1;
        }

        return countSubs;
    }
}
