package com.company.dynamic.PascalsTriangleII_119;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (rowIndex == 0) return Arrays.asList(1);
        return triangle.get(0);
    }
}
