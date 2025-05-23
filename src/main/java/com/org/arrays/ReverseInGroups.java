package com.org.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseInGroups {
    //Given an array arr of positive integers. Reverse every sub-array group of size k.
    //
    //Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't return any array, modify the given array in place.
    //
    //Examples:
    //
    //Input: arr[] = [1, 2, 3, 4, 5], k = 3
    //Output: [3, 2, 1, 5, 4]
    //Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
    //
    //Input: arr[] = [5, 6, 8, 9], k = 5
    //Output: [9, 8, 6, 5]
    //Explnation: Since k is greater than array size, the entire array is reversed.
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        List<Long> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        reverseInGroups(list, k);
    }

    static void reverseInGroups(List<Long> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i += k) {

            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }

        }
        arr.forEach(System.out::println);
    }
}
