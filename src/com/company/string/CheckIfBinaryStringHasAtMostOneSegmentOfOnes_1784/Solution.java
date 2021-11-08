package com.company.string.CheckIfBinaryStringHasAtMostOneSegmentOfOnes_1784;

class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
