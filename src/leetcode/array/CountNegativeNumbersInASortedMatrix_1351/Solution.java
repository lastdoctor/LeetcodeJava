package leetcode.array.CountNegativeNumbersInASortedMatrix_1351;

import java.util.Arrays;

// Space complexity O(1) Time complexity O(n2)
class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0;
        for (int[] nums : grid){
            for (int num : nums){
                if (num < 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}