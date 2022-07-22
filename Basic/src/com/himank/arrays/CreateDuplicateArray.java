package com.himank.arrays;

import java.util.Scanner;

public class CreateDuplicateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = readArray();
        int[] brr = duplicateArray(arr);
        display(brr);
    }

    private static void display(int[] brr) {
        System.out.println("Duplicate Array is : ");
        for (int value : brr) {
            System.out.println(value);
        }
    }

    private static int[] duplicateArray(int[] arr) {
        int[] brr = new int[arr.length];
        System.arraycopy(arr, 0, brr, 0, arr.length);
        return brr;
    }

    private static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
