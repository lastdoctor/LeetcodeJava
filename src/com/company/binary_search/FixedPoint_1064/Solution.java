package com.company.binary_search.FixedPoint_1064;

// Time  O(n) Space O(1)
class Solution {
    public int fixedPoint(int[] arr) {
        int idx = 0;
        for (int num : arr) {
            if (num == idx) return idx;
            idx++;
        }
        return -1;
    }
}

// Time O(log(n)) Space 0(1)
class Solution1 {
    public int fixedPoint(int[] arr) {
        int l = 0, r = arr.length -1, mid, ans = -1;
        while (l <= r) {
            mid = (l + r) >>> 1;
            if(arr[mid] == mid){
                ans = mid;
                r = mid - 1;
                continue;
            }
            if (arr[mid] < mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}