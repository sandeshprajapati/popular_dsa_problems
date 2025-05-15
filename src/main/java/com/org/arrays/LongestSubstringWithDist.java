package com.org.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithDist {
    //Given a string s, find the length of the longest substring with all distinct characters.
    //
    //Examples:
    //
    //Input: s = "geeksforgeeks"
    //Output: 7
    //Explanation: "eksforg" is the longest substring with all distinct characters.
    //
    //Input: s = "aaa"
    //Output: 1
    //Explanation: "a" is the longest substring with all distinct characters.
    //
    //Input: s = "abcdefabcbb"
    //Output: 6
    //Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        final int i = longestUniqueSubstr(s);
        System.out.println(i);

    }

    public static int longestUniqueSubstr(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        while (end < n) {
            final char c = s.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }
}
