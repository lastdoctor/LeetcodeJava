package cronis.bitwise.Task2;

public class Solution {
    public static int compareToEqual(int num1, int num2) {
        // 29 = 11101 29 >> 1 = 14 >> 1 = 7
        // 15 = 01111 15 >> 1 = 7 >> 1 = 3
        int ans = 0;
        for (int i = 0; i < 32; i++){
            if ((num1 >> i & 1) != (num2 >> i & 1)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String... args){
        int num1 = 29, num2 = 15;
        int temp = compareToEqual(num1, num2);
        System.out.println(temp);
    }
}
