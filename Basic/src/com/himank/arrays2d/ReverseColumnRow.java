package com.himank.arrays2d;

import java.util.Scanner;

public class ReverseColumnRow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        System.out.println("Original Matrix is ");
        m.displayMatrix(arr);
        System.out.println("Press 1 to reverse Row wise");
        System.out.println("Press 2 to reverse Column wise");
        int n = sc.nextInt();
        System.out.println("Modified array is ");
        if (n == 1) {
            reverseRows(arr);
        } else if (n == 2) {
            reverseColumn(arr);
        } else
            System.out.println("Wrong Choice");
        m.displayMatrix(arr);
    }

    private static void reverseRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[i][arr[i].length - j - 1];
                arr[i][arr[i].length - j - 1] = t;
            }
        }
    }

    private static void reverseColumn(int[][] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[arr[i].length - i - 1][j];
                arr[arr[i].length - i - 1][j] = t;
            }
        }
    }
}
