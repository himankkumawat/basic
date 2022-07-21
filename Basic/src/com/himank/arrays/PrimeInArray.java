package com.himank.arrays;

import java.util.Scanner;

public class PrimeInArray {

    public static void main(String[] args) {
        int[] arr = readArray();
        primeArr(arr);
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

    private static void primeArr(int[] arr) {
        int count = 0;
        System.out.println("Prime Numbers are : ");
        for (int value : arr) {
            if (isPrime(value)) {
                System.out.println(value);
                count++;
            }
        }
        System.out.println("Total number of prime numbers are : " + count);
    }

    private static boolean isPrime(int no) {
        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0)
                return false;
        }
        return true;
    }
}
