package com.himank.arrays2d;

public class DiagonalBiggestElement {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        System.out.println("Original Matrix is ");
        m.displayMatrix(arr);
        int pbig = arr[0][0];
        int sbig = arr[arr.length - 1][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] > pbig)
                        pbig = arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    if (sbig < arr[i][j]) {
                        sbig = arr[i][j];
                    }
                }
            }
        }
        System.out.println("Primary Diagonal Biggest Element is " + pbig);
        System.out.println("Secondary Diagonal Biggest Element is " + sbig);
    }
}
