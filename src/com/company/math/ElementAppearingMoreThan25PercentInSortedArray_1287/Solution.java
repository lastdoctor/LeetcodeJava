package com.company.math.ElementAppearingMoreThan25PercentInSortedArray_1287;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int q = arr.length / 4;
        int ans = 0;
        for (int i = 0; i < arr.length - q; i++) {
            if (arr[i] == arr[i + q]) {
                return arr[i];
            }
        }
        return -1;
    }
}
