package com.himank.arrays;

import java.util.Scanner;

public class SwapHalfArray {

    public static void main(String[] args) {
        int[] arr = readArray();
        swap(arr);
        displayArray(arr);
    }

    private static int[] readArray() {
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

    private static void displayArray(int[] arr) {
        int n = arr.length;
        System.out.println("Array after deleting elements are : ");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static void swap(int[] arr) {
        int temp, n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[i + n / 2 + n % 2];
            arr[i + n / 2 + n % 2] = temp;
        }
    }
}
