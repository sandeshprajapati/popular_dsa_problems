package com.org.string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "ky";
        final boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);

    }

    static boolean isPalindrome(String s) {
        int l = s.length() - 1;
        for (int i = 0; i <= l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i)) {
                return false;
            }
        }
        return true;
    }
}
