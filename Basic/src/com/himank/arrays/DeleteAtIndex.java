package com.himank.arrays;

import java.util.Scanner;

public class DeleteAtIndex {

    public static void main(String[] args) {
        int[] arr = readArray();
        arr = delete(arr);
        displayArray(arr);
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int[] delete(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.println("Enter the index of the element you want to delete");
        int ind = sc.nextInt();
        int[] brr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (i < ind)
                brr[i] = arr[i];
            else
                brr[i] = arr[i + 1];
        }
        return brr;
    }

    static void displayArray(int[] arr) {
        System.out.println("Array after deleting elements are : ");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
