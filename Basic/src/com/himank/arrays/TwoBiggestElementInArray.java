package com.himank.arrays;

import java.util.Scanner;

public class TwoBiggestElementInArray {

    public static void main(String[] args) {
        int[] arr = readArr();
        int se1 = big(arr, 0);
        int se2 = big(arr, 1);
        System.out.println("Biggest Element is " + se1);
        System.out.println("Second Biggest Element is " + se2);
    }

    private static int[] readArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    private static int big(int[] arr, int n) {
        for (int value : arr) {
            int count = 0;
            for (int i : arr) {
                if (i > value)
                    count++;
            }
            if (count == n)
                return value;
        }
        return -1;
    }
}
