package com.himank.arrays;

import java.util.Scanner;

public class SumAndAverageInArray {

    public static void main(String[] args) {
        int[] arr = readArr();
        sumArray(arr);
    }

    private static void sumArray(int[] arr) {
        double sum = 0, count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                sum += value;
                count++;
            }
        }
        System.out.println("Sum of even Numbers in Array is " + sum);
        double avg = sum / count;
        System.out.println("Average of even Numbers in Array is " + avg);
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
}
