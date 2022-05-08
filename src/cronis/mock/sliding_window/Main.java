package cronis.mock.sliding_window;

import java.util.Arrays;

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

class Solution5 {
    public static void main(String[] args) {
        var s = new Solution5().maxSumSubarray(new int[]{2, -8, 3, -2, 4, -10});
        System.out.println(s);
    }

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
            return "MaxSum{" + "start=" + start + ", end=" + end + ", sum=" + sum + '}';
        }
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

class Solution6 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, -9, 9, -7, -5}, {3, 7, 2, 8, -1}, {-3, -7, 1, 1, 1}, {1, -4, -5, 9, 9}, {1, 2, 2, -9, 1}};
        var s = new Solution6().getMaxSumSubarray(matrix);
        System.out.println(s);
    }

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

    private MaxSum getMaxSubarray(int[] nums) {
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

    class Subarray {
        int[] startPoint = new int[2];
        int[] endPoint = new int[2];
        int sum = 0;

        @Override
        public String toString() {
            return "Subarray{" +
                    "startPoint=" + Arrays.toString(startPoint) +
                    ", endPoint=" + Arrays.toString(endPoint) +
                    ", sum=" + sum +
                    '}';
        }
    }

    Subarray getMaxSumSubarray(int[][] matrix) {
        var subarray = new Subarray();


        for (int startRow = 0; startRow < matrix.length; startRow++) {
            int[] summedArray = new int[matrix[0].length];
            for (int currRow = startRow; currRow < matrix[0].length; currRow++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    summedArray[col] += matrix[currRow][col];
                }
                MaxSum maxSum = getMaxSubarray(summedArray);
                subarray.sum = Math.max(subarray.sum, maxSum.sum);
                if (maxSum.sum == subarray.sum) {
                    subarray.startPoint = new int[]{startRow, maxSum.start};
                    subarray.endPoint = new int[]{currRow, maxSum.end};
                }
            }
        }

        return subarray;
    }

}
