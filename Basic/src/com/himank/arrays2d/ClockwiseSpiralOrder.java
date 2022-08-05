package com.himank.arrays2d;

//        1 2 3
//        4 5 6
//        7 8 9
//        To
//        1 2 3 6 9 8 7 4 5
public class ClockwiseSpiralOrder {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        System.out.println("Matrix Entered is ");
        m.displayMatrix(arr);
        displaySpiral(arr);
    }

    private static void displaySpiral(int[][] arr) {
        int n = arr.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++)
                System.out.print(arr[i][k] + " ");
            for (int k = i; k < j; k++)
                System.out.print(arr[k][j] + " ");
            for (int k = j; k > i; k--)
                System.out.print(arr[j][k] + " ");
            for (int k = j; k > i; k--)
                System.out.print(arr[k][i] + " ");
        }
        if (n % 2 != 0)
            System.out.print(arr[n / 2][n / 2] + " ");
    }
}
