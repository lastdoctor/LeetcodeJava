package com.company.array.IntersectionOfThreeSortedArrays_1213;

import java.util.*;


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
