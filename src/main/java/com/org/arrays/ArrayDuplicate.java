package com.org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicate {

	/*
	 * Given an array arr of integers, find all the elements that occur more than
	 * once in the array. If no element repeats, return an empty array.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [2, 3, 1, 2, 3] Output: [2, 3] Explanation: 2 and 3 occur more
	 * than once in the given array.
	 * 
	 * Input: arr[] = [0, 3, 1, 2] Output: [] Explanation: There is no repeating
	 * element in the array, so the output is empty.
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 3 };
		System.out.println(ArrayDuplicate.findDuplicates(arr));
	}

	public static List<Integer> findDuplicates(int[] arr) {
		int n = arr.length;
		List<Integer> d = new ArrayList<>();
		if (n == 1) {
			return new ArrayList<>(Arrays.asList(arr[0]));
		}
		Set<Integer> seen = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (!seen.add(arr[i])) {
				d.add(arr[i]);
			}
		}
		return d;

	}
}
