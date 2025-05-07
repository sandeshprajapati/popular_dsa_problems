package com.org.arrays;

public class LargestThreeElements {
    public static void main(String[] args) {
        int arr[] = {6, 3, 5, 1, 7, 5, 9};
        int n = findThirdLargestEle(arr);
        System.out.println(n);
    }

    private static int findThirdLargestEle(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third=second;
                second=first;
                first = num;

            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;

            }
        }
        System.out.println(third + "," + second + "," + first);
        return third;
    }
}
