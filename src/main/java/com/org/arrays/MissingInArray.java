package com.org.arrays;

public class MissingInArray {

	/*
	 * You are given an array arr of size n - 1 that contains distinct integers in
	 * the range from 1 to n (inclusive). This array represents a permutation of the
	 * integers from 1 to n with one element missing. Your task is to identify and
	 * return the missing element.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [1, 2, 3, 5] Output: 4 Explanation: All the numbers from 1 to
	 * 5 are present except 4.
	 * 
	 * Input: arr[] = [8, 2, 4, 5, 3, 7, 1] Output: 6 Explanation: All the numbers
	 * from 1 to 8 are present except 6.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int missingNumber = MissingInArray.missingNumber(arr);
		System.out.println(missingNumber);
	}

	static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		long cSum = 0;
		for (int i = 0; i < arr.length; i++) {
			cSum += arr[i];
		}
		long tSum = (long) n * (n + 1) / 2;
		return (int) (tSum - cSum);

	}

}
