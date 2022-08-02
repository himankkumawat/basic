package com.himank.arrays2d;

public class SubtractMatrix {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        int[][] brr = m.readMatrix();
        if (arr.length != brr.length || arr[0].length != brr[0].length) {
            System.out.println("Addition not possible");
        } else {
            System.out.println("Subtracted Matrix is: ");
            subMatrix(arr, brr);
            m.displayMatrix(arr);
        }
    }

    private static void subMatrix(int[][] arr, int[][] brr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] -= brr[i][j];
            }
        }
    }
}
