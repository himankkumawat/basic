package com.himank.patterns;

public class Pattern33 {

    public static void main(String[] args) {
        int i, j, n = 5, k;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < n - i; j++)
                System.out.print(" ");
            k = 64 + i;
            for (j = 1; j <= i; j++) {
                System.out.print((char) k);
                k++;
            }
            System.out.println();
        }
    }

//    Output:
//               A
//              BC
//             CDE
//            DEFG
//           EFGHI
}
