package com.org.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSum {
    //Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.
    //
    //Examples:
    //
    //Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
    //Output: 6
    //Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
    //
    //Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
    //Output: 5
    //Explanation: Only subarray with sum = -5 is [-5, 8, -14, 2, 4] of length 5.
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        final int i = longestSubarray(arr, k);
        System.out.println(i);

    }

    public static int longestSubarray(int[] arr, int k) {
        int l = arr.length;
        int currSum = 0;
        int maxLen = 0;
        Map<Integer, Integer> pfMap = new HashMap<>();
        for (int i = 0; i < l; i++) {
            currSum += arr[i];
            if (currSum == k) {
                maxLen = i + 1;
            }
            int rem = currSum - k;
            if (pfMap.containsKey(rem)) {
                int idx = pfMap.get(rem);
                maxLen = Math.max(maxLen, i - idx);
            }
            if (!pfMap.containsKey(currSum)) {
                pfMap.put(currSum, i);
            }
        }
        return maxLen;
    }
}
