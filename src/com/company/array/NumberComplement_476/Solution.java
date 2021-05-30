package com.company.array.NumberComplement_476;

// Time complexity: O(1) and Space complexity: O(1);
class Solution {
    public int findComplement(int num) {
        int bit = 1, binary = num; // bit = 1, binary = num = 5
        // 101 ^ 001 = 100 = 4 // 101 >>= 1 // 010
        // 100 ^ 010 = 110 = 6 // 010 >>= 1 // 001
        // 110 ^ 100 = 010 = 2 // 001 >>= 1 // 000
        // 0010 ^ 10000 = 1010
        while(binary != 0){
            num ^= bit;
            bit <<= 1;
            binary >>= 1;
        }
        return num;
    }
}
