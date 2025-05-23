package com.org.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    //Given an array arr[ ] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
    //If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.
    //
    //Examples
    //
    //Input: arr[] = [1, 3, 2, 4]
    //Output: [3, 4, 4, -1]
    //Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        final ArrayList<Integer> integers = nextLargerElement(arr);
        System.out.println(String.join(", ", integers.stream().map(String::valueOf).toArray(String[]::new)));
    }

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                int peek = stack.peek();
                result.add(peek);
            }

            stack.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}
