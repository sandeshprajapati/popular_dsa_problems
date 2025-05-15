package com.org.arrays;

import java.util.ArrayList;

public class Unionof2SortedArray {
    //Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
    //
    //    Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
    //
    //Examples:
    //
    //Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
    //Output: 1 2 3 4 5 6 7
    //Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};
        final ArrayList<Integer> union = findUnion(a, b);
        System.out.println(String.join(", ", union.stream().map(String::valueOf).toArray(String[]::new)));    }

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // add your code here
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int lastAdded = Integer.MIN_VALUE;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (a[i] != lastAdded) {
                    al.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
            } else if (a[i] > b[j]) {
                if (b[j] != lastAdded) {
                    al.add(b[j]);
                    lastAdded = b[j];
                }
                j++;
            } else {
                if (a[i] != lastAdded) {
                    al.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
                j++;
            }

        }
        while (i < n) {
            if (a[i] != lastAdded) {
                al.add(a[i]);
                lastAdded = a[i];
            }
            i++;
        }

        while (j < m) {
            if (b[j] != lastAdded) {
                al.add(b[j]);
                lastAdded = b[j];
            }
            j++;
        }
        return al;
    }
}
