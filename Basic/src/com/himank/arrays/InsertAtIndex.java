package com.himank.arrays;

import java.util.Scanner;

public class InsertAtIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements is Original Array");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = insert(arr);
        display(arr);
    }

    private static int[] insert(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to insert");
        int ele = sc.nextInt();
        int n = arr.length;
        System.out.println("Enter the index at which you want to insert");
        int ind = sc.nextInt();
        int[] brr = new int[n + 1];
        if (ind < 0 || ind > n) {
            System.out.println("Wrong index");
            return insert(arr);
        } else if (ind < n) {
            for (int i = 0; i < n; i++) {
                if (i < ind)
                    brr[i] = arr[i];
                else
                    brr[i + 1] = arr[i];
            }
            brr[ind] = ele;
        }
        return brr;
    }

    private static void display(int[] arr) {
        System.out.println("Array without Duplicates");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
