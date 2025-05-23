package com.org.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoSumPairWithGivenSum {
    //Given an array arr[] of positive integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
    //
    //Examples:
    //
    //Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
    //Output: true
    //Explanation: arr[3] + arr[4] = 6 + 10 = 16.
    public static void main(String[] args) {
        //k=a+b; a=k-b
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(twoSum(arr, target));
    }

    static boolean twoSum(int[] arr, int target) {
        // code here
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {

            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
