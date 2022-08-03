package com.himank.arrays2d;

public class ColumnLeastElement {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        System.out.println("Entered Matrix is : ");
        m.displayMatrix(arr);
        columnLeast(arr);
    }

    private static void columnLeast(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            int least = arr[i][0];
            for (int[] ints : arr) {
                if (least > ints[i]) {
                    least = ints[i];
                }
            }
            System.out.println("least of " + (i + 1) + " column is " + least);
        }
    }
}
