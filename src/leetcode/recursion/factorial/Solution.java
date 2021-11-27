package leetcode.recursion.factorial;

public class Solution {
    public static void main(String[] args) {
        int f = new Solution().factorial(4);
        System.out.println(f);
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        else return factorial(n - 1) * n;
    }
}
