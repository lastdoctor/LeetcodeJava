package com.company.recursion.sumArr;

public class Solution {
    public static void main(String[] args) {
        int s = new Solution().sum(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(s);
    }

    int sum(int[] arr, int n) {
        if (n == 0) return 0;
        if (n == 1) return arr[0];
        if (n == 2) return arr[0] + arr[1];
        return sum(arr, n - 1) + sum(arr, n - 1);
    }
}
