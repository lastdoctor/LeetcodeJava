package leetcode.array.DecodeXORedArray_1720;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] encoded = { 6,2,7,3 };
        int first = 4;
        Solution s = new Solution();
        int[]res = s.decode(encoded, first);
        System.out.println(Arrays.toString(res));
    }
}
