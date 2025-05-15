package com.org.arrays;

public class PeakElement {
    //Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
    //
    //Note: Consider the element before the first element and the element after the last element to be negative infinity.
    //
    //Examples :
    //
    //Input: arr = [1, 2, 4, 5, 7, 8, 3]
    //Output: true
    //Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        final int i = peakElement(arr);
        System.out.println(i);

    }

    public static int peakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0; // Return index 0 for single-element array
        if (arr[0] > arr[1]) {
            return 0; // Return index 0 if the first element is a peak
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1; // Return last index if the last element is a peak
        }

        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid; // Return the index of the peak
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1; // Move to the right half
            } else {
                high = mid - 1; // Move to the left half
            }
        }

        return -1; // This line is redundant as a peak is guaranteed
    }
}
