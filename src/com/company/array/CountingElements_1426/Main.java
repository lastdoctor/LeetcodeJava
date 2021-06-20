package com.company.array.CountingElements_1426;

class Main{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] digit = new int[] {1, 5, 6, 9, 4, 2, 2, 0}; // 4
        // 0, 1, 2, 2, 4, 5, 6, 9
        // 0 + 1 = 1
        // 1 + 1 = 2
        // 2 + 1 = 3!
        // 4 + 1 = 5
        // 6 + 1 = 7!
        // 9 + 1 = 10!
        int res = s.countElements(digit);
        System.out.println(res);
    }
}
