package com.himank.patterns;

public class Pattern25 {

    public static void main(String[] args) {
        int i, j, n = 5, k = 65;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                System.out.print((char) k);
                k++;
            }
            System.out.println();
        }
    }

//           Output:
//                A
//               BC
//              DEF
//             GHIJ
//            KLMNO
}
