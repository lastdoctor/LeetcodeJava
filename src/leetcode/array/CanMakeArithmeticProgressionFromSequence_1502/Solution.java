package leetcode.array.CanMakeArithmeticProgressionFromSequence_1502;

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            // 1 3 5
            if (arr[i] - diff != arr[i-1]) return false;
        }
        return true;
    }
}
