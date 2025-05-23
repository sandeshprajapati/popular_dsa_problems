package com.org.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    //Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
    //
    //Examples:
    //
    //Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
    //Output: 6
    //Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
        final int i = longestConsecutive(arr);
        System.out.println(i);
    }

    public static int longestConsecutive(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int length = 0;
        int maxLength = 0;
        for (int num : arr) {

            if (!set.contains(num - 1)) {
                length = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
