package com.himank.arrays2d;

import java.util.Scanner;

public class MatrixRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        System.out.println("Original Matrix is ");
        m.displayMatrix(arr);
        System.out.println("Press 1 to Rotate 90 Degree Right");
        System.out.println("Press 2 to Rotate 90 Degree Left");
        int no = sc.nextInt();
        if (no == 1)
            rotate90DegreeRight(arr);
        else if (no == 2)
            rotate90DegreeLeft(arr);
        else
            System.out.println("Wrong choice");
        m.displayMatrix(arr);
    }

    private static void rotate90DegreeRight(int[][] arr) {
        transpose(arr);
        reverseRows(arr);
    }

    private static void rotate90DegreeLeft(int[][] arr) {
        transpose(arr);
        reverseColumn(arr);
    }

    private static void transpose(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
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
