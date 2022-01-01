package leetcode.patterns.SlidingWindows.Introduction;

import java.util.Arrays;

class AverageOfSubarrayOfSizeK {
    public static double[] bruteForce(int k, int[] arr) {
        double[] ans = new double[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            ans[i] = sum / k;
        }
        return ans;
    }

    public static double[] slidingWindows(int k, int[] arr) {
        double[] ans = new double[arr.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                ans[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var res = AverageOfSubarrayOfSizeK.slidingWindows(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println(Arrays.toString(res));
    }
}