package leetcode.array._2037;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int sum = 0;

        for (int i = seats.length - 1; i >= 0; i--) {
            sum += Math.abs(seats[i] - students[i]);
        }

        return sum;
    }
}
