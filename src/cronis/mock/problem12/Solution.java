package cronis.mock.problem12;

import java.lang.reflect.Array;
import java.util.Arrays;

//  Найти ближайшие меньше число, т.е. если дан массив {2 1 3} -> {1 3 2}
class Main {
    public static void main(String[] args) {
        var num = new int[]{2, 1, 3};
        var result = new Solution().getMinClosestIntAfterPermutation(num);
        System.out.println(Arrays.toString(num));
    }
}
// {2 1 3} -> {1 3 2}
class Solution {
    int[] getMinClosestIntAfterPermutation(int[] num) {
        return num;
    }
}
