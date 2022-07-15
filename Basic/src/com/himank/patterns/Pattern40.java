package com.himank.patterns;

public class Pattern40 {

    public static void main(String[] args) {
        int i, j, n = 7, k = 1, s = n / 2, l = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= k; j++) {
                System.out.print((char) (l + 64));
            }
            System.out.println();
            if (i <= n / 2) {
                s--;
                l++;
                k = k + 2;
            } else {
                s++;
                l--;
                k = k - 2;
            }
        }
    }

//              Output:
//               A
//              BBB
//             CCCCC
//            DDDDDDD
//             CCCCC
//              BBB
//               A
}
