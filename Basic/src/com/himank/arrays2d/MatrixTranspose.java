package com.himank.arrays2d;

public class MatrixTranspose {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        System.out.println("Original Matrix is ");
        m.displayMatrix(arr);
        transpose(arr);
        System.out.println("Transposed Matrix is ");
        m.displayMatrix(arr);
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
}
