package com.org.arrays;

import java.util.Arrays;

public class MaxPairSumLessThanK {
    //Given an array arr of size N and an integer K. The task is to find the pair of integers such that their sum is maximum and but less than K
    //Examples:
    //Input : arr = {30, 20, 50} , K = 70
    //Output : 30, 20
    //30 + 20 = 50, which is the maximum possible sum which is less than K
    //Input : arr = {5, 20, 110, 100, 10}, K = 85
    //Output : 20, 10
    public static void main(String[] args) {
        int[] arr = {5, 20, 110, 100, 10};
        int k = 85;
        final int[] result = solve(arr, k);
        Arrays.stream(result).forEach(System.out::println);

    }

    private static int[] solve(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int maxSum = -1;
        int[] result = new int[2];
        boolean found = false;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum < k) {
                //if (sum > maxSum) {
                    //maxSum = sum;
                    result[0] = arr[low];
                    result[1] = arr[high];
                    found = true;
                //}
                low++;
            } else {
                high--;
            }

        }
        return found ? result : new int[0];
    }
}
