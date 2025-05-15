package com.org.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSumPairswith0Sum {
    //Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
    //
    //Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.
    //
    //Examples:
    //
    //Input: arr = [-1, 0, 1, 2, -1, -4]
    //Output: [[-1, 1]]
    //Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
    //arr[2] + arr[4] = 1 + (-1) = 0.
    //The distinct pair are [-1,1].

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        final ArrayList<ArrayList<Integer>> pairs = getPairs(arr);
        pairs.forEach(e -> e.forEach(System.out::println));


    }

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Set<ArrayList<Integer>> uniquePairs = new TreeSet<>((o1, o2) -> {
            if (!o1.get(0).equals(o2.get(0))) {
                return o1.get(0) - o2.get(0);
            }
            return o1.get(1) - o2.get(1);
        });
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = -num;
            if (seen.contains(complement)) {
                //get a pair

                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(a);
                pair.add(b);
                uniquePairs.add(pair);
            }
            seen.add(num);
        }

        return new ArrayList<>(uniquePairs);
    }
}
