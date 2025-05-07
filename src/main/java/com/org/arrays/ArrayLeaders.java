package com.org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLeaders {

	/*
	 * You are given an array arr of positive integers. Your task is to find all the
	 * leaders in the array. An element is considered a leader if it is greater than
	 * or equal to all elements to its right. The rightmost element is always a
	 * leader.
	 * 
	 * Examples:
	 * 
	 * Input: arr = [16, 17, 4, 3, 5, 2] Output: [17, 5, 2] Explanation: Note that
	 * there is nothing greater on the right side of 17, 5 and, 2.
	 * 
	 * Input: arr = [10, 4, 2, 4, 1] Output: [10, 4, 4, 1] Explanation: Note that
	 * both of the 4s are in output, as to be a leader an equal element is also
	 * allowed on the right. side
	 */
	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		System.out.println(ArrayLeaders.leaders(arr));
	}

	static ArrayList<Integer> leaders(int arr[]) {

		ArrayList<Integer> leaders = new ArrayList<>();
		int n = arr.length;
		if (n == 1) {
			return new ArrayList<>(Arrays.asList(arr[0]));
		}

		int lead = arr[n - 1];
		leaders.add(lead);
		for (int i = n - 2; i >= 0; i--) {
			if (lead <= arr[i]) {
				leaders.add(arr[i]);
				lead = arr[i];
				
			}

		}
		Collections.reverse(leaders);
		return leaders;
	}

}
