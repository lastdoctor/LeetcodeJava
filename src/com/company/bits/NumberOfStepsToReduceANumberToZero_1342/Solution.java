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

// Counting Bits
class Solution2 {
    public int numberOfSteps(int num) {
        String binaryString = Integer.toBinaryString(num);

        int ans = 0;
        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') ans += 2;
            else ans++;
        }

        return ans -1;
    }
}