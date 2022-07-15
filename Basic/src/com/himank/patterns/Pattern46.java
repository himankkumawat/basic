package com.himank.patterns;

public class Pattern46 {

    public static void main(String[] args) {
        int i, j, n = 7, k = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i || j == n - 1 - i || i == 0 || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

//    Output:
//            * * * * * * *
//            * *      *  *
//            *   *   *   *
//            *     *     *
//            *   *   *   *
//            * *      *  *
//            * * * * * * *
}
