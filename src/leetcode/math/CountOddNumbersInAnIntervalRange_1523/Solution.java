package leetcode.math.CountOddNumbersInAnIntervalRange_1523;

// Example
// low = 3 high = 7
// 3 % 2 == 1 true
// 7 % 2 == 1 true
// 7-3= 4 >> 1 // 100 >> 001 = 010 = 2 + 1

// low = 8 high = 10
// 8 % 2 == 1 false
// 10 % 2 == 1 false
// 10-2 = 2 >> 1 = 010 >> 001 = 001 = 1
class Solution {
    public int countOdds(int low, int high) {
        return (low % 2 == 1 || high % 2 == 1) ? ((high - low) >> 1) + 1 : (high - low) >> 1;
    }
}
