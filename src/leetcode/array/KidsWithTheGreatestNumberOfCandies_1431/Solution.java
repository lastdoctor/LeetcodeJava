package leetcode.array.KidsWithTheGreatestNumberOfCandies_1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        for (int num : candies) {
            if (num + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
