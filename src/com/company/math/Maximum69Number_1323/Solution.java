package com.company.math.Maximum69Number_1323;

class Solution {
    public int maximum69Number (int num) {
        return Integer.parseInt(("" + num).replaceFirst("6", "9"));
    }
}
