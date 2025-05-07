package com.org.arrays;

import java.util.Arrays;

public class MoveAllZeros2End {
    //    Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
//    Examples:
//    Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//    Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
//    Explanation: There are three 0s that are moved to the end.
//    Input: arr[] = [10, 20, 30]
//    Output: arr[] = [10, 20, 30]
//    Explanation: No change in array as there are no 0s.
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZerosAtEnd(arr);
        System.out.println();
        pushZerosToEnd(arr);
    }

    private static void pushZerosToEnd(int[] arr) {
        int l=arr.length;
        int count=0;
        for (int i = 0; i < l; i++) {
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count<l){
            arr[count++]=0;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void moveZerosAtEnd(int[] arr) {
        int l=arr.length;
        int count=0;
        int [] ar=new int[l];
        int index=0;
        for (int i = 0; i < l; i++) {

            if (arr[i]==0){
                count++;
            }else {
                ar[index]=arr[i];
                index++;
            }
        }

        while (count>0){
            ar[index]=0;
            count--;
            index++;
        }
        Arrays.stream(ar).forEach(System.out::print);
    }
}
