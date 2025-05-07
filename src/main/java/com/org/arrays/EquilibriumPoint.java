package com.org.arrays;

public class EquilibriumPoint {
    //Given an array of integers arr[], the task is to find the first equilibrium point in the array.
    //
    //The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.
    //
    //Examples:
    //
    //Input: arr[] = [1, 2, 0, 3]
    //Output: 2
    //Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
    //
    //Input: arr[] = [1, 1, 1, 1]
    //Output: -1
    //Explanation: There is no equilibrium index in the array.

    public static void main(String[] args) {
        //int[] arr = {1, 2, 0, 3};
        int[] arr = {1, 1, 1, 1};
        int i = findEquilibrium(arr);
        System.out.println(i);
        System.out.println("===");
        i = findEquilibriumV2(arr);
        System.out.println(i);
    }

    private static int findEquilibriumV2(int[] arr) {
        int l = arr.length;
        int tSum = 0;
        for (int i = 0; i < l; i++) {
            tSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < l; i++) {
            int rightSum = tSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static int findEquilibrium(int[] arr) {
        int l = arr.length;
        int[] lpf = new int[l];
        int[] rpf = new int[l];
        lpf[0] = arr[0];
        rpf[l - 1] = arr[l - 1];

        for (int i = 1; i < l; i++) {
            lpf[i] = lpf[i - 1] + arr[i];
        }
        for (int i = l - 2; i > 0; i--) {
            rpf[i] = rpf[i + 1] + arr[i];
        }

        for (int i = 0; i < l; i++) {
            if (lpf[i] == rpf[i]) {
                return i;
            }

        }
        return -1;
    }
}
