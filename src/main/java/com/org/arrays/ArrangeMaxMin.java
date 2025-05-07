package com.org.arrays;

import java.util.Arrays;

public class ArrangeMaxMin {
    public static void main(String[] args) {
//        Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
//        Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arrange(arr);
    }

    private static void arrange(int[] arr) {

        int n = arr.length;
        int small = 0;
        int large = n - 1;

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                ar[i] = arr[small++];
            } else {
                ar[i] = arr[large--];
            }
        }
        Arrays.stream(ar).forEach(System.out::print);

    }
}
