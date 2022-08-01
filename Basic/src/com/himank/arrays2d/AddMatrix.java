package com.himank.arrays2d;

public class AddMatrix {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = m.readMatrix();
        int[][] brr = m.readMatrix();
        if (arr.length != brr.length || arr[0].length != brr[0].length) {
            System.out.println("Addition not possible");
        } else {
            System.out.println("Added Matrix is:");
            addMatrix(arr, brr);
            m.displayMatrix(arr);
        }
        System.out.println("Biggest element in the sum matrix is : " + biggestEle(arr));
    }

    private static void addMatrix(int[][] arr, int[][] brr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] += brr[i][j];
            }
        }
    }

    private static int biggestEle(int[][] arr) {
        int big = arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (big < ints[j]) {
                    big = ints[j];
                }
            }
        }
        return big;
    }
}
