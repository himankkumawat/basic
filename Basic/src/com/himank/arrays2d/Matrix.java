package com.himank.arrays2d;

import java.util.Scanner;

public class Matrix {

    public int[][] readMatrix() {
        System.out.println("Enter number of rows.");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter number of columns.");
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];
        System.out.println("Enter elements of array.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public void displayMatrix(int[][] arr) {
        System.out.println("Displaying matrix element.");
        for (int[] row : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(row[j] + "    ");
            }
            System.out.println();
        }
    }
}
