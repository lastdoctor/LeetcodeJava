package com.company.interviewcamp_io.Reverse_the_elements_of_an_array;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        int[] arr = new int[]{3, 4, 2, 7, 1};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
