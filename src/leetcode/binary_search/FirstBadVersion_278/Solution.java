package leetcode.binary_search.FirstBadVersion_278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) >>> 1;
            boolean check = isBadVersion(mid);

            if (check) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class Solution1 extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
