package com.himank.arrays2d;

public class RowBiggestElement {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        rowWiseBig(arr);
    }

    private static void rowWiseBig(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int big = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (big < arr[i][j]) big = arr[i][j];
            }
            System.out.println("Biggest element of " + (i + 1) + " row is " + big);
        }
    }
}
