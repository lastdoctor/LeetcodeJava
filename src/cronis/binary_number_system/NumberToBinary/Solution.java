package cronis.binary_number_system.NumberToBinary;

class Solution {
    public String doubleToBinary(double num) throws Exception {
        StringBuilder binary = new StringBuilder();

        if (num < 0 || num > 1)
            throw new Exception("Your variable must be less than 0 and more than 1");

    while (num > 0) {
            if (binary.length() >= 31)
                throw new Exception("Your variable is bigger than 32 bits");

            // Multiply by 2 in num to check it 1 or 0
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        System.out.println(binary.toString());
        return binary.toString();
    }
}

// 4 / 2 = 2 // 0
// 2 / 2 = 1 // 0
// 1 / 2 = 0 // 1

class Main {
    public static void main(String... args) throws Exception {
        Solution s = new Solution();
        double num1 = 0.625;
        s.doubleToBinary(num1);
    }
}
