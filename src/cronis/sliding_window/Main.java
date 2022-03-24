package cronis.sliding_window;

public class Main {
    public static void main(String[] args) {
        var s = new Main().findMaxSequence(new int[]{0});
        System.out.println(s);
    }

    private int findMaxSequence(int[] nums) {
        int maxSequence = 0;
        int windowStart = 0;
        int windowEnd = 0;

        int zeroCounter = 0;
        int firstZeroIndex = 0;

        while (windowEnd < nums.length) {
            if (nums[windowEnd] == 0) zeroCounter++;
            if (zeroCounter == 2) {
                int sequenceSize = windowEnd - windowStart;
                maxSequence = Math.max(maxSequence, sequenceSize);
                windowStart = firstZeroIndex + 1;
                zeroCounter = 1;
                firstZeroIndex = windowEnd;
            }

            windowEnd++;
        }

        return Math.max(maxSequence, windowEnd - windowStart);
    }
}
// [0,0,0,0,1,1,0,1,0,1,1,0,1,1,1,0,0,1]; // -> 6
