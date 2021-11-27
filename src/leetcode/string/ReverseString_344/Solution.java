package leetcode.string.ReverseString_344;

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = s[tmp];
        }
    }
}

class Solution1 {
    public void reverseString(char[] s) {
        reverse(s, 0);
    }

    private void reverse(char[] arr, int start) {
        if (start < arr.length) {
            char temp = arr[start];
            reverse(arr, start+1);
            arr[arr.length - 1 - start] = temp;
        }
    }
}