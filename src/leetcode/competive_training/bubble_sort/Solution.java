package leetcode.competive_training.bubble_sort;

// Time Complexity On2 and Space Complexity O(1);
public class Solution {
    public static void bubble_sort(int[] arr) {
//        int[] arr = new int[1000];
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }

        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String... args) {
        Solution s = new Solution();
        int[] arr = {5, 1, 4, 2, 8,};
        s.bubble_sort(arr);
    }
}


// 5 1 4 2 8
// 1 5 4 2 8
// 1 4 5 2 8
// 1 4 2 5 8
// 1 4 2 5 8
// 1 2 4 5 8
// 1 2 4 5 8
// 1 2 4 5 8