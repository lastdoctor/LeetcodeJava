package cronis.lections.bitwise.Task3;

public class Solution {
    static int changeEvenOdd(int num) {
        // 29 011101 -> 101110 = 46
        for (int i = 0; i < 32; i += 2) {
            int findBit = (num >> i) & 1; // find i th bit
            int findBitPlusOne = (num >> (i + 1)) & 1; // find i + 1 th bit

//            num =
        }
        return num;
    }

    public static void main(String... args) {
        int num = 978939247;
        changeEvenOdd(num);
    }
}
