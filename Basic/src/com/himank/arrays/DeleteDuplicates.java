package com.himank.arrays;

import java.util.Scanner;

public class DeleteDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elememts");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int no = remove(arr);
        display(arr, no);
    }

    private static int remove(int[] arr) {
        int i, j, n = arr.length;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {// Shifting the values to left
                        arr[k] = arr[k + 1];
                    }
                    // arr[j]=arr[n-1]; This will exchange the values with the last one.
                    j--;
                    n--;
                }
            }
        }
        return n;
    }

    private static void display(int[] arr, int no) {
        System.out.println("Array without Duplicates");
        for (int i = 0; i < no; i++) {
            System.out.println(arr[i]);
        }
    }
}
