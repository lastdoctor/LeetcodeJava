package leetcode.array.LargestUniqueNumber_1133;


public class Main {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] digit = new int[]{5, 7, 3, 9, 4, 9, 8, 3, 1}; // 8
//        int[] digit = new int[]{9, 9, 8, 8}; // -1
        int res = s.largestUniqueNumber(digit);
        System.out.println(res);
    }
}
