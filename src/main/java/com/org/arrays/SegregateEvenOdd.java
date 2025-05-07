package com.org.arrays;

import java.util.Arrays;

public class SegregateEvenOdd {
    public static void main(String[] args) {
//        Input: arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5}
//        Output: 2 4 6 8 7 9 1 3 5
        int arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5};
        solve(arr);
    }

    private static void solve(int[] arr) {
        int n = arr.length;

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
