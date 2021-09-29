package com.company.string.GenerateAStringWithCharactersThatHaveOddCounts_1374;

// Time O(n) Space O(1)
class Solution {
    public String generateTheString(int n) {
        StringBuilder ans = new StringBuilder();
        int num = (n % 2 == 0) ? n - 1 : n;

        for (int i = 0; i < num; i++) ans.append('a');

        if (n % 2 == 0) ans.append('b');

        return ans.toString();
    }
}
