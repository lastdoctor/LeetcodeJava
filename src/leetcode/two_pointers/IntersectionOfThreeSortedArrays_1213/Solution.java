package leetcode.two_pointers.IntersectionOfThreeSortedArrays_1213;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time O(2n) Space O(n)
class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
            map.put(arr3[i], map.getOrDefault(arr3[i], 0) + 1);
        }

        for (int num : arr1) {
            if (map.get(num) == 3) list.add(num);
        }

        return list;
    }
}

class Solution1 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        // three pointers
        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < arr1.length && p2 < arr2.length && p3 < arr3.length) {
            if (arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) {
                list.add(arr1[p1]);
                p1++;
                p2++;
                p3++;
            } else {
                if (arr1[p1] < arr2[p2]) p1++;
                else if (arr2[p2] < arr3[p3]) p2++;
                else p3++;
            }
        }

        return list;
    }
}