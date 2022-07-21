package com.himank.arrays;

import java.util.Scanner;

public class PerfectNoInArray {

    public static void main(String[] args) {
        int[] arr = readArray();
        int count = countPerfect(arr);
        System.out.println("Total Perfect Numbers in Array is : " + count);
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

    private static int countPerfect(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (isPerfect(value))
                count++;
        }
        return count;
    }

    private static boolean isPerfect(int no) {
        int sum = 0;
        for (int i = 1; i < no - 1; i++) {
            if (no % i == 0)
                sum = sum + i;
        }
        return sum == no;
    }
}
