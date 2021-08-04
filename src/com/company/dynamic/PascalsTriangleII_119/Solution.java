package com.company.dynamic.PascalsTriangleII_119;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return Arrays.asList(1);

        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for(int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}
