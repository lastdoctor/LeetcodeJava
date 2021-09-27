package com.company.array.ShortestWordDistance_243;

import java.util.*;

class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        Map<String, Integer> map = new HashMap<>();

        int idx = 0;
        for (String c : wordsDict) {
            if (!map.containsKey(c)) {
                map.put(c, idx);
            } else {
                map.put(c, map.get(c) + idx);
            }
            idx++;
        }



        System.out.println(map);

        return 1;
    }
}
