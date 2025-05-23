package com.org.arrays;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveMissing {

    /*
    * You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

    Note: Positive number starts from 1. The array can have negative integers too.

    Examples:

    Input: arr[] = [2, -3, 4, 1, 1, 7]
    Output: 3
    Explanation: Smallest positive missing number is 3.

    Input: arr[] = [5, 3, 2, 5, 1]
    Output: 4
    Explanation: Smallest positive missing number is 4.
    * */
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        final int i = missingNumber1(arr);
        System.out.println(i);
        System.out.println("===");
        final int j = missingNumber1(arr);
        System.out.println(j);
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] < n && arr[arr[i]-1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static int missingNumber1(int[] arr) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}
