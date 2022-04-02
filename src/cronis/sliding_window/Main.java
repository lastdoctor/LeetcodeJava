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


// Problem 5
// Дан массив неупорядоченных отрицательных и положительных целых.
// Найдите под массив с максимальной суммой.
// Данные о под массиве можно представить в следующем виде:

// input:  {2, -8, 3, -2, 4, -10}
// output: start = 2; end = 4; sum = 5;
class MaxSum {
    public int start;
    public int end;
    public int sum;

    MaxSum(int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "MaxSum{" +
                "start=" + start +
                ", end=" + end +
                ", sum=" + sum +
                '}';
    }
}

class Solution5 {
    public static void main(String[] args) {
        var s = new Solution5().maxSumSubarray(new int[]{2, -8, 3, -2, 4, -10});
        System.out.println(s);
    }


    public MaxSum maxSumSubarray(int[] nums) {
        MaxSum maxsum = null;
        int windowStart = 0;
        int windowEnd = 0;
        int windowMaxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        while (windowEnd < nums.length) {
            currentSum += nums[windowEnd];
            if (currentSum <= 0) {
                currentSum = 0;
                windowStart++;
            }
            if (windowMaxSum < currentSum) {
                windowMaxSum = currentSum;
                maxsum = new MaxSum(windowStart, windowEnd, currentSum);
            }
            windowEnd++;
        }
        return maxsum;
    }
}
