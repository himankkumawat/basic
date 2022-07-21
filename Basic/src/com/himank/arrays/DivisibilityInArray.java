package com.himank.arrays;

import java.util.Scanner;

public class DivisibilityInArray {

    public static void main(String[] args) {
        int[] arr = readArray();
        int n3, n4, n5;
        n3 = div(arr, 3);
        n4 = div(arr, 4);
        n5 = div(arr, 5);
        System.out.println("Count of numbers divisible by 3 are " + n3);
        System.out.println("Count of numbers divisible by 4 are " + n4);
        System.out.println("Count of numbers divisible by 5 are " + n5);
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

    private static int div(int[] arr, int no) {
        int count = 0;
        for (int value : arr) {
            if (value % no == 0)
                count++;
        }
        return count;
    }
}
