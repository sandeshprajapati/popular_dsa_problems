package com.org.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 64};
        int target = 25;
        binarySearch(arr, target);
    }

    private static void binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < target) {
                low = mid - 1;
            } else if (arr[mid] > target) {
                high = mid + 1;
            }
        }
    }


}
