package com.company.binary_search.GuessNumberHigherOrLower_374;


public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (guess(m) == 0)
                return m;

            if (guess(m) == -1)
                r = m - 1;
            else
                l = m + 1;

        }

        return r;
    }

    private int guess(int m) {
        return 1;
    }
}
