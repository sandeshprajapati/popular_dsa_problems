package com.org.string;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        final boolean b = areAnagrams(s1, s2);
        System.out.println(b);
    }

    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int l1 = s1.length();
        int l2 = s2.length();


        if (l1 != l2) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < l1; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < l2; i++) {
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
