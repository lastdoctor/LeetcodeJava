package leetcode.bits._191;

public class Solution {
    public int hammingWeight(int n) {
        int counter = 0;

        while (n != 0) {
            int lastBit = n & 1;
            if (lastBit == 1) counter++;
            n >>>= 1;
        }

        return counter;
    }
}
