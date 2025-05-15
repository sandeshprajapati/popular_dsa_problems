package com.org.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySubset {
//Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
//
//Examples:
//
//Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
//Output: true
//Explanation: b[] is a subset of a[]
//
//Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
//Output: true
//Explanation: b[] is a subset of a[]

    public static void main(String[] args) {
        int a[] = {1, 2, 2};
        int b[] = {1, 1};
        final boolean subset = isSubset(a, b);
        System.out.println(subset);
    }

    public static boolean isSubset(int[] a, int[] b) {

        Map<Integer, Integer> feqMap = new HashMap<>();
        for (int n : a) {
            feqMap.put(n, feqMap.getOrDefault(n, 0) + 1);
        }

        for (int n:b){
            if (!feqMap.containsKey(n)  || feqMap.get(n)==0){
                return false;
            }

            feqMap.put(n, feqMap.get(n)-1);
        }

        return true;
    }

    public static boolean isSubset1(int a[], int b[]) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        boolean isSubSet = true;
        for (int i = 0; i < b.length; i++) {
            if (!set.contains(b[i])) {
                return false;
            }

        }
        return true;
    }


}
