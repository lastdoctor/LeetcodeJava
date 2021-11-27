package leetcode.array.TwoSum_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int[] res = s.twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
