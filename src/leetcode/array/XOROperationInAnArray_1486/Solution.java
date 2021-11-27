package leetcode.array.XOROperationInAnArray_1486;

import java.util.Hashtable;

// Time complexity: O(1) and Space complexity: O(1);
class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int res = start + 2 * 0;
        for(int i = 1;i < arr.length; i++){
            arr[i] = start + 2 * i;
            res = res ^ arr[i];
        }
        return res;
    }
}