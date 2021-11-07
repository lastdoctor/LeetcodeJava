package cronis.recursion;

import cronis.bitwise.Task1.Solution;

public class Multiply {
    public static void main(String[] args) {
        int m = new Multiply().multiply(-1, 9);
        System.out.println(m);
    }

    private int mull(int x, int y) {
        if (x == 0) return 0;
        if (x == -1) return ~y + 1;

        int ans = mull(x >> 1, y << 1);
        return ((x & 1) == 0) ? ans : ans + y;
    }

    private int multiply(int a, int b) {
        if (a < 0 && b < 0)
            return a > b ? mull(a, b) : mull(b, a);
        return a < b ? mull(a, b) : mull(b, a);
    }
}
