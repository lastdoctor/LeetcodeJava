package com.company.array.ThreeConsecutiveOdds_1550;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) counter++;
            else counter = 0;

            if (counter == 3) return true;
        }
        return false;
    }
}
