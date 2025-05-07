package com.org.arrays;

import java.util.Arrays;

public class KthSmallest {
    //Given an array arr[] and an integer k where k is smaller than the size of the array, your task is to find the kth smallest element in the given array.
    //
    //Follow up: Don't solve it using the inbuilt sort function.
    //
    //Examples :
    //
    //Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
    //Output: 7
    //Explanation: 3rd smallest element in the given array is 7.
    //
    //Input: arr[] = [2, 3, 1, 20, 15], k = 4
    //Output: 15
    //Explanation: 4th smallest element in the given array is 15.
    public static void main(String[] args) {
        int [] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        Arrays.sort(arr);
        final int i = arr[k - 1];
        System.out.println(i);

    }
}
