package com.himank.arrays;

import java.util.Scanner;

public class DigitsInArray {

    public static void main(String[] args) {
        int[] arr = readArray();
        int count = countDigits(arr);
        System.out.println("Total number of digits are : " + count);
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

    private static int countDigits(int[] arr) {
        int count = 0;
        System.out.println("Digits in array are : ");
        for (int value : arr) {
            if (value >= 0 && value <= 9) {
                count++;
                System.out.println(value);
            }
        }
        return count;
    }
}
