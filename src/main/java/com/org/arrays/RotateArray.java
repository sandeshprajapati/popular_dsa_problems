package com.org.arrays;

import java.util.Arrays;

public class RotateArray {
    //Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
    //
    //Note: Consider the array as circular.
    //
    //Examples :
    //
    //Input: arr[] = [1, 2, 3, 4, 5], d = 2
    //Output: [3, 4, 5, 1, 2]
    //Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d);
    }

    static void rotateArr(int[] arr, int d) {
        // add your code here
        int n = arr.length;
        int r = d % n;
        System.out.println(r);
        reverse(arr, 0, r - 1);
        reverse(arr, r, n - 1);
        reverse(arr, 0, n - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverse(int[] arr, int low, int high) {

        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }
}
