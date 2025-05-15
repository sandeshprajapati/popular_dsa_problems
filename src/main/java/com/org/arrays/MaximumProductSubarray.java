package com.org.arrays;

public class MaximumProductSubarray {
    //Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].
    //
    //Note: It is guaranteed that the output fits in a 32-bit integer.
    //
    //Examples
    //
    //Input: arr[] = [-2, 6, -3, -10, 0, 2]
    //Output: 180
    //Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
    //
    //Input: arr[] = [-1, -3, -10, 0, 6]
    //Output: 30
    //Explanation: The subarray with maximum product is {-3, -10} with product = (-3) * (-10) = 30.

    public static void main(String[] args) {
        int [] arr={6 ,-3 ,-10, 0 ,2};
        int max=maxProduct(arr);
        System.out.println(max);
    }

    public static int maxProduct(int[] arr) {

        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int maxEndingHere = arr[0];
        int minEndinghere = arr[0];
        int maxSoFor = arr[0];

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            if (num < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndinghere;
                minEndinghere = temp;
            }

            //cal
            maxEndingHere = Math.max(num, num * maxEndingHere);
            minEndinghere = Math.min(num, num * minEndinghere);
            maxSoFor = Math.max(maxSoFor, maxEndingHere);
        }

        return maxSoFor;
    }
}
