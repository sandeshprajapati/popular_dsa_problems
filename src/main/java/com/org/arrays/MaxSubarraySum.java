package com.org.arrays;

public class MaxSubarraySum {

	/*
	 * Given an integer array arr[]. You need to find the maximum sum of a subarray.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [2, 3, -8, 7, -1, 2, 3] Output: 11 Explanation: The subarray
	 * {7, -1, 2, 3} has the largest sum 11.
	 * 
	 * Input: arr[] = [-2, -4] Output: -2 Explanation: The subarray {-2} has the
	 * largest sum -2.
	 */

	public static void main(String[] args) {

		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(MaxSubarraySum.maxSubarraySum(arr));
	}

	private static int maxSubarraySum(int[] arr) {
		int currentSum = arr[0];
		int maxSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
