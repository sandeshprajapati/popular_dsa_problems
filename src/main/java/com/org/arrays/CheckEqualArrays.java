package com.org.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckEqualArrays {

    public static void main(String[] args) {

    }

    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        int n = a.length;
        Map<Integer, Integer> feqMap = new HashMap<>();

        if (a.length != b.length) return false;

        Map<Integer, Integer> freqMapA = new HashMap<>();
        Map<Integer, Integer> freqMapB = new HashMap<>();

        // Count frequency of elements in a[]
        for (int num : a) {
            freqMapA.put(num, freqMapA.getOrDefault(num, 0) + 1);
        }

        // Count frequency of elements in b[]
        for (int num : b) {
            freqMapB.put(num, freqMapB.getOrDefault(num, 0) + 1);
        }

        // Compare both maps
        return freqMapA.equals(freqMapB);
    }
}
