package com.org.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {
    //Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.
    //
    //Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].
    //
    //Examples:
    //
    //Input: arr[] = [2, 2]
    //Output: [2, 1]
    //Explanation: Repeating number is 2 and smallest positive missing number is 1.
    public static void main(String[] args) {
        int[] arr = {2, 2};
        ArrayList<Integer> twoElement = findTwoElement(arr);
        twoElement.forEach(System.out::println);

        System.out.println("======V2+++++++++++++");
        ArrayList<Integer> twoElement1 = findTwoElementV2(arr);
        twoElement1.forEach(System.out::println);

    }

    static ArrayList<Integer> findTwoElementV2(int arr[]) {
        int n = arr.length;
        long A = (long) n * (n + 1) / 2;
        // SAFELY compute A2 = n(n+1)(2n+1)/6
        long A2 = (long) n;
        A2 = A2 * (n + 1);     // n(n+1)
        A2 = A2 * (2L * n + 1); // n(n+1)(2n+1)
        A2 = A2 / 6;           // Final division

        long B = 0, B2 = 0;
        for (int num : arr) {
            B += (long) num;
            B2 += (long) num * num;
        }

        long diff = B - A;            // b - a
        long squareDiff = B2 - A2;    // b^2 - a^2
        long sum = squareDiff / diff; // b + a

        long repeating = (sum + diff) / 2;
        long missing = repeating - diff;

        ArrayList<Integer> res = new ArrayList<>();
        res.add((int) repeating);
        res.add((int) missing);
        return res;
    }

    public static ArrayList<Integer> findTwoElement(int[] arr) {
        // code here
        int missing = -1;
        int repeting = -1;
        int n = arr.length;
        int[] hash = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 2) repeting = i;
            if (hash[i] == 0) missing = i;
        }
        return new ArrayList<>(Arrays.asList(repeting, missing));
    }
}
