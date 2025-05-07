package com.org.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 64};
        int target = 25;
        linearSearch(arr, target);
    }

    private static void linearSearch(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                return;
            }
        }
    }
}
