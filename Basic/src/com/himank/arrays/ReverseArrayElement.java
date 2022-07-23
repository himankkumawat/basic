package com.himank.arrays;

import java.util.Scanner;

public class ReverseArrayElement {

    public static void main(String[] args) {
        int[] arr = readArray();
        reverse(arr);
        displayArray(arr);
    }

    private static void reverse(int[] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        // changes happen to memory location so, no need to return the arr[].
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
        System.out.println("Array after deleting elements are : ");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
