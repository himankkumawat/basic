package com.himank.arrays;

import java.util.Scanner;

public class ZigzagArray {

    public static void main(String[] args) {
        int[] a = readArr();
        int[] b = readArr();
        int[] c = zigzag(a, b);
        System.out.println("zigzag array is ");
        for (int value : c) {
            System.out.println(value);
        }
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

    private static int[] zigzag(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0, a1 = 0, b1 = 0; i < c.length; ) {
            if (a1 < a.length) {
                c[i] = a[a1];
                a1++;
                i++;
            }
            if (b1 < b.length) {
                c[i] = b[b1];
                b1++;
                i++;
            }
        }
        return c;
    }
}
