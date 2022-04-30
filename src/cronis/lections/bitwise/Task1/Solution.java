package cronis.lections.bitwise.Task1;


// 1 2 1 3 3
// 001
// 010
// 011 -> 3

// 011
// 001
// 010 -> 2

// 010
// 011
// 001 -> 1

// 001
// 011
// 010 -> 2
// answer is 2
public class Solution {
    public static int findUnique(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String... args) {
        int[] arr = {1, 2, 1, 3, 3};
        int temp = findUnique(arr);
        System.out.println(temp);
    }
}
