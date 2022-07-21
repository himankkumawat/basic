package com.himank.arrays;

import java.util.Scanner;

public class PalindromeInArray {

    public static void main(String[] args) {
        int[] arr = readArray();
        int count = isPalindrome(arr);
        System.out.println("Total Palindrome Numbers in Array are : " + count);
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

    private static int isPalindrome(int[] arr) {
        int count = 0;
        for (int value : arr) {
            int j = reverse(value);
            if (j == value) {
                count++;
            }
        }
        return count;
    }

    private static int reverse(int no) {
        int rem, rev = 0;
        while (no != 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no /= 10;
        }
        return rev;
    }
}
