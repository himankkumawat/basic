package com.himank.patterns;

public class Pattern49 {

    public static void main(String[] args) {
        int i, j, n = 7, k = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == n / 2 || i == n / 2 || j == i || j == n - i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

//    Output:
//        *     *     *
//          *   *   *
//            * * *
//        * * * * * * *
//            * * *
//          *   *   *
//        *     *     *
}
