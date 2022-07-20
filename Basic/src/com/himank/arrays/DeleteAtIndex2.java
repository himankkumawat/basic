package com.himank.arrays;

import java.util.Scanner;

public class DeleteAtIndex2 {

    public static void main(String[] args) {
        DeleteAtIndex2 d = new DeleteAtIndex2();
        int[] arr = d.readArray();
        arr = d.delete(arr);
        d.displayArray(arr);
    }

    int[] readArray() {
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

    int[] delete(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int[] brr = new int[n - 1];
        System.out.println("Press 1 to delete by index");
        System.out.println("Press 2 to delete by element");
        int no = sc.nextInt();
        if (no == 1)
            brr = delIndex(arr);
        else if (no == 2)
            brr = delElement(arr);
        else {
            System.out.println("Wrong Choice");
            arr = delete(arr);
        }
        return brr;
    }

    int[] delIndex(int[] brr) {
        Scanner sc = new Scanner(System.in);
        int n = brr.length;
        int[] crr = new int[n - 1];
        System.out.println("Enter the index of the element you want to delete");
        int ind = sc.nextInt();
        if (ind >= n || ind < 0) {
            System.out.println("Wrong Index Input");
            crr = delIndex(brr);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (i < ind)
                    crr[i] = brr[i];
                else
                    crr[i] = brr[i + 1];
            }
        }
        return crr;
    }

    int[] delElement(int[] brr) {
        Scanner sc = new Scanner(System.in);
        int n = brr.length;
        int[] crr = new int[n - 1];
        System.out.println("Enter the element you want to delete");
        int ele = sc.nextInt();
        int ind = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (ele == brr[i]) {
                ind = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Wrong choice");
            System.out.println("Element not present in the Array");
            crr = delElement(brr);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (i < ind)
                    crr[i] = brr[i];
                else
                    crr[i] = brr[i + 1];
            }
        }
        return crr;
    }

    void displayArray(int[] arr) {
        int n = arr.length;
        System.out.println("Array after deleting elements are : ");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
