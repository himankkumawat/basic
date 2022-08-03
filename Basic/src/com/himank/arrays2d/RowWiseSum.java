package com.himank.arrays2d;

public class RowWiseSum {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        rowWiseSum(arr);
    }

    private static void rowWiseSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row is " + sum);
        }
    }
}
