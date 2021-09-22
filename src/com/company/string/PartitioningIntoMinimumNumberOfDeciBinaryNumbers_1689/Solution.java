package com.company.string.PartitioningIntoMinimumNumberOfDeciBinaryNumbers_1689;

class Solution {
    public int minPartitions(String n) {
        int len = n.length();
        int max = 0;
        for (char c : n.toCharArray()) {
            int no = c - '0';
            max = Math.max(max, no);
        }

        return max;
    }
}