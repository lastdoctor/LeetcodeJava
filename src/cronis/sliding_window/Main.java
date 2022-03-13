package cronis.sliding_window;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1};
        var m = new Main().findMaxSequence(arr);
        System.out.println(m);
    }

    private int findMaxSequence(int[] nums) {
        int maxSequence = 0;
        int windowStart = 0;
        int windowEnd = 0;

        int zeroCounter = 0;
        while (windowEnd < nums.length) {
            if (zeroCounter >= 2) {
                zeroCounter = 0;
            }
            if (nums[windowEnd] == 0) {
                zeroCounter++;
            }

            if (zeroCounter < 2 && nums[windowEnd] == 0) {
                int currentWindowSize = windowEnd - windowStart + 1;
                maxSequence = Math.max(maxSequence, currentWindowSize);
                windowStart = windowEnd + 1;
            }

            windowEnd++;
        }

        return Math.max(maxSequence, windowEnd - windowStart + 1);
    }

}
