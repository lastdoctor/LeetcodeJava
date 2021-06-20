package com.company.interviewcamp_io.Traversing_from_both_ends_two_sums;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        int[] digit = new int[]{2, 2, 11, 15, 7};
        int target = 9;
        int[] res = twoSum(digit, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] a, int target) {
        int start = 0, end = a.length - 1;
        Arrays.sort(a);
        while (start < end) {
            int sum = a[start] + a[end];
            if (sum < target)
                start++;
            else if (sum > target)
                end--;
            else
                return new int[]{start, end};
        }
        return null;
    }

}
