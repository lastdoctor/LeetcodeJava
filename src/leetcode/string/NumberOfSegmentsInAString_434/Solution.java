package leetcode.string.NumberOfSegmentsInAString_434;

import java.util.Arrays;

public class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.equals("")){
            return 0;
        }
        // \\s+ - matches sequence of one or more whitespace characters.
        System.out.println(Arrays.toString(s.split("\\s+")));
        return s.split("\\s+").length;
    }
}
