package com.org.arrays;

public class SecondLargest {

	/*
	 * Given an array of positive integers arr[], return the second largest element
	 * from the array. If the second largest element doesn't exist then return -1.
	 * 
	 * Note: The second largest element should not be equal to the largest element.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [12, 35, 1, 10, 34, 1] Output: 34 Explanation: The largest
	 * element of the array is 35 and the second largest element is 34.
	 * 
	 * Input: arr[] = [10, 5, 10] Output: 5 Explanation: The largest element of the
	 * array is 10 and the second largest element is 5.
	 */

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		System.out.println(SecondLargest.getSecondLargest(arr));
	}

	public static int getSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2)
			return -1;
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num < firstLargest) {
				secondLargest = num;
			}

		}

		return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;

	}
}
