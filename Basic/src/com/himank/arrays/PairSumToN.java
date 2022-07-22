package com.himank.arrays;

import java.util.Scanner;

public class PairSumToN {

    public static void main(String[] args) {
        int[] arr = readArray();
        pairSum(arr);
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

    private static void pairSum(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Sum");
        int sum = sc.nextInt();
        int count = 0, k = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == sum) {
                        System.out.println(k + " Pair is : ");
                        System.out.println("First elements is " + arr[i]);
                        System.out.println("Second element is " + arr[j]);
                        count++;
                        k++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Wrong value of Sum");
            pairSum(arr);
        }
    }
}
