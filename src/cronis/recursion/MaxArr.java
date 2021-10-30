package cronis.recursion;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 22, -1};
        int max = new MaxArr().maxInt(arr, arr.length);
        System.out.println(max);
    }

    private int maxInt(int[] arr, int end) {
        if (end == 0) return 0;
        if (end == 1) return arr[0];
        if (end == 2) return Math.max(arr[0], arr[1]);
        return Math.max(arr[end - 1], maxInt(arr, end -1));
    }
}