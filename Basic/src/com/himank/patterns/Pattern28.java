package com.himank.patterns;

public class Pattern28 {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//              Output:
//                *
//               ***
//              *****
//             *******
//            *********
}
