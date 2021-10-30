package cronis.recursion;

public class SumToN {
    public static void main(String[] args) {
        int s = new SumToN().sumToN(12345);
        System.out.println(s);
    }

    int sumToN(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumToN(n / 10);
    }
}
