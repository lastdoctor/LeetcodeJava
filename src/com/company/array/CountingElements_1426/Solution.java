package com.company.array.CountingElements_1426;

import java.util.*;

class Solution {
    public int countElements(int[] arr) {
        int counter = 0;
        int duplicateCounter = 1; // 2
        // nlogn
        Arrays.sort(arr);
        // On
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                duplicateCounter++;
            } else {
                if (arr[i - 1] + 1 == arr[i]) {
                    counter += duplicateCounter;
                }
                duplicateCounter = 1;
            }
        }
        return counter;
    }
}

class Solution1 {
    public int countElements(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        for (int x: arr) {
            hashSet.add(x);
        }
        int count = 0;
        for (int x: arr) {
            if(hashSet.contains(x + 1)) {
                count++;
            }
        }
        return count;
    }
}

class Solution2 {
    public int countElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int counter = 0;
        for (Integer key: map.keySet()) {
            if (map.containsKey(key + 1)) {
                counter += map.get(key);
            }
        }
        return counter;
    }
}
