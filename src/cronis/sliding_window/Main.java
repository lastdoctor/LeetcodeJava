package cronis.sliding_window;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{1, 0};
        var m = new Main().findMaxSequence(arr);
        System.out.println(m);
    }

    private int findMaxSequence(int[] nums) {
        int maxSequenceSize = 0;
        int windowStart = 0;
        int windowEnd = 0;

        int zeroCounter = 0;
        int firstZeroIndex = 0;

        while (windowEnd < nums.length) {
            if (nums[windowEnd] == 0) {
                zeroCounter++;
            }
            if (zeroCounter == 2) {
                int sequenceSize = windowEnd - windowStart;
                maxSequenceSize = Math.max(maxSequenceSize, sequenceSize);
                windowStart = firstZeroIndex + 1;
                zeroCounter = 1;
                firstZeroIndex = windowEnd;
            }
            windowEnd++;
        }

        return Math.max(maxSequenceSize, windowEnd - windowEnd + 1);
    }
}
