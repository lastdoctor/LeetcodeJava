package com.company.algoexpert.ValideSubsequence;

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};
        System.out.println(s.validWordSquare(array, sequence));
    }
}

// Space complexity O(1) and Time complexity O(n)
class Solution {
    public boolean valideSubsequence(int[] array, int[] sequence) {
        int sindex = 0;
        for (int i = 0; i < array.length; i++){
            if (sequence[sindex] == array[i]){
                sindex++;
            }
            if (sindex >= sequence.length){
                return true;
            }
        }
        return false;
    }
}

// Space complexity O(1) and Time complexity O(n)
class Solution1 {
    public boolean valideSubsequence(int[] nums, int[] sequence) {
        int p1 = 0, p2 = 0;
        while(p1 < nums.length && p2 < sequence.length){
            if (nums[p1] == sequence[p2]) {
                p2++;
            }
            if (p2 >= sequence.length){
                return true;
            }
            p1++;
        }
        return false;
    }
}