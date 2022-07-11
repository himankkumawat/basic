package com.himank.patterns;

public class Pattern23 {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//          Output:
//                1
//               12
//              123
//             1234
//            12345
}
