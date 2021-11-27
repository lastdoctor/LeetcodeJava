package leetcode.math.GuessNumberHigherOrLower_374;

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while(l <= r) {
            int m = (l + r) >>> 1;
            if (guess(m) == 0)
                return m;

            if (guess(m) == -1)
                r = m -1;
            else
                l = m + 1;

        }

        return r;
    }

    private int guess(int m) {
        return 1;
    }
}
