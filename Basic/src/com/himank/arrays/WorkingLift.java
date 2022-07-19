package com.himank.arrays;

import java.util.Scanner;

//WAP to read ‘n’ people’s weights based on that display lift is working or not. Max capacity of your lift is 800kg.
public class WorkingLift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Persons");
        int n = sc.nextInt();
        System.out.println("Enter the weight of Persons");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = lift(arr);
        if (c <= 800)
            System.out.println("Lift can work");
        else
            System.out.println("Lift Overloaded");
    }

    private static int lift(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
