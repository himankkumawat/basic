package com.himank.patterns;

public class Pattern34 {

    public static void main(String[] args) {
        int i, j, n = 7, k = 1, s = n / 2;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                s--;
                k = k + 2;
            } else {
                s++;
                k = k - 2;
            }
        }
    }

//    Output:
//               *
//              ***
//             *****
//            *******
//             *****
//              ***
//               *
}
