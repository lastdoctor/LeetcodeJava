package leetcode.math.WaterBottles_1518;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles, numNew;
        while (numBottles >= numExchange) {
            numNew = numBottles / numExchange;
            ans += numNew;
            numBottles = numNew + (numBottles % numExchange);
        }
        return ans;
    }
}