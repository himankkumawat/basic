package com.himank.arrays;

import java.util.Scanner;

public class NegativePositiveArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int c[]=new int[3];
        int c[] = positive(arr);
        System.out.println("Negative Numbers are : " + c[0]);
        System.out.println("Positive Numbers are : " + c[1]);
        System.out.println("Number of '0's are : " + c[2]);
    }

    private static int[] positive(int arr[]) {
        int c[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                c[0]++;
            else if (arr[i] > 0)
                c[1]++;
            else
                c[2]++;
        }
        return c;
    }
}
