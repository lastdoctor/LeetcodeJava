package com.company.recursion.sumArr;

public class Solution {
    public static void main(String[] args) {
        int s = new Solution().sum(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(s);
    }

    int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return sum(arr, n - 1) + arr[n -1];
    }
}
