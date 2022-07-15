package com.himank.patterns;

public class Pattern39 {

    public static void main(String[] args) {
        int i, j, n = 7, k = 1, s = n / 2, l = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            l = 1;
            for (j = 1; j <= k; j++) {
                System.out.print((char) (j + l + 63));
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

//           Output:
//               A
//              ABC
//             ABCDE
//            ABCDEFG
//             ABCDE
//              ABC
//               A
}
