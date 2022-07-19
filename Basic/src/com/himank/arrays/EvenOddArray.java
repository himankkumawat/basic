package com.himank.arrays;

import java.util.Scanner;

public class EvenOddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = evenOdd(arr);
        System.out.println("Even Numbers = " + c);
        System.out.println("Odd Numbers = " + (n - c));
    }

    private static int evenOdd(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                c++;
        }
        /*
        Method 2
        define a array of size 2;
        for(int i=0;i<n;i++)
        {
        c[arr[i]%2]++;
        */
        return c;
    }
}
