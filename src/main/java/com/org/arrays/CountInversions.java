package com.org.arrays;

public class CountInversions {
    //Given an array of integers arr[]. Find the Inversion Count in the array.
    //Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
    //
    //    Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
    //    If an array is sorted in the reverse order then the inversion count is the maximum.
    //Input: arr[] = [2, 4, 1, 3, 5]
    //Output: 3
    //Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
    //
    //Input: arr[] = [2, 3, 4, 5, 6]
    //Output: 0
    //Explanation: As the sequence is already sorted so there is no inversion count.
    public static void main(String[] args) {
        int[] arr = {2 ,4 ,1 ,3 ,5};
        int i = inversionCount(arr);
        System.out.println(i);
    }

    static int inversionCount(int[] arr) {
        // Your Code Here
        int count = 0;
        int l = 0;
        int r = arr.length - 1;
        return mergeSort(arr, l, r);
    }

    private static int mergeSort(int[] arr, int l, int r) {
        int invCount = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            invCount += mergeSort(arr, l, m);
            invCount += mergeSort(arr, m + 1, r);
            invCount += mergeArray(arr, l, m, r);
        }
        return invCount;
    }

    private static int mergeArray(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int k = l, i = 0, j = 0, invCount = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                invCount += (n1 - i);
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }

        return invCount;
    }
}
