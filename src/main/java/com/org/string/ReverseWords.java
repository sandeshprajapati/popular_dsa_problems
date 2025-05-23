package com.org.string;

public class ReverseWords {
    public static void main(String[] args) {
        String s = " i like this program very much ";
        //Output: "much very program this like i"
        final String s1 = reverseWords(s);
        System.out.println(s1);

    }

    public static String reverseWords(String s) {
        // Code here
        StringBuilder sb = new StringBuilder();
        final String[] s1 = s.trim().split(" ");
        for (int i = s1.length - 1; i >= 0; i--) {
            if (!s1[i].isEmpty()) {
                sb.append(s1[i]);
                if (i > 0) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString();
    }
}
