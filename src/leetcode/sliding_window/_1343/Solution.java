package leetcode.sliding_window._1343;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        int ans = 0;
        while (windowEnd < arr.length) {
            sum += arr[windowEnd];

            if (windowEnd-windowStart+1 == k) {
                if ((sum / k) >= threshold) {
                    ans++;
                }
                sum -= arr[windowStart];
                windowStart+=1;
            }
            windowEnd++;
        }


        return ans;
    }
}
