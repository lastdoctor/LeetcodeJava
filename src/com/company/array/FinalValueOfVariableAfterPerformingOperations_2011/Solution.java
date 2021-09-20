package com.company.array.FinalValueOfVariableAfterPerformingOperations_2011;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String str : operations) {
            if(str.charAt(0) == '-' || str.charAt(1) == '-' || str.charAt(2) == '-') ans--;
            else ans++;
        }

        return ans;
    }
}

class Solution1 {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String num : operations) {
            if(num.equals("--X") || num.equals("X--")) ans--;
            else ans++;
        }

        return ans;
    }
}