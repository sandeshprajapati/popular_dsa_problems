package com.org.arrays;

import java.util.Arrays;

public class TripletSumZero {
    //Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. Return true if such a triplet exists, otherwise, return false.
    //
    //Examples:
    //
    //Input: arr[] = [0, -1, 2, -3, 1]
    //Output: true
    //Explanation: The triplet [0, -1, 1] has a sum equal to zero.
    //
    //Input: arr[] = [1, 2, 3]
    //Output: false
    //Explanation: No triplet with a sum of zero exists.
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        final boolean triplets = findTriplets(arr);
        System.out.println(triplets);

    }

    public static boolean findTriplets(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);//-3 ,-1 ,0 ,1 ,2
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    return true;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return false;
    }
}
