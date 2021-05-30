package com.company.array.BinaryNumberWithAlternatingBits_693;

class Solution {
    public boolean hasAlternatingBits(int n) {
        return false;
    }
}

// https://leetcode.com/problems/binary-number-with-alternating-bits/discuss/603746/Java-or-4-line-Code-or-100-Faster-or-Simple-and-Easy-Solution
class Solution1 {
    public boolean hasAlternatingBits(int n) {

        while(n != 0 && (n >> 1) != 0){
            if(((n & 1) ^ ((n >> 1) & 1)) == 0) return false;
            n = n >> 1;
        } return true;

    }
}