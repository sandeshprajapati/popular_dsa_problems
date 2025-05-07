package com.org.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {
    public static void main(String[] args) {
        String s = "aaabbcddeeeeeeeeeef";
        solution(s);
    }

    private static void solution(String s) {

        int count = 1;
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(map);
        map.forEach((k,v)->{
            sb.append(k+""+v);
        });
        System.out.println(sb);
    }
}
