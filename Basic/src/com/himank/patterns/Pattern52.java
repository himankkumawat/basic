package com.himank.patterns;

public class Pattern52 {

    public static void main(String[] args) {
        int i, j, n = 13, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == n / 2 + 1 || j == n / 2 + 1 || j == 1 && i <= n / 2 || j == n && i > n / 2 || i == 1 && j > n / 2 || i == n && j <= n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

//            Output:
//        *           * * * * * * *
//        *           *
//        *           *
//        *           *
//        *           *
//        *           *
//        * * * * * * * * * * * * *
//                    *           *
//                    *           *
//                    *           *
//                    *           *
//                    *           *
//        * * * * * * *           *
}
