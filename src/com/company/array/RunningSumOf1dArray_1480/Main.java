package com.company.array.RunningSumOf1dArray_1480;

import java.util.Arrays;
// https://leetcode.com/problems/running-sum-of-1d-array/
public class Main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] arr = {3, 1, 2, 10, 1};
        int[] r = s.runningSum(arr);
        System.out.println(Arrays.toString(r));
    }
}