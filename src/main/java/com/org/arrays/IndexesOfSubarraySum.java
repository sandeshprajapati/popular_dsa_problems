package com.org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IndexesOfSubarraySum {
	/*
	 * Given an array arr[] containing only non-negative integers, your task is to
	 * find a continuous subarray (a contiguous sequence of elements) whose sum
	 * equals a specified value target. You need to return the 1-based indices of
	 * the leftmost and rightmost elements of this subarray. You need to find the
	 * first subarray whose sum is equal to the target.
	 * 
	 * Note: If no such array is possible then, return [-1].
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [1, 2, 3, 7, 5], target = 12 Output: [2, 4] Explanation: The
	 * sum of elements from 2nd to 4th position is 12.
	 * 
	 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15 Output: [1, 5]
	 * Explanation: The sum of elements from 1st to 5th position is 15.
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int target = 12;
		List<Integer> subarraySum = IndexesOfSubarraySum.subarraySum(arr, target);
		System.out.println(subarraySum.toString());
	}

	public static List<Integer> subarraySum(int[] arr, int target) {
		int s = 0;
		int e = 0;
		int sum = 0;
		List<Integer> ans = new ArrayList<>();
		for (e = 0; e < arr.length; e++) {
			sum += arr[e];

			while (sum > target && s <= e) {
				sum -= arr[s];
				s++;
			}

			if (sum == target) {
				ans.add(s + 1);
				ans.add(e + 1);
				return ans;
			}

		}
		return new ArrayList<>(Collections.singletonList(-1));

	}

}
