package com.org.arrays;

public class LongestCommonPrefix {

    //Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".
    //
    //Examples :
    //
    //Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
    //Output: "gee"
    //Explanation: "gee" is the longest common prefix in all the given strings.
    //
    //Input: arr[] = ["hello", "world"]
    //Output: ""
    //Explanation: There's no common prefix in the given strings.

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] arr) {
        // code here
        int n = arr.length;
        String firstWords = arr[0];
        for (int i = 0; i < firstWords.length(); i++) {
            for (int j = 1; j < n; j++) {
                if (i > arr[j].length() || firstWords.charAt(i) != arr[j].charAt(i)) {
                    return firstWords.substring(0, i);
                }

            }

        }
        return firstWords;
    }

}
