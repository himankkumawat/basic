package com.himank.arrays;

import java.util.Scanner;

public class Combine2Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = readArray(1);
        int[] brr = readArray(2);
        int[] crr = combine(arr, brr);
        display(crr);
    }

    private static int[] readArray(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in " + x + " Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int[] combine(int[] arr, int[] brr) {
        int l1 = arr.length;
        int l2 = brr.length;
        int[] crr = new int[l1 + l2];
        System.arraycopy(arr, 0, crr, 0, l1);
        System.arraycopy(brr, 0, crr, l1, l2);
        /*
         * for(int i=0;i<crr.length;i++){
         * if(i<a.length)
         * crr[i]=arr[i];
         * else
         * crr[i]=brr[i-arr.length];
         * }
         */
        return crr;
    }

    private static void display(int[] brr) {
        System.out.println("Combined Array is : ");
        for (int value : brr) {
            System.out.println(value);
        }
    }
}
