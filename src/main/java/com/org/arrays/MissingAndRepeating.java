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
        ArrayList<Long> twoElement1 = findTwoElementV2(arr);
        twoElement1.forEach(System.out::println);

    }

    private static ArrayList<Long> findTwoElementV2(int[] arr) {

        //calculate n number sum using math formula
        int n = arr.length;
        long A = (long) n * (n + 1) / 2;
        long A2 = (long) n * (n + 1) * (2L * n + 1) / 6;

        long B = 0;
        long B2 = 0;
        for (int num : arr) {
            B += num;
            B2 += (long) num * num;
        }

        long ABDiff = B - A;
        long AB2Diff = B2 - A2;
        //b2-a2=(b-a)*(b+a)
        //ABDiff*(X+Y)=AB2Diff
        //B+A=AB2Diff/ABDiff
        long sum = AB2Diff / ABDiff;
        long repeating = (ABDiff + sum) / 2;
        long missing = sum - repeating;

        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);

        return new ArrayList<>(Arrays.asList(repeating, missing));
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
