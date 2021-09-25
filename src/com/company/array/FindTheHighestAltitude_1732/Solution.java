package com.company.array.FindTheHighestAltitude_1732;

class Solution {
    public int largestAltitude(int[] gain) {
        int ans = gain[0];
        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i-1] + gain[i];
            ans = Math.max(ans, gain[i]);
        }

        return ans < 0 ? 0 : ans;
    }
}
