package com.himank.patterns;

public class Pattern48 {

    public static void main(String[] args) {
        int i, j, n = 7;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == n / 2 || i == n / 2 || i == 0 || i == n - 1 || j == i || j == n - i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

//              Output:
//            * * * * * * *
//            * *   *   * *
//            *   * * *   *
//            * * * * * * *
//            *   * * *   *
//            * *   *   * *
//            * * * * * * *
}
