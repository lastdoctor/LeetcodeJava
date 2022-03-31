package leetcode.binary_search._287;

class Solution {
    public int findDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}

class Main {
    public static void main(String[] args) {
        var s = new Solution().findDuplicate(new int[]{1, 3, 4, 2, 2});
        System.out.println("s = " + s);
    }
}
