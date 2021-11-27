package leetcode.binary_search.KthMissingPositiveNumber_1539;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length, mid;

        while (start < end) {
            mid = (start + end) >>> 1;

            if (arr[mid] - 1 - mid < k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start + k;
    }
}
