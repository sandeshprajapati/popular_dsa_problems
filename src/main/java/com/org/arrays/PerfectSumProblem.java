package com.org.arrays;

public class PerfectSumProblem {
    //Given an array arr of non-negative integers and an integer target, the task is to count all subsets of the array whose sum is equal to the given target.
    //
    //Examples:
    //
    //Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
    //Output: 3
    //Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.
    //
    //Input: arr[] = [2, 5, 1, 4, 3], target = 10
    //Output: 3
    //Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8};
        int target = 10;
        final int i = perfectSum(arr, target);
        System.out.println(i);

    }

    public static int perfectSum(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];

        // Initialize dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // One way to make sum 0: choose no elements
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j]; // Exclude current element
                if (nums[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]]; // Include current element
                }
            }
        }

        return dp[n][target];
    }
}
