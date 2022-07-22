package com.himank.arrays;

import java.util.Scanner;

public class OccurrenceOfElement {

    public static void main(String[] args) {
        int[] a = readArr();
        occurrence(a);
    }

    private static int[] readArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    private static void occurrence(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    c++;
                    a[j] = a[n - 1];
                    n--;
                    j--;
                }
            }
            System.out.println(a[i] + " is repeated by " + c + " times");
        }
    }
}
