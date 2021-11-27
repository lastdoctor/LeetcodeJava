package leetcode.array.LargestUniqueNumber_1133;

import java.util.Arrays;
import java.util.HashMap;

// Hashmap solution method
class Solution {
    public int largestUniqueNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                max = Math.max(max, key);
            }
        }
        return max;
    }
}

// Time complexity O(nLong n) and space complexity O(1)
// Sort method
class Solution1 {
    public int largestUniqueNumber(int[] A) {
        Arrays.sort(A);

        for(int i = A.length - 1; i >= 0; i--) {
            // if there is no duplicate return.
            if (i == 0 || A[i] != A[i - 1]) return A[i];
            // while duplicate exist.
            while (i > 0 && A[i] == A[i - 1]) {
                i--;
            }
        }

        return -1;
    }
}