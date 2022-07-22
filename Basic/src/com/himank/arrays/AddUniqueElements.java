package com.himank.arrays;

import java.util.Scanner;

public class AddUniqueElements {

    public static void main(String[] args) {
        int[] arr = readArray();
        int sum = addUnique(arr);
        System.out.println("Sum of unique elements is " + sum);
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

    private static int addUnique(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int find = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    find = 1;
                    arr[j] = 0;
                }
            }
            if (find == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
