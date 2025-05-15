package com.org.arrays;

public class BinarySearch {
    //Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.
    //
    //Note: If multiple occurrences are there, please return the smallest index.
    //
    //Examples:
    //
    //Input: arr[] = [1, 2, 3, 4, 5], k = 4
    //Output: 3
    //Explanation: 4 appears at index 3.
    //
    //Input: arr[] = [11, 22, 33, 44, 55], k = 445
    //Output: -1
    //Explanation: 445 is not present.
    //
    //Input: arr[] = [1, 1, 1, 1, 2], k = 1
    //Output: 0
    //Explanation: 1 appears at index 0.

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int k = 4;
        System.out.println(binarysearch(arr,k));
    }

    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                result = mid;      // record index
                high = mid - 1;    // search left for earlier occurrence
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
