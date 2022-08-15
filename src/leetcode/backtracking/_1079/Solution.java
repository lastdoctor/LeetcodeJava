package leetcode.backtracking._1079;

import java.util.*;

class Solution {
    Set<String> set = new HashSet<>();

    String removeIthChar(String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }

    void getTilePossibilities(String tiles, String candidate) {
        set.add(candidate);
        if (tiles.length() == 0) {
            return;
        }
        for (int i = 0; i < tiles.length(); i++) {
            char letter = tiles.charAt(i);
            var removedLetter = removeIthChar(tiles, i);
            if (set.contains(letter)) continue;
            getTilePossibilities(removedLetter, candidate + letter);
        }
    }

    public int numTilePossibilities(String tiles) {
        getTilePossibilities(tiles, "");
        return set.size() - 1;
    }
}
