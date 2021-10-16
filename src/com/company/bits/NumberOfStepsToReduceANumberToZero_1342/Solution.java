package com.company.bits.NumberOfStepsToReduceANumberToZero_1342;

class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num != 0) {
            if (num % 2 ==0){
                num /= 2;
            }
            else {
                num -= 1;
            }
            ans++;
        }
        return ans;
    }
}

class Solution1 {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num -= 1;
            }
            ans++;
        }
        return ans;
    }
}