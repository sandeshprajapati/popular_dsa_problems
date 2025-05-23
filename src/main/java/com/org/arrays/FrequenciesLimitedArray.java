package com.org.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequenciesLimitedArray {
    //You are given an array arr[] containing positive integers. The elements in the array arr[] range from 1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your task is to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).
    //
    //Examples
    //
    //Input: arr[] = [2, 3, 2, 3, 5]
    //Output: [0, 2, 2, 0, 1]
    //Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        frequencyCount(arr).forEach(System.out::println);
        System.out.println("===");
        countFrequencies(arr).forEach(System.out::println);
    }

    public static List<Integer> frequencyCount(int[] arr) {

        Map<Integer, Integer> feq = new HashMap<>();
        for (int j : arr) {
            feq.put(j, feq.getOrDefault(j, 0) + 1);
        }
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= arr.length; i++) {
            al.add(feq.getOrDefault(i, 0));


        }
        return al;
    }

    public static List<Integer> countFrequencies(int[] arr) {
        int n = arr.length;
        int[] feq = new int[n];
        for (int num : arr) {
            if (num > 0 && num <= n) {
                feq[num - 1]++;
            }
        }
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(feq[i]);
        }
        return al;
    }


}
