package com.org.arrays;

import java.util.Arrays;

public class Sort0s1sAnd2s {

	/*
	 * Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in
	 * ascending order.
	 * 
	 * You need to solve this problem without utilizing the built-in sort function.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [0, 1, 2, 0, 1, 2] Output: [0, 0, 1, 1, 2, 2] Explanation: 0s
	 * 1s and 2s are segregated into ascending order.
	 * 
	 * Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1] Output: [0, 0, 0, 0, 0,
	 * 1, 1, 1, 1, 1, 2, 2] Explanation: 0s 1s and 2s are segregated into ascending
	 * order.
	 * 
	 * Follow up: Could you come up with a one-pass algorithm using only constant
	 * extra space?
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2 };
		Sort0s1sAnd2s.sort012(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort012(int[] arr) {

		int n = arr.length;
		int low = 0;
		int mid = 0;
		int high = n - 1;
		while (mid <= high) {

			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				swap(arr, mid, high);
				high--;
			}

		}
	}

	private static void swap(int[] arr, int s, int m) {
		int t = arr[s];
		arr[s] = arr[m];
		arr[m] = t;

	}

}
