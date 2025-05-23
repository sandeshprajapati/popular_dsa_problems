package com.org.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWith0Sum {
    //Given an array arr containing both positive and negative integers, the task is to compute the length of the largest subarray that has a sum of 0.
    //
    //Examples:
    //
    //Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
    //Output: 5
    //Explanation: The largest subarray with a sum of 0 is [-2, 2, -8, 1, 7].
    //
    //Input: arr[] = [2, 10, 4]
    //Output: 0
    //Explanation: There is no subarray with a sum of 0.
    //
    //Input: arr[] = [1, 0, -4, 3, 1, 0]
    //Output: 5
    //Explanation: The subarray is [0, -4, 3, 1, 0].

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        final int maxLen = maxLen(arr);
        System.out.println(maxLen);
    }

    private static int maxLen(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        int currSum = 0;
        Map<Integer, Integer> pfMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum == 0) {
                maxLen = i + 1;
            } else if (pfMap.containsKey(currSum)) {
                maxLen = Math.max(maxLen, i - pfMap.get(currSum));
            } else {
                pfMap.put(currSum, i);
            }
        }

        return maxLen;
    }
}
