package com.org.arrays;

import java.util.Arrays;

public class MinimizeTheHeightsI {
    //Given a array arr[] and positive integer k denoting heights of towers, you have to modify the height of each tower either by increasing or decreasing them by k only once.
    //
    //Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
    //
    //Note: A slight modification of the problem can be found here.
    //
    //Examples:
    //
    //Input: arr[] = [1, 5, 8, 10], k = 2
    //Output: 5
    //Explanation: The array can be modified as [3, 3, 6, 8]. The difference between the largest and the smallest is 8 - 3 = 5.
    //
    //Input: arr[] = [3, 9, 12, 16, 20], k = 3
    //Output: 11
    //Explanation: The array can be modified as [6, 12, 9, 13, 17]. The difference between the largest and the smallest is 17 - 6 = 11.
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;

        final int minDiff = getMinDiff(arr, k);
        System.out.println(minDiff);
    }

    public static int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int result = arr[n - 1] - arr[0];
        //swap if smallest is greater the largest
        if (smallest > largest) {
            int temp = smallest;
            smallest = largest;
            largest = temp;

        }

        //Traverse the middle elements
        for (int i = 1; i < n - 1; i++) {
            int sub = arr[i] - k;
            int add = arr[i] + k;

            if (smallest >= sub || largest <= add) {
                continue;
            }

            //Decide to update smallest or largest
            if ((largest - sub) <= (add - smallest)) {
                smallest = sub;
            } else {
                largest = add;
            }
        }
        return Math.min(result, largest - smallest);
    }

}
