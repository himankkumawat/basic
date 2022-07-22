package com.himank.arrays;

import java.util.Scanner;

public class MergeArrayInSortedForm {

    public static void main(String[] args) {
        int[] a = readArr();
        int[] b = readArr();
        int[] c = merge(a, b);
        System.out.println("Merge Sorted Array is : ");
        for (int value : c) {
            System.out.println(value);
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0, m = 0, n = 0; i < c.length; i++) {
            if (m < a.length && n < b.length) {
                if (a[m] < b[n]) {
                    c[i] = a[m];
                    m++;
                } else {
                    c[i] = b[n];
                    n++;
                }
            } else if (m < a.length) {
                c[i] = a[m];
                m++;
            } else {
                c[i] = b[n];
                n++;
            }
        }
        return c;
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
}
