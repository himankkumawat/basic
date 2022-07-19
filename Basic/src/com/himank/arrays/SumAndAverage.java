package com.himank.arrays;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0, avg;
        System.out.println("Enter the number of elementes ");
        n = sc.nextInt();
        double arr[] = new double[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
