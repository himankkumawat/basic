package com.himank.arrays;

import java.util.Scanner;

public class NthSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = readArray();
        System.out.println("Enter the n value to find the nth smallest");
        int n = sc.nextInt();
        int no = nthSmallest(arr, n);
        if (no == -1)
            System.out.println("Wrong Input");
        else
            System.out.println(n + "th Smallest is : " + no);
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

    private static int nthSmallest(int[] arr, int n) {
        for (int value : arr) {
            int count = 0;
            for (int i : arr) {
                if (i > value)
                    count++;
            }
            if (count == arr.length - n)
                return value;
        }
        return -1;
    }
}
