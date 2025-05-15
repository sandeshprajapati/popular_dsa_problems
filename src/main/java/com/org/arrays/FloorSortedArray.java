package com.org.arrays;

public class FloorSortedArray {

    //Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.
    //
    //Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.
    //
    //Examples
    //
    //Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
    //Output: 1
    //Explanation: Largest number less than or equal to 5 is 2, whose index is 1.
    //
    //Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 11
    //Output: 4
    //Explanation: Largest Number less than or equal to 11 is 10, whose indices are 3 and 4. The index of last occurrence is 4.

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;
        final int floor = findFloor(arr, x);
        System.out.println(floor);
    }

    static int findFloor(int[] arr, int x) {
        int floor = -1;
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
             if (arr[mid] <= x) {
                floor = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }
}

