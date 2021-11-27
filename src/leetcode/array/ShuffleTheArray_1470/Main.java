package leetcode.array.ShuffleTheArray_1470;

import java.util.Arrays;
// https://leetcode.com/problems/shuffle-the-array/
public class Main {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] res = s.shuffle(arr, n);
        System.out.println(Arrays.toString(res));
        System.out.println(res[3 + 1 / 2]);
    }
}
