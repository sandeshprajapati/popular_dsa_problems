package com.org.arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 3, 3, 2 };
		System.out.println(MajorityElement.majorityElement(arr));
	}

	static int majorityElement(int[] arr) {

		int vote = 0;
		int candidate = findCondidate(arr);

		for (int num : arr) {
			if (candidate == num) {
				vote++;
			}
		}
		return vote > arr.length / 2 ? candidate : -1;

	}

	private static int findCondidate(int[] arr) {
		int candidate = -1;
		int vote = 0;
		for (int num : arr) {

			if (vote == 0) {
				candidate = num;
				vote = 1;
			} else if (candidate == num) {
				vote++;
			} else {
				vote--;
			}

		}
		return candidate;
	}

}
